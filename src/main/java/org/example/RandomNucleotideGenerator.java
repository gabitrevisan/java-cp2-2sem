package org.example;

import java.util.Random;

public class RandomNucleotideGenerator implements NucleotideRandomGenerator {
    private static final String NUCLEOTIDES = "ATCG";

    @Override
    public String generate(int sequenceSize) {
        StringBuilder sequence = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < sequenceSize; i++) {
            int index = random.nextInt(NUCLEOTIDES.length());
            sequence.append(NUCLEOTIDES.charAt(index));
        }

        return sequence.toString();
    }
}
