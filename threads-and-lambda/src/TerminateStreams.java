import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminateStreams {
    public static void main(String[] args) {

        // JAVA 8: STREAMS - Operações terminais
        // Base de ESTUDOS https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo/

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        System.out.println("Lista original");
        lista.stream().forEach(e -> System.out.println(e));

        System.out.println("Exemplo de uso intermediario (limit) e terminal (forEach)");
        lista. stream()
                . limit(3)
                .forEach(e -> System.out.println(e)); // operação final - não tão utilizado - apenas para imprimir no console
        System.out.println();

        // Salvando resultado em variáveis

        System.out.println("Usando count - contando elementos na lista");
        long count = lista.stream()
                .filter(e -> e % 2 == 0) // filtra apenas os pares
                .count(); // conta quantos elementos há na lista

        System.out.println("Elementos na Lista " + count);
        System.out.println();

        System.out.println("Usando min para menor valor");
        Optional<Integer> min = lista.stream()
                .min(Comparator.naturalOrder()); // usa um comparador numérico ja existente

        System.out.println("Menor valor " + min.get()); // O .get() particularidade do tipo Optional
        System.out.println();

        System.out.println("Usando collect(Collectors.toList) para armazanar a nova lista");
        List<Integer> novaLista = lista.stream()
                .filter(e -> e % 2 == 0) // filtra os pares
                .map(e -> e * 3) // multiplica por 3
                .collect(Collectors.toList()); // coleta a lista e armazena numa nova

        System.out.println("Nova Lista " + novaLista);
        System.out.println();

        System.out.println("Usando collect(Collectors.groupingBy) para armazanar a nova lista");

        // cria um mapa onde o que é par (conforme resultado do groupingBy) é armazenado no true
        // e o que é impar é armazenado no false

        // o tipo do mapa é escolhido pelo tipo do agrupamento
        // Map <Boolean, List<Integer>> pois o groupinBy do retorna um boolean
        Map<Boolean, List<Integer>> mapa = lista.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(mapa);

        System.out.println();

        // o tipo do mapa é escolhido pelo tipo do agrupamento
        // Map <Integer, List<Integer>> pois o groupinBy do retorna um integer
        System.out.println("outro exemplo de groupingBy");
        Map<Integer, List<Integer>> mapa2 =  lista.stream()
                .collect(Collectors.groupingBy(e -> e % 3));
        System.out.println(mapa2);

        System.out.println();
        System.out.println("Transformando os valores em String e juntando-os com joining");

        String collect = lista.stream()
                .map(e -> String.valueOf(e))//Transforma em String
                .collect(Collectors.joining(";")); // junta todos mas separando com ;

        System.out.println(collect);






    }
}
