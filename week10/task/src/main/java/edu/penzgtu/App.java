package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new StackImpl<>();

        System.out.println("Введите элементы стека (для завершения введите 'exit'):");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            stack.push(input);
        }

        System.out.println("\nИзвлекаем элементы из стека:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
