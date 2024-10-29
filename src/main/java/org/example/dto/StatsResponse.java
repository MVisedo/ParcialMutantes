package org.example.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StatsResponse {

    @JsonProperty("count_mutant_dna")
    private long counMutantDna;

    @JsonProperty("count_human_dna")
    private long countHumanDna;

    private double ratio;
}
