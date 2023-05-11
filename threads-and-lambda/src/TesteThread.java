public class TesteThread {
    public static void main(String arg[]){

        // Rodando de forma assincrona

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();
        new Thread(t5).start();

        // serão executadas alternando entre elas ao em vez de executar uma a uma
        // a forma que será alternada só o processador irá controlar,
            // cada vez que rodarmos esse programa, a sauda será diferente

    }

    private static Runnable t1 = new Runnable() {
        public void run(){
            for (int i=0; i<10; i++){
                System.out.println("Thread 1: " + i);
            }
        }
    };

    private static Runnable t2 = new Runnable() {
        public void run(){
            for (int j=0; j<10; j++){
                System.out.println("Thread 2: " + j);
            }
        }
    };

    private static Runnable t3 = new Runnable() {
        public void run(){
            for (int k=0; k<10; k++){
                System.out.println("Thread 3: " + k);
            }
        }
    };
    private static Runnable t4 = new Runnable() {
        public void run(){
            for (int l=0; l<10; l++){
                System.out.println("Thread 4: " + l);
            }
        }
    };
    private static Runnable t5 = new Runnable() {
        public void run(){
            for (int m=0; m<10; m++){
                System.out.println("Thread 5: " + m);
            }
        }
    };


}
