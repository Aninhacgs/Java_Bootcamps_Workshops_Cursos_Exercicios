
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    
    public static void main(String[] args) {
        //Trabalhando com filhas
        Queue<String> filaBanco = new LinkedList<>();
        
        //Inserindo os valores das senhas na fila
        filaBanco.add("0001");
        filaBanco.add("PR0001");
        filaBanco.add("SC0001");
        filaBanco.add("0002");
        filaBanco.add("PR0002");
        filaBanco.add("SC0002");
        
        //Retirando o primeiro valor da fila
        String proximo = filaBanco.poll();
        System.out.println(filaBanco);
        System.out.println(proximo);
        
        //Buscando o primeiro elemento da fila sem remove-lo da fila e caso não exista deve retornar NULL
        String primeiro = filaBanco.peek();
        System.out.println(primeiro);
        
        //Buscando o primeiro elemento da fila sem remove-lo da fila e caso não exista deve retornar uma exceção
        String aux = filaBanco.element();
        System.out.println(aux);
        
        for(String senhas:filaBanco){
            System.out.println(senhas);
        }
        
        //Utilizando iterator
        Iterator<String> iteratorFila = filaBanco.iterator();
        while(iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }
        
        //Tamnho da fila
        System.out.println(filaBanco.size());
        
        //Verificar se a fila está vazia
        System.out.println(filaBanco.isEmpty());
        
        //Limpando a fila
        filaBanco.clear();
        
    }
    
}
