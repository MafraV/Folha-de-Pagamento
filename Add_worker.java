import java.util.Scanner;

public class Add_worker {

    public Empregado add() {

        Scanner input = new Scanner(System.in);

        String name;
        String endereço;
        String tipo;
        String pagamento;
        String sindicato;
        String sindicato_ID;
        int taxa_sindical;
        int agenda_de_pagamento;


        System.out.print("Please, enter the worker's name: ");
        name = input.nextLine();

        System.out.print("Please, enter the worker's address: ");
        endereço = input.nextLine();

        System.out.print("Please, enter the worker's type: ");
        tipo = input.nextLine();

        System.out.print("Please, enter the worker's payment choise: ");
        pagamento = input.nextLine();

        System.out.print("Please, enter if the worker is member of a syndicate: ");
        sindicato = input.nextLine();

        System.out.print("Please, enter the worker's syndicate ID: ");
        sindicato_ID = input.nextLine();

        System.out.print("Please, enter the worker's union fee: ");
        taxa_sindical = input.nextInt();

        System.out.print("Please, enter the worker's payment agend: ");
        agenda_de_pagamento = input.nextInt();

        Empregado empregado1 = new Empregado(name, endereço, tipo, pagamento, sindicato, sindicato_ID, taxa_sindical, agenda_de_pagamento);

        return empregado1;
    }
}
