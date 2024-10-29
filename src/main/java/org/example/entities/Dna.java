package org.example.entities;

import jakarta.persistence.Entity;
import lombok.*;


import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@Getter
public class Dna extends Base implements Serializable {
    private String [] dna;
    private boolean isMutant;

}
