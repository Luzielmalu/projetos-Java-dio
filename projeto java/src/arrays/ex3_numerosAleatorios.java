package arrays;

import java.util.Random;

/*faça um programa que leia 20 números inteiros 
aleatórios(entre 0 e 100) armazene-os num vetor.
ao final, mostre os números e seus sucessores.
 */
public class ex3_numerosAleatorios {
    public static void main(String[] args) {
        Random random =  new Random();

        int[] numerosAleatorios =  new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
             int numero =  random.nextInt(100);
             numerosAleatorios[i] =  numero;
        }
        System.out.print("\nnumeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero +1) + " ");
        }
        System.out.print("\nAntecessores dos numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero - 1) + " ");
        }
    }


}
