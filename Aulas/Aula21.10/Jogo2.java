public class Jogo2 
{ 
private String nome; 
private double valor;
public Jogo2(String nomeX, double val) 
{
nome = nomeX;
valor = val;
}

public String getNome() { return nome; }
public double getValor() { return valor; }

public void setNome ( String novo){ nome=novo;}
public void setValor ( double valor){ this.valor=valor;}//pq nomes sao iguais


}