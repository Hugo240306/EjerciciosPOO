package ejercicio1;

/*
* Instancia un ArrayList de objetos Integer (ya que no puede almacenar tipos primitivos)
* Haz un método de tal forma que el ArrayList se rellene con 5 números que meta el usuario
* por teclado, ni más, ni menos y devuelva el ArrayList completo con los números
* */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
private static final int NUMERO = 5;
    public static void main(String[] args) {
        ArrayList<Integer> lista = rellenarLista();
        System.out.println(lista);
    }

    public static ArrayList<Integer> rellenarLista() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUMERO; i++) {
            System.out.print("Introduce un número: ");
            numeros.add(sc.nextInt());
        }

        return numeros;
    }
}
