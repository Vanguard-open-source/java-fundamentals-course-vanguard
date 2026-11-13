public class Main {
    public static void main(String[] args) {
        int monedas = 30;
        int recompensa = 20;
        int total = monedas + recompensa;
        boolean puedeEntrar = total >= 50;
        System.out.println("Total: " + total);
        System.out.println("¿Puede entrar? " + puedeEntrar);
    }
}
