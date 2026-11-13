class Personaje {
    String nombre;
    int vida;

    Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    void presentarse() {
        System.out.println("Soy " + nombre);
        System.out.println("Tengo " + vida + " puntos de vida");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Crea a Pixel (150 puntos de vida) y a Nova (80 puntos de vida).
        // TODO: Llama al método presentarse() de cada personaje.
    }
}
