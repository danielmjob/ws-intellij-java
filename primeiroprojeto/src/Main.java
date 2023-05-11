public class Main {

    public static void main(String[] args) {
        System.out.printf("Esse é o Screen Match!");
        System.out.println("Filme: top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.8) / 3;
        System.out.println(media);

        String sinopse;

        /*
            Text Block
            aspas triplas funcionam do java 15 em diante e aceitam a formatação
        */

        sinopse = """
                    Filme Top Gun
                    Filme de aventura com galã dos anos 80
                    Muito bom!
                    Ano de lançamento 
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media /2); // para uma media de até 5 apenas de números inteiros
        System.out.println(classificacao + "Estrela(s)");



    }
}

