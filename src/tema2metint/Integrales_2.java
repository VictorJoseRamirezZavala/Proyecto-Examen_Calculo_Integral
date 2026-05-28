package tema2metint;

import java.util.Scanner;

public class Integrales_2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Elige el numero de la integral (1-16): ");
            int op = sc.nextInt();
            
            switch(op) {
                case 1 -> System.out.println("Resultado: 12");
                case 2 -> System.out.println("Resultado: 140/3");
                case 3 -> System.out.println("Resultado: 36");
                case 4 -> System.out.println("Resultado: 44");
                case 5 -> System.out.println("Resultado: 3/2");
                case 6 -> System.out.println("Resultado: 104");
                case 7 -> System.out.println("Resultado: 3/16");
                case 8 -> System.out.println("Resultado: 326/15");
                case 9 -> System.out.println("Resultado: 134/3");
                case 10 -> System.out.println("Resultado: (2√6 - 1/3)");
                case 11 -> System.out.println("Resultado: -8");
                case 12 -> System.out.println("Resultado: 12/25");
                case 13 -> System.out.println("Resultado: 1");
                case 14 -> System.out.println("Resultado: 2");
                case 15 -> System.out.println("Resultado: (6 - ((4√2)/9))");
                case 16 -> System.out.println("Resultado: 7/338");
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
