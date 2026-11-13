import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = entrada.nextLine();
        System.out.println("¡Bienvenido, " + nombre + "!");
        entrada.close();
    }
}
