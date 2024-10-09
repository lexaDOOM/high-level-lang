package edu.penzgtu;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pyramid height >> ");
        int height = scanner.nextInt();

        PyramidGenerator pyramid1 = new PyramidGenerator(height);
        pyramid1.generatePyramid();
        scanner.close();
    }
}
