class Personaje {
    String nombre;
    int vida;
}

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje();
        heroe.nombre = "Pixel";
        heroe.vida = 200;
        System.out.println(heroe.nombre);
        System.out.println(heroe.vida);
    }
}
