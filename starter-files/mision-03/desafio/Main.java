import java.util.Scanner;

public class Main {
    public static void saludar(String nombre) {
        System.out.println("¡Bienvenido, " + nombre + "!");
        System.out.println("Tu aventura comienza ahora.");
    }

    // TODO: Define mostrarHabilidad() para mostrar el mensaje del desafío.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del personaje: ");
        String nombre = entrada.nextLine();
        saludar(nombre);
        // TODO: Llama aquí a mostrarHabilidad().
        entrada.close();
    }
}
