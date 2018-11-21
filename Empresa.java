public class Empresa {

    private Empregado[] empregados = new Empregado[200];
    private static int empregados_quantidade;

    public Empresa(int x)
    {
        this.empregados_quantidade = x;
    }

    public static int getQuant()
    {
        return empregados_quantidade;
    }

    public void setQuant(int x)
    {
        empregados_quantidade = x;
    }

    public void setWorker(Empregado x)
    {
        empregados[this.empregados_quantidade] = x;
    }
}
