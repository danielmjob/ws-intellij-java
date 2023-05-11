public class Java8LambdaRunnable {
    public static void main(String[] args) {
        // Função Lambda


        // Os dois códigos abaixo devolvem o mesmo resultado
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();


        new Thread(() -> System.out.println("Olá mundo")).run();

        // Como a Runnable so tem um metodo abstrato a implementar a função lambda consegue subtender que estamos implementando esse metodo
        // usando o padrão SAM
        // SINGLE ABSTRACT METHOD


    }
}
