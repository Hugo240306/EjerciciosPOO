package ejercicio8;

/*
 * Haz un método que reciba la lista de cadenas que se muestra a continuación y, pasándole una letra,
 *           nos cuente cuántas veces aparece esa letra en cada posición de la lista por consola
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    static ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Nicolás", "Francisco", "Hugo", "Lucas", "Ruben", "Iker", "Sofia", "Jose Luis", "Diego", "Rico", "Amanda","Francisca"));
    public static void main(String[] args) {
        devolverLista("a");
    }
    public static void devolverLista(String letra){

        ArrayList<Integer>numeroLetras = new ArrayList<>();
        for(String palabra : lista){
            System.out.println("Estudiando la palabra: " + palabra);
            int contador = 0;
            for(int i = 0; i < palabra.length(); i++){
                if(letra.equalsIgnoreCase(String.valueOf(palabra.charAt(i)))){
                    System.out.println("La letra " + letra + " esta en la posición " + (i+1));
                    contador++;
                }
            }
            if(contador==0){
                System.out.println("La palabra no contiene esa letra");
            }
        }
    }
}