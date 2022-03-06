package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args){
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        /*System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);*/

        //System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set:");
        //numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        /*Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());*/

        //System.out.println("Transforme uma lista de String em uma lista de numeros inteiros.");
        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });*/
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*System.out.println("Pegue os numeros pares maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);*/

        /*System.out.println("Mostre a média dos números");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);*/

        //Stream não modifica valores
        System.out.println("Remova os valores impares");
        numerosAleatoriosInteger.removeIf(i -> (i %2 != 0));
        System.out.println(numerosAleatoriosInteger);


    }
}
