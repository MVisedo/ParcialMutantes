package services;

import org.example.services.DnaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DnaServiceTest {

    @Test
    public void testColumnas(){
        String [] dna = {
                "AAAA",
                "CGCG",
                "CGCG",
                "CCCC"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void testFilas(){
        String [] dna = {
                "CAAG",
                "CGCG",
                "CGCG",
                "CCCG"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void testDiagonalDerecha(){
        String [] dna = {
                "ACGTAAC",
                "TACGATC",
                "CGCCGTA",
                "CCCTCGA",
                "AAATTTC",
                "ACGGGAA",
                "TTTCCGG"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void testDiagonalIzquierda(){
        String [] dna = {
                "ACGTAAT",
                "TATGATC",
                "CGCATTA",
                "CCATCGA",
                "AAATTTC",
                "ACGGGAA",
                "TTTCCGG"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void testFalso1(){
        String [] dna = {
                "AAAA",
                "CGCG",
                "CGCG",
                "AAAA"
        };
        assertFalse(DnaService.isMutant(dna));
    }
    @Test
    public void testFalso2(){
        String [] dna = {
                "AAGA",
                "CGCG",
                "CGCG",
                "CTCC"
        };
        assertFalse(DnaService.isMutant(dna));
    }

    //Pruebas unitarias propuestas por el profesor Cortez
    @Test
    public void test1(){
        String [] dna = {
                "AAAA",
                "CCCC",
                "TCAG",
                "GGTC"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void test2(){
        String [] dna = {
                "AAAT",
                "AACC",
                "AAAC",
                "CGGG"
        };
        assertFalse(DnaService.isMutant(dna));
    }
    @Test
    public void test3(){
        String [] dna = {
                "TGAC",
                "AGCC",
                "TGAC",
                "GGTC"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void test4(){
        String [] dna = {
                "AAAA",
                "AAAA",
                "AAAA",
                "AAAA"
        };
        assertFalse(DnaService.isMutant(dna));
    }
    @Test
    public void test5(){
        String [] dna = {
                "TGAC",
                "ATCC",
                "TAAG",
                "GGTC"
        };
        assertFalse(DnaService.isMutant(dna));
    }
    @Test
    public void test6(){
        String [] dna = {
                "TCGGGTGAT",
                "TGATCCTTT",
                "TACGAGTGA",
                "AAATGTACG",
                "ACGAGTGCT",
                "AGACACATG",
                "GAATTCCAA",
                "ACTACGACC",
                "TGAGTATCC"
        };
        assertTrue(DnaService.isMutant(dna));
    }
    @Test
    public void test7(){
        String [] dna = {
                "TTTTTTTTT",
                "TTTTTTTTT",
                "TTTTTTTTT",
                "TTTTTTTTT",
                "CCGACCAGT",
                "GGCACTCCA",
                "AGGACACTA",
                "CAAAGGCAT",
                "GCAGTCCCC"
        };
        assertTrue(DnaService.isMutant(dna));
    }
}
