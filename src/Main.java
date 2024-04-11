import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Banco de dados.
        String name = "Rafael Gonzaga";
        String accountType = "Corrente";

        double avaliableBalance = 2500.00;

        Scanner inputUser = new Scanner(System.in);

        //Menu de Operações
        String oparerations =  """
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;
        System.out.println(oparerations);
        int menu = inputUser.nextInt();

        //Vizualizar saldo.
        switch (menu){
            case 1:
                System.out.println("Seu saldo atual é de: " + avaliableBalance);
                break;
                
                //Receber valor
            case 2:
                System.out.println("Qual é o valor que você vai receber?");
                int receive = inputUser.nextInt();
                  avaliableBalance += receive;

                System.out.println("R$ " + receive + " foram adicionados na sua conta corrente.");
                System.out.println("Saldo Atualizado: R$ " + avaliableBalance);
                  break;

                  //Transferir Valor
            case 3 :
                System.out.println("Qual o valor que você deseja transferir?");
                int transfer = inputUser.nextInt();
                avaliableBalance -= transfer;

                System.out.println("R$ " + transfer + " foram transferidos.");
                System.out.println("Saldo Atualizado: R$ " + avaliableBalance);
                break;
            default:
                System.out.println("Essa opção não existe no momento.");
                break;
        }

    }
}