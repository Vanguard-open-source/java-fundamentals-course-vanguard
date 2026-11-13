public class Main {
    public static void main(String[] args) {
        int energia = 20;
        // DESAFÍO: conserva el inicio en 20, cambia la meta a 100
        // y haz que cada poción recupere 20 puntos de energía.
        while (energia < 50) {
            energia = energia + 10;
            System.out.println("Energía: " + energia);
        }
    }
}
