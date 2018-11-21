import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Empresa empresa = new Empresa(0);

        int op = 1;
        int another = 1;

        while((op != 3) && (another == 1)) {
            System.out.print("Please, enter what operation you want to do: \n");
            System.out.print("1 - Add a worker into the system;\n");
            System.out.print("2 - Remove a worker from the system;\n");
            System.out.print("3 - Turn off the system;\n");
            op = input.nextInt();

            if (op == 1) {
                int quantidade = Empresa.getQuant();

                Add_worker add1 = new Add_worker();

                Empregado empregado2 = add1.add();

                empresa.setWorker(empregado2);

                quantidade++;

                empresa.setQuant(quantidade);

                System.out.print("Operation done, want to do another operation?.\n1- Yes\n2- No\n");
                another = input.nextInt();
            }

            if(op == 2){
                int quantidade = Empresa.getQuant();

                if(quantidade > 0){

                    quantidade--;

                    empresa.setQuant(quantidade);

                    System.out.print("Operation done, want to do another operation?.\n1- Yes\n2- No\n");
                    another = input.nextInt();
                }

                else System.out.print("Erro: Zero workers registred in the system.\n\n");

            }
        }
    }
}
