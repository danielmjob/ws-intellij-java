import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        String nome = "Jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        int opcao = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println(String.format("""
                ****************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$ %.2f
                ****************************
                """,nome,tipoDeConta,saldoInicial));

        do {

        System.out.println("""
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada: """);
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                //1- Consultar saldos
                System.out.println("O saldo atual é de R$ " + saldoInicial);
                break;

            case 2:
                System.out.println("Informe o valor a receber: ");
                double aReceber = sc.nextDouble();
                saldoInicial += aReceber;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
                break;

            case 3:
                System.out.println("Informe o valor que deseja transferir: ");
                double aTransferir = sc.nextDouble();

                if(aTransferir > saldoInicial){
                    System.out.println("Valor inválido");
                }else{
                    saldoInicial -= aTransferir;
                    System.out.println("Saldo atualizado R$ " + saldoInicial);
                }
                break;
            case 4:
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        }while(opcao!=4);

        System.out.println("\n Obrigado(a) pela preferência!");

        sc.close();

    }




}
