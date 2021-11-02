package operadores;

public class Lógicos {

    public static void main(String[] args) {

        final var numero = 2;
        final var letra = "A";

        //Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outra condição");
        }

        if ((10 -5) > 1 && (5.3) > 1) {
            System.out.println("Lógica maluca...");
        }

    }
}
