package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Con el ArrayList ya instanciado e inicializado con esos 5 números
* Haz un método que calcule el número mayor y el número menor devolviendo una lista de 2 números
* */
public class Principal {

    static ArrayList<Integer> numerosList = new ArrayList<>(Arrays.asList(1,5,8,9,3));

    public static void main(String[] args) {

        ArrayList<Integer> resultado = calcularMayorMenor();
        System.out.println("Menor: " + resultado.get(0));
        System.out.println("Mayor: " + resultado.get(1));
    }

    public static ArrayList<Integer> calcularMayorMenor(){

        int mayor = numerosList.get(0);
        int menor = numerosList.get(0);

        for(int num : numerosList){

            if(num > mayor){
                mayor = num;
            }

            if(num < menor){
                menor = num;
            }
        }

        return new ArrayList<>(Arrays.asList(menor, mayor));
    }
}
