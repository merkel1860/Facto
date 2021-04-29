package core;

import java.util.Scanner;

public class PlayBook {
    public static void main(String[] args) {
        int result = 1;
        int value = readNumber();
        result = factoriel(value);
        displayResultFromValue(result, value);

        Student student = new Student("JB-007");
        student.setLname("James");
        student.setFname("Bond");

    }

    private static void displayResultFromValue(int result, int value) {
        System.out.println("Le factoriel de " + value + " est :b"+result);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        return scanner.nextInt();
    }

    private static int factoriel(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }


}
