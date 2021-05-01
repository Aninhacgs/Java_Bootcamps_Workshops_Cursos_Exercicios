
package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Iterable;
import java.util.Iterator;

public class ListaNomes {
    public static void main(String[] args) {
       List<String> nomes = new ArrayList<>();
       nomes.add("Ana");
       nomes.add("Marcos");
       nomes.add("Julia");
       nomes.add("Maria");
       nomes.add("Luiza");
       nomes.add("Paulo");
       nomes.add("Arthur");
       
       System.out.println(nomes);
       
       Collections.sort(nomes);
       
       //Nomes em ordem alfabetica
       System.out.println(nomes);
       
       //Atualizando nomes
       nomes.set(2,"Larissa");
       
       System.out.println(nomes);
       
       //Removendo nomes pelo índice
       nomes.remove(3);
       System.out.println(nomes);
       
       //Remoendo nomes pelo nome
       nomes.remove("Maria");
       System.out.println(nomes);
       
       //Pegando nomes da lista
       String nome = nomes.get(0);
       System.out.println(nome);
       
       //Tamnho da lista
       int tamanho = nomes.size();
       System.out.println(tamanho);
       
       //Buscando nomes na lista
       boolean busca = nomes.contains("Ana");
       System.out.println(busca);
       
       //Verificar se a lista está vazia
       boolean verificador = nomes.isEmpty();
       System.out.println(verificador);
       
       //Buscando a posição do nome
       int posicao = nomes.indexOf("Ana");
       System.out.println(posicao);
       
       //Percorrendo a lista com o foreatch
       for(String nomeDoItem:nomes){
           System.out.println(nomeDoItem);
       }
       
       //Percorrendo a lista com iterator
       Iterator<String> iterator = nomes.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
       
       
       //Limpando a lista
       nomes.clear();
    }
    
}
