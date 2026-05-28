package tema2metint;
//Victor José Ramirez Zavala
import java.util.Scanner;

public class Integrales_1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Elige el numero de la integral (1-6): ");
            int op = sc.nextInt();
            
            switch(op) {
                case 1 -> System.out.println("Resultado: ((x^4)/2)-((x^3)/3)+3x+C");
                case 2 -> System.out.println("Resultado: ((5(2+3x^2)^9)/54)+C");
                case 3 -> System.out.println("Resultado: ((2((x^5)-1)^3/2)/15)+C");
                case 4 -> System.out.println("Resultado: ((2(x^3/2)/3)+(2(x^7/2)/7))+C");
                case 5 -> System.out.println("Resultado: (((1(2s+3)^3/2)/6)-((3(2s+3)^1/2)/2))+C");
                case 6 -> System.out.println("Resultado: (((1((x^2)+3)^5/2)/5)-(((x^2)+3)^3/2)+C");
                default -> System.out.println("Opción no válida");
            }
        }
    }
}