package com.azer.megrinBack.config;

import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.azer.megrinBack.service.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter{

    private final JwtService jwtService;
    private final UserDetailsService userDeatailsService;

    @SuppressWarnings("null")
    @Override
    protected void doFilterInternal(
        @NonNull HttpServletRequest request, 
        @NonNull HttpServletResponse response, 
        @NonNull FilterChain filterChain
    ) throws ServletException, IOException {
        if(request.getServletPath().contains("/api/v1/auth")){
            filterChain.doFilter(request, response);
            return;
        }

        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;

        if(authHeader != null && authHeader.startsWith("Bearer ")){

            jwt = authHeader.substring(7);
            userEmail = jwtService.extractUsername(jwt);

            if(userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){

                UserDetails userDetails = this.userDeatailsService.loadUserByUsername(userEmail);
                
                if (jwtService.isTokenValid(jwt, userDetails)) {

                    UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails, 
                        null, 
                        userDetails.getAuthorities()
                    );

                    authToken.setDetails(
                        new WebAuthenticationDetailsSource().buildDetails(request)
                    );
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                    System.out.println("Token is valid");
                }
            }

            filterChain.doFilter(request, response);            
        }
    }

}
