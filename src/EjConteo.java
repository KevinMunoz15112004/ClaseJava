import java.util.Scanner;

public class EjConteo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el incremento i: ");
        int i = scanner.nextInt();

        System.out.println("Números desde " + n + " hasta " + m + " incrementando en " + i + ":");
        for (int j = n; j <= m; j += i) {
            System.out.println(j);
        }
        scanner.close();
    }
}
