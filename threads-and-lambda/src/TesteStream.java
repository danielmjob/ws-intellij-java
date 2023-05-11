import java.util.Arrays;
import java.util.List;

public class TesteStream {

    public static void main(String[] args) {

        // Stream - fluxo de dados


        List<Integer> asList = Arrays.asList(1,2,3,4); // criando uma lista de números

        // duas formas de chegar ao mesmo resultado
        // usando foreach
        System.out.println("\nUsando foreach");
        for (Integer integer : asList) {
            System.out.println(integer);
        }
        // usando stream em lambda
        System.out.println("\nUsando expressão lambda");
        asList.stream().forEach(e -> System.out.println(e));

        //algumas funções em stream
        System.out.println("\nUsando filtro para mostrar apenas os pares");
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));



    }
}
