package test.com.example;

import org.example.NucleotideRandomGenerator;
import org.example.RandomNucleotideGenerator;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomNucleotideGeneratorTest {

    @Test
    public void testGenerate() {
        NucleotideRandomGenerator generator = new RandomNucleotideGenerator();

        // Exemplo de geração de sequências
        String sequence1 = generator.generate(10);
        String sequence2 = generator.generate(10);
        String sequence3 = generator.generate(4);
        String sequence4 = generator.generate(4);

        System.out.println("Sequência 1 (tamanho 10): " + sequence1);
        System.out.println("Sequência 2 (tamanho 10): " + sequence2);
        System.out.println("Sequência 3 (tamanho 4): " + sequence3);
        System.out.println("Sequência 4 (tamanho 4): " + sequence4);

        assertNotNull(sequence1);
        assertEquals(10, sequence1.length());
        assertNotNull(sequence2);
        assertEquals(10, sequence2.length());
        assertNotNull(sequence3);
        assertEquals(4, sequence3.length());
        assertNotNull(sequence4);
        assertEquals(4, sequence4.length());
    }
}