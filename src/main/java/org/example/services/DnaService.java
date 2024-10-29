package org.example.services;

import jakarta.transaction.Transactional;
import org.example.entities.Base;
import org.example.entities.Dna;
import org.example.repositories.DnaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DnaService  {
    private DnaRepository dnaRepository;

    public DnaService(DnaRepository adnRepository){
        this.dnaRepository = adnRepository;
    }

    public static String revisarFilas (String[] dna ,int dimension,String letrasEncontradas) {
        boolean casillaDerecha = false;
        boolean casillaIzquierda = false;
        char aux;


        for (int i = 0; i < dimension; i++) {

            aux = dna[i].charAt(0);

            for (int j = 2; j < dimension; j = j + 2) {

                if (dna[i].charAt(j) == aux &&  ! letrasEncontradas.contains(""+dna[i].charAt(j))) {

                    if (aux == dna[i].charAt(j - 1)) {

                        casillaDerecha = false;
                        casillaIzquierda = false;

                        if (j > 3) {
                            casillaIzquierda = aux == dna[i].charAt(j - 3);
                        }
                        if (j < dimension - 1) {
                            casillaDerecha = dna[i].charAt(j + 1) == aux;
                        }
                        if (casillaDerecha || casillaIzquierda) {
                            letrasEncontradas = letrasEncontradas+aux;
                            if (letrasEncontradas.length() == 2) {
                                return letrasEncontradas;
                            }
                        }
                    }
                }
                aux = dna[i].charAt(j);
            }
        }


        return letrasEncontradas;
    }

    public static String revisarCulumnas (String[] dna ,int dimension,String letrasEncontradas) {
        boolean casillaAbajo = false;
        boolean casillaArriba = false;
        char aux;

        for (int j = 0; j < dimension; j++) {

            aux = dna[0].charAt(j);

            for (int i = 2; i < dimension; i = i + 2) {

                if (dna[i].charAt(j) == aux &&  ! letrasEncontradas.contains(""+dna[i].charAt(j))) {

                    if (aux == dna[i-1].charAt(j)) {

                        casillaAbajo = false;
                        casillaArriba = false;

                        if (i > 3) {
                            casillaArriba = aux == dna[i-3].charAt(j);
                        }
                        if (i < dimension - 1) {
                            casillaAbajo = dna[i+1].charAt(j) == aux;
                        }
                        if (casillaAbajo || casillaArriba) {
                            letrasEncontradas = letrasEncontradas + aux;
                            if (letrasEncontradas.length() == 2) {
                                return letrasEncontradas;
                            }
                        }
                    }
                }
                aux = dna[i].charAt(j);
            }
        }


        return letrasEncontradas;
    }
    public static String revisarDiagonales (String[] dna ,int dimension,String letrasEncontradas) {

        for(int j = 0;j <= dimension-4;j++){
            letrasEncontradas = revisarDiagonalDerecha(dna,dimension,0,j,letrasEncontradas);
            if(letrasEncontradas.length() >= 2){
                return letrasEncontradas;
            }
            letrasEncontradas = revisarDiagonalIzquierda(dna,dimension,0,j,letrasEncontradas);
            if(letrasEncontradas.length()>=2){
                return letrasEncontradas;
            }

        }
        for(int i = 1;i <= dimension-4;i++){
            letrasEncontradas= revisarDiagonalDerecha(dna,dimension,i,0,letrasEncontradas);
            if(letrasEncontradas.length()>=2){
                return letrasEncontradas;
            }
            letrasEncontradas= revisarDiagonalIzquierda(dna,dimension,i,0,letrasEncontradas);
            if(letrasEncontradas.length()>=2){
                return letrasEncontradas;
            }
        }

        return letrasEncontradas;
    }
    public static String revisarDiagonalDerecha(String[] dna, int dimension,int fila,int colum,String letrasEncontradas){
        boolean casillaArribaIzquierda;
        boolean casillaAbajoDerecha;
        char aux = dna[fila].charAt(colum);

        for(int k = 2; k<dimension-colum-fila; k = k+2){
            if (dna[k+fila].charAt(k+colum) == aux &&  ! letrasEncontradas.contains(""+dna[k+fila].charAt(k+colum))) {

                if (aux == dna[k+fila-1].charAt(k+colum-1)) {

                    casillaAbajoDerecha = false;
                    casillaArribaIzquierda = false;

                    if (k > 3) {
                        casillaArribaIzquierda = aux == dna[k+fila-3].charAt(k+colum-3);
                    }
                    if (k < dimension - 1 - fila - colum) {
                        casillaAbajoDerecha = dna[k+fila+1].charAt(k+colum+1) == aux;
                    }
                    if (casillaAbajoDerecha || casillaArribaIzquierda) {
                        letrasEncontradas = letrasEncontradas+aux;
                        if (letrasEncontradas.length() == 2) {
                            return letrasEncontradas;
                        }
                    }
                }
            }
            aux = dna[k+fila].charAt(k+colum);
        }
        return letrasEncontradas;
    }
    public static String revisarDiagonalIzquierda(String[] dna, int dimension,int fila,int colum,String letrasEncontradas){
        boolean casillaArribaDerecha;
        boolean casillaAbajoIzquierda;
        char aux = dna[fila].charAt(dimension-1-colum);

        for(int k = 2; k<dimension-colum-fila; k = k+2){
            if (dna[k+fila].charAt(dimension-1-k-colum) == aux &&  ! letrasEncontradas.contains(""+dna[k+fila].charAt(dimension-1-k-colum))) {

                if (aux == dna[k+fila-1].charAt(dimension-1-k-colum+1)) {

                    casillaAbajoIzquierda = false;
                    casillaArribaDerecha = false;

                    if (k > 3) {
                        casillaArribaDerecha = aux == dna[k+fila-3].charAt(dimension-1-k-colum+3);
                    }
                    if (k < dimension - 1 - fila - colum) {
                        casillaAbajoIzquierda = dna[k+fila+1].charAt(dimension-1-k-colum-1) == aux;
                    }
                    if (casillaAbajoIzquierda || casillaArribaDerecha) {
                        letrasEncontradas = letrasEncontradas+aux;
                        if (letrasEncontradas.length() == 2) {
                            return letrasEncontradas;
                        }
                    }
                }
            }
            aux = dna[k+fila].charAt(dimension-1-k-colum);
        }
        return letrasEncontradas;
    }

    public boolean analyzeDna(String[] dna){
        Optional<Dna> DnaExistente = dnaRepository.findByDna(dna);
        if(DnaExistente.isPresent()){
            return DnaExistente.get().isMutant();
        }

        boolean isMutant = isMutant(dna);
        Dna dnaEntity = Dna.builder()
                .dna(dna)
                .isMutant(isMutant)
                .build();
        dnaRepository.save(dnaEntity);

        return isMutant(dna);
    }

   public static boolean isMutant(String[] dna) {
        int dimension = dna.length;
        String letrasEncontradas = "";

        letrasEncontradas = revisarCulumnas(dna,dimension,letrasEncontradas);
        if(letrasEncontradas.length() > 1) return true;

        letrasEncontradas = revisarFilas(dna,dimension,letrasEncontradas);
        if(letrasEncontradas.length() > 1) return true;

        letrasEncontradas = revisarDiagonales(dna,dimension,letrasEncontradas);
        return (letrasEncontradas.length() > 1);
    }

}
