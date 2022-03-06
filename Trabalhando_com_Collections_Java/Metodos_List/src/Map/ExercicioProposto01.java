package Map;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoExtimada = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoExtimada);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoExtimada.put("RN", 3534165);
        System.out.println(populacaoExtimada);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        System.out.println(populacaoExtimada.containsKey("PB"));
        populacaoExtimada.put("PB", 4039277);
        System.out.println(populacaoExtimada);

        System.out.println("Exiba a população do estado PE: " + populacaoExtimada.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoExtimada2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoExtimada2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoExtimada3 = new TreeMap<>(populacaoExtimada2);
        System.out.println(populacaoExtimada3);

        Collection<Integer> populacao = populacaoExtimada.values();
        String maiorPopulacao = "";
        String menorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoExtimada.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) maiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) menorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", menorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", maiorPopulacao, Collections.max(populacao));


        int soma = 0;
        Iterator<Integer> iterator = populacaoExtimada.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

    }
}
