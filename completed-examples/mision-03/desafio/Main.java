import java.util.Scanner;

public class Main {
    public static void saludar(String nombre) {
        System.out.println("¡Bienvenido, " + nombre + "!");
        System.out.println("Tu aventura comienza ahora.");
    }

    public static void mostrarHabilidad() {
        System.out.println("¡Poder especial desbloqueado!");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del personaje: ");
        String nombre = entrada.nextLine();
        saludar(nombre);
        mostrarHabilidad();
        entrada.close();
    }
}
