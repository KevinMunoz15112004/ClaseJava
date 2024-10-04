import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double edad;
        System.out.println("Ingrese su nombre y edad"); //sout
        nombre = sc.nextLine();
        edad = sc.nextDouble();
        System.out.println(nombre + " " + edad);

        }
    }

