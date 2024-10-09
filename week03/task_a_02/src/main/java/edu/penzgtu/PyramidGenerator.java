package edu.penzgtu;

public class PyramidGenerator {
    private int height;

    public PyramidGenerator(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void generatePyramid() {
        for (int i = 1; i <= height; i++) {
            
            // Left part
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }

            // Space beetween parts
            System.out.print("  ");


            // Right part
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }


            // To next line
            System.out.println();
        }
    }
}
