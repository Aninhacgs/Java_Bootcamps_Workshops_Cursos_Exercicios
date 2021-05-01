
package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        Map<String, Integer> paises = new HashMap();
        
        //Campeões mundiais da fifa
        paises.put("Brasil", 5);
        paises.put("Alemanha", 4);
        paises.put("Italia", 4);
        paises.put("Uruguai", 2);
        paises.put("Argentina", 2);
        paises.put("Franca", 2);
        paises.put("Inglaterra", 1);
        paises.put("Espanha", 1);
        
        System.out.println(paises);
        
        //Atualiza o valor para a chave Brasil
        paises.put("Brasil", 6);
          
        //Retorna Argentina
        System.out.println(paises.get("Argentina"));
        
        //Retorna se existe ou não campeão Franca
        System.out.println(paises.containsKey("Franca"));
        
        //Remove o campeão França
        System.out.println(paises.remove("Franca"));
        
        //Retorna se existe ou não hexa campeão
        System.out.println(paises.containsValue(6));
        
        //Retorna o tamanho do mapa
        System.out.println(paises.size());
        
        //Navega nos registros do mapa
        for(String key: paises.keySet()){
            System.out.println(key + "---" + paises.get(key));
        }
        
        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry: paises.entrySet()){
            System.out.println(entry.getKey() + "---" +entry.getValue());
        }
        
    }
    
}
