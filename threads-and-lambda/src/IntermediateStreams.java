import java.util.Arrays;
import java.util.List;

public class IntermediateStreams {
    public static void main(String[] args) {

        // JAVA 8: STREAMS - Operações intermediárias

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        System.out.println("Lista original");
        lista.stream().forEach(e -> System.out.println(e));

        System.out.println("Usando skip - pula o numero de dados selecionados");
        lista.stream()
                .skip(2) // operação intermediária
                .forEach(e -> System.out.println(e));

        System.out.println("Usando limit - limita a vizualização");
        lista.stream()
                .limit(2) // operação intermediária - mostra apenas os dois primeiros itens da lista
                .forEach(e -> System.out.println(e));

        System.out.println("Usando distinct - mostra sem repetições");
        lista.stream()
                .distinct() // operação intermediária - usa equals e hashcode (no caso de integer não precisa implementar)
                .forEach(e -> System.out.println(e));

        System.out.println("Usando filter - cria um filtro personalizado");
        lista.stream()
                .filter(e -> e % 2 == 0) // operação intermediária - filtrando para mostrar apenas numeros pares
                .forEach(e -> System.out.println(e));

        System.out.println("Usando map - transformando os dados(apenas no dado do stream, a lista original se mantém não modificada)");
        lista.stream()
                .map(e -> e * 2) // operação intermediária
                .forEach(e -> System.out.println(e));
    }
}
