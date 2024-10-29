package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dto.DnaRequest;
import org.example.dto.DnaResponse;
import org.example.services.DnaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/mutant/")
public class DnaController {

    private DnaService dnaService;

    public DnaController(DnaService dnaService){
        this.dnaService = dnaService;
    }
    @PostMapping
    public ResponseEntity<DnaResponse> checkMutant(@Valid @RequestBody DnaRequest dnaRequest){
        boolean isMutant = dnaService.analyzeDna(dnaRequest.getDna());
        DnaResponse dnaResponse = new DnaResponse(isMutant);
        if(isMutant){
            return ResponseEntity.ok(dnaResponse);
        }else{
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }
    }
}
