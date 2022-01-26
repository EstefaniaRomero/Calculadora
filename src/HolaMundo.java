import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        String saludo = "Hola Estefania";

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el primer número: ");
        int num = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("suma = " + num + num2);


    }
}
