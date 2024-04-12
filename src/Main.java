import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Banco de dados.
        String name = "Rafael Gonzaga";
        String accountType = "Corrente";
        double avaliableBalance = 2500.99;

        Scanner inputUser = new Scanner(System.in);
        boolean loop = true;

        //Vizualizar saldo.
        while (loop) {
            //Menu de Operações
            String oparerations =  """
                
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Histórico da Moviventação
                5 - Sair
                
                Digite a opção desejada:
                """;
            System.out.println(oparerations);
            int menu = inputUser.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(String.format("Seu saldo atual é de R$ %.2f ", avaliableBalance));
                    break;

                //Receber valor
                case 2:
                    System.out.println("Qual é o valor que você vai receber?");
                 double receive = inputUser.nextDouble();
                    avaliableBalance += receive;
                    System.out.println("R$ " + receive + " foram adicionados na sua conta corrente.");
                    break;

                //Transferir Valor
                case 3:
                    System.out.println("Qual o valor que você deseja transferir?");
               double transfer = inputUser.nextDouble();
                    if (transfer > avaliableBalance){
                        System.out.println("Você não tem saldo o suficiente para essa transação.");
                    } else {
                        avaliableBalance -= transfer;
                        System.out.println("R$ " + transfer + " foram transferidos.");
                    }
                    break;

                case 4:
                    System.out.println("Essa feature será implementada em breve!");
                    break;

                case 5:
                    System.out.println("Você foi deslogado com sucesso!");
                    break;

                default:
                    System.out.println("""
                                Humm,  parece que essa opção  não é  um opção válida.
              ______________________________                  
              Caso queira;
              Consultar  o saldo - Digite 1
              Receber valor - Digite 2
              Transferir valor - Digite 3
              Histórico da Moviventação- Digite 4
              Sair - Digite 5
                               
                               Acesse o Menu Inicial abaixo:
                            """
                    );
            }

            if (menu == 5){
                break;
            }

            System.out.println("""
            ___________________________________________
            (1 - Sair       2 - Ir para o Menu Inicial)
            """);
            String exit = inputUser.next();

            if (exit.equalsIgnoreCase("1")) {
                System.out.println("Obrigado por usar nosso banco!");
                break;
            } else if (exit.equalsIgnoreCase("2")) {
                continue;
            } else {
                System.out.println("Opção inválida. Digite um dos serviços abaixo:");

            }
        }
    }
}