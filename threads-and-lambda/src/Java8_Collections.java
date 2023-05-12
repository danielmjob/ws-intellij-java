import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java8_Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        //List
        System.out.println("forEach");
        list.forEach(n -> System.out.println(n));

        System.out.println("removeIf");
        list.removeIf(e -> e == 2);
        list.forEach(n -> System.out.println(n));

        System.out.println("replaceAll");
        list.replaceAll(e -> e * 2);
        list.forEach(n -> System.out.println(n));


        //HashMap
        System.out.println("HashMap");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0,"Se");
        map.put(1,"inscreva");
        map.put(2,"no");
        map.put(3,"canal");
        System.out.println("forEach");
        map.forEach((k,v)-> System.out.println(k + v));

        System.out.println("compute");
        // troca o conteudo da chave escolhida
        // chave 1 referente a inscreva ira ser alterada para inscreva agora
        map.compute(1,(k,v) -> v + " agora" );
        map.forEach((k,v)-> System.out.println(k + v));

        System.out.println("merge");
        map.merge(3,"!",(v1,v2) -> v1 + v2);
        map.forEach((k,v)-> System.out.println(k + v));

        System.out.println("replaceAll");
        map.replaceAll((k,v) -> v + "!");
        map.forEach((k,v)-> System.out.println(k + v));



    }
}
