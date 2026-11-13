class Personaje {
    String nombre;
    int vida;

    Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Pixel", 150);
        System.out.println(heroe.nombre);
        System.out.println(heroe.vida);
    }
}
