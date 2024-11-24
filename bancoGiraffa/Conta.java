
// Fundamentos de Programa��o
//codigo para fornecer dicas e alternativas para o TF 
public class Conta
{
    private int numConta;// atributo numero da conta
    private String nomeTitular;// atributo nome do titular da conta
    private double saldo;// atributo saldo da conta

    public Conta(int conta, String titular, double dindin)
    {// construtor da conta, recebe as variaveis parametricas que logo serao "inseridos" em seus devidos atributos
        saldo = dindin;// saldo da conta recebe o parametro dindin
        numConta = conta;// numero da conta recebe o parametro conta
        nomeTitular = titular;// nome do titular da conta recebe o parametro titular
    }

    //Getters devolvem um tipo de dado
    public int getNumConta()
    {
        return(numConta);
    }

    public String getNomeTitular()
    {
        return(nomeTitular);
    }

    public double getSaldo()
    {
        return(saldo);
    }
    // Setters modificam um tipo de dado
    public void setNumConta(int conta)
    {
        numConta = conta;
    }

    public void setNomeTitular(String titular)
    {
        nomeTitular = titular;
    }

    public void setSaldo(double dindin)
    {
        saldo = dindin;
    }

    // TOSTRING para imprimir na classe Banco utilizando System.out.println(). POderia fazer direto como fizmeos em outros exemplos
    public String toString()
    {
        double saldoDisponivel = getSaldo();
        return("Titular da conta: " + getNomeTitular() +
                "\nNumero da conta: " + getNumConta() +
                "\nSaldo disponivel na Conta: " + saldoDisponivel);
    }
}




























