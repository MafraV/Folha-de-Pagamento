import java.util.Scanner;

public class Empregado {

    private String name;
    private String endereço;
    private String tipo;
    private String pagamento;
    private String sindicato;
    private String sindicato_ID;
    private int taxa_sindical;
    private int agenda_de_pagamento;

    public Empregado(String name, String endereço, String tipo, String pagamento, String sindicato, String sindicato_ID, int taxa_sindical, int dia_de_pagamento)
    {
       this.name = name;
       this.endereço = endereço;
       this.tipo = tipo;
       this.pagamento = pagamento;
       this.sindicato = sindicato;
       this.sindicato_ID = sindicato_ID;
       this.taxa_sindical = taxa_sindical;
       this.agenda_de_pagamento = dia_de_pagamento;
    }

}
