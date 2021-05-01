
package arvorebinaria_treeset;

import java.util.TreeSet;

public class ArvoreBinaria_TreeSet {

    public static void main(String[] args) {
        TreeSet<String> arvoreCapitais = new TreeSet<>();
        arvoreCapitais.add("Porto Alegre");
        arvoreCapitais.add("Florianópolis");
        arvoreCapitais.add("Curitiba");
        arvoreCapitais.add("São Paulo");
        arvoreCapitais.add("Rio de Janeiro");
        arvoreCapitais.add("Belo Horizonte");
        System.out.println(arvoreCapitais);
        
        //Retorna a primeira capital do topo da árvore
        System.out.println(arvoreCapitais.first());
        
        //Retorna a última capital do topo da árvore
        System.out.println(arvoreCapitais.last());
        
        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(arvoreCapitais.lower("Florianópolis"));
        
        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(arvoreCapitais.higher("Florianópolis"));
        
        //Retorna a primeira capital no topo da árvore removendo do set
        System.out.println(arvoreCapitais.pollFirst());
        
        //Retorna a primeira capital no final da árvore removendo do set
        System.out.println(arvoreCapitais.pollLast());
        
        //Retorna todas as capitais
        System.out.println(arvoreCapitais);
        
        
    }
    
}
