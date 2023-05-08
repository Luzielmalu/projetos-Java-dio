import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListaNotas {

    /*
     * Dada as notas de um aluno(7,5; 8,0; 10,0; 6,5; 8,5; 5,0; 7,0) faça:
     */
    
    public static void main(String[] args) {
        
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.5);
        notas.add(8.0);
        notas.add(10.0);
        notas.add(6.5);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(7.0);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 8: " + notas.indexOf(8d));
        System.out.println("Adicione na lista a nota 10.0 na posição 4: ");
        notas.add(4, 10.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 8.5 pela nota 4.0: ");
        notas.set(notas.indexOf(8.5), 4.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 3.0 está na lista: " + notas.contains(3.0d));
        System.out.println("Exiba as notas na ordem que foram informadas: ");
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor  nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        java.util.Iterator<Double> iterator = notas.iterator();
        Double soma = 8d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
            System.out.println("Exiba a soma dos valores: " + soma);
        }

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        
    
            
        java.util.Iterator<Double> iterator2 = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator2.next();
            if(next < 7.0) iterator2.remove();
        }
        System.out.println("Remova as notas menores que 7.0 e exiba a lista:");
        System.out.println(notas);
        
    }
}

