package com.azer.megrinBack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
        name = "player_sequence",
        sequenceName = "player_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "player_sequence"
    )
    private Long id;
    private Long userId;
    private Long positionId; // Position id is the id of the position the player plays in the team Exemple : 1 for goalkeeper, 2 for defender, 3 for midfielder, 4 for forward
    private int number; // Number is the number of the player in the team
    private Long groupId; // Groupe id is the id of the group the player belongs to Exemple : 1 for meniour, 2 for cadet, 3 for junior, 4 for senior
    private Long teamId;
}
