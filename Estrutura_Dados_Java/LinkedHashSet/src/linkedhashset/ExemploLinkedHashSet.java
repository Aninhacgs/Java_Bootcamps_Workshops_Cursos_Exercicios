
package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer>sequencia = new LinkedHashSet<>();
        
        //Adicionando sequencia
        sequencia.add(1);
        sequencia.add(2);
        sequencia.add(3);
        sequencia.add(4);
        sequencia.add(5);
        sequencia.add(6);
        sequencia.add(7);
        sequencia.add(8);
        sequencia.add(9);
        sequencia.add(10);
        //Imprimindo todos os elementos
        System.out.println(sequencia);
        //Tamnho da lista
        System.out.println(sequencia.size());
        //Verifica se a lista está vazia
        System.out.println(sequencia.isEmpty());
        
        //Foreatch
        for(Integer num:sequencia){
            System.out.println(num);
        }
        
        //Iterator
        Iterator<Integer> iterator = sequencia.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
        
        
    }
    
}
