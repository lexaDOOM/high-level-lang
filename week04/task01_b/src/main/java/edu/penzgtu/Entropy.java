package edu.penzgtu;

public class Entropy {
    public double calculateShannon(String input) {
        // If input is empty entropy == 0
        if (input == null || input.equals("")) {
            return 0.0;
        }

        int[] freq = new int[256]; // Array for all ASCII-symbols
        int length = input.length();

        for (int i = 0; i < length; i++) {
            freq[input.charAt(i)]++;
        }

        double shannonEntropy = 0.0;

        // Calculating Shannon Entropy
        for (int i  = 0; i < 256; i++) {
            if (freq[i] > 0) {
                double freqI = (double) freq[i] / length;
                shannonEntropy -= freqI * (Math.log(freqI) / Math.log(2)); 
            }
        }
        return shannonEntropy;
    }
}
