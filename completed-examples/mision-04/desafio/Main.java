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
        Personaje pixel = new Personaje("Pixel", 150);
        Personaje nova = new Personaje("Nova", 80);
        pixel.presentarse();
        nova.presentarse();

        Personaje shadow = new Personaje("Shadow", 200);
        shadow.presentarse();
    }
}
