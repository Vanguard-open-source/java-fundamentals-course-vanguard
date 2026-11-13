import java.util.Scanner;

class Personaje {
    private String nombre;
    private int vida;

    Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = 0;
        setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int nuevaVida) {
        if (nuevaVida >= 0) {
            vida = nuevaVida;
        } else {
            System.out.println("La vida no puede ser negativa.");
        }
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + vida + " de vida.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== JAVA QUEST ===");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Vida: ");
        int vida = entrada.nextInt();

        Personaje heroe = new Personaje(nombre, vida);
        Personaje aliado = new Personaje("Nova", 80);
        aliado.setVida(120);
        Personaje tercerPersonaje = new Personaje("Shadow", 150);
        Personaje[] equipo = {heroe, aliado, tercerPersonaje};

        for (Personaje personaje : equipo) {
            personaje.presentarse();
        }

        if (heroe.getVida() >= 50) {
            System.out.println("¡Listo para la aventura!");
        } else {
            System.out.println("Necesitas recuperar energía.");
        }

