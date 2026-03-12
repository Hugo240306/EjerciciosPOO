package ejercicio4;

/*
* Haz un método que calcule de forma aleatoria 5 números entre 1 y 10 sin que puedan repetirse y
*           los devuelva dentro de una lista
* */
import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Integer> lista = generarNumeros();
        System.out.println(lista);
    }

    public static ArrayList<Integer> generarNumeros(){

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        while(numeros.size() < 5){

            int num = rand.nextInt(10) + 1;

            if(!numeros.contains(num)){
                numeros.add(num);
            }
        }

        return numeros;
    }
}