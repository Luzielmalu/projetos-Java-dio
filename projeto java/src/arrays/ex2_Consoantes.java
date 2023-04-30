package arrays;

import java.util.Scanner;

/*faça um programa que leia um vetor de 6 caracteres,
e digas quantas consoantes foram lidas.
imprima as consoantes.
 */
public class ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u")) ) {
                    consoantes[count] =  letra;
                    quantidadeConsoantes++;
                    
            }  
             count++;
        }while(count < consoantes.length);
        
        System.out.print("consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
            System.out.print(consoante + " "); 
        }
        System.out.println("Quantidade de conosantes: " +  quantidadeConsoantes);
        System.out.println(consoantes.length);
        
    }
}
