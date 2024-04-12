import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Banco de dados.
        String name = "Rafael Gonzaga";
        String accountType = "Corrente";

        double avaliableBalance = 2500.00;

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
                    System.out.println("Seu saldo atual é de: " + avaliableBalance);
                    break;

                //Receber valor
                case 2:
                    System.out.println("Qual é o valor que você vai receber?");
                    int receive = inputUser.nextInt();
                    avaliableBalance += receive;

                    System.out.println("R$ " + receive + " foram adicionados na sua conta corrente.");
//                    System.out.println("Saldo Atualizado: R$ " + avaliableBalance);
                    break;

                //Transferir Valor
                case 3:
                    System.out.println("Qual o valor que você deseja transferir?");
                    int transfer = inputUser.nextInt();
                    avaliableBalance -= transfer;

                    System.out.println("R$ " + transfer + " foram transferidos.");
//                    System.out.println("Saldo Atualizado: R$ " + avaliableBalance);
                    break;

                case 4:
                    System.out.println("Essa feature será implementada em breve!");
                    break;

                case 5:
                    System.out.println("Você foi deslogado com sucesso!");
                    break;

                default:
                    System.out.println("""
                                Humm,  parace que essa opção  não é  um opção válida.
              ______________________________                  
              Caso queira;
              Consultar  o saldo - Digite 1
              Receber valor - Digite 2
              Transferir valor - Digite 3
              Extrato - Digite 4
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
            (1 - Sair       2 - Mostrar Menu Inicial)
            """);
            String exit = inputUser.next();

            if (exit.equalsIgnoreCase("1")) {
                System.out.println("Obrigado por usar nosso banco!");
                break;
            } else if (exit.equalsIgnoreCase("2")) {
                continue;
            } else {
                System.out.println("Opção inválida. Digite 1 ou 2.");
            }
        }
    }
}