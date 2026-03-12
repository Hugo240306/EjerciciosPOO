package ejercicio2;

/*
* Instancia un ArrayList de objetos Integer (ya que no puede almacenar tipos primitivos)
* Haz que el ArrayList se rellene con 5 números que meta el usuario por teclado, ni más, ni menos
* Haz un método calculoSuma() que calcula la suma del total de los números
* */
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            numeros.add(sc.nextInt());
        }

        System.out.println("La suma es: " + calculoSuma(numeros));
    }

    public static int calculoSuma(ArrayList<Integer> lista) {

        int suma = 0;

        for (int num : lista) {
            suma += num;
        }

        return suma;
    }
}
