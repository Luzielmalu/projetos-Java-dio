package arrays;
/*crie um vetor de 6 números inteiros,
e mostreo-os na ordem inversa.
*/

public class ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-8, - 7, 15, 50, 9, 4};

        //System.out.println(vetor.lengyh);

    System.out.println("Vetor : ");
    int count = 0;
    while(count < (vetor.length)){
        System.out.print(vetor[count] + " ");
        count++;
    }
    System.out.print("\nVetor: ");
    for(int i = (vetor.length - 1 ); i >= 0; i --){
        System.out.print(vetor[i] + " ");
    }
        


    }
}
