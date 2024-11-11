import java.util.Scanner;
public class AppJogo2 
{

public static void main(String [] args)
{
System.out.println("\f");
Jogo v1,v2,v3,v4=null;//intencional  iniciei com null
v1=new Jogo("Um", 45);
v2=new Jogo("Dois", 30);
v3=new Jogo("Tres", 12);
System.out.println("Imprimindo tudo");
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println("Imprimindo v4");
System.out.println(v4);
//trocando conteudos
v4=v1;
v2=v3;
v4=v3;
v4=new Jogo("Quatro", 23);
//imprimindo
System.out.println("Imprimindo tudo depois das atribuicoes");
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println(v4);
//modificando valor do segundo atributo
v2.setValor(11);
System.out.println(" Novo Valor de v2: " + v2);


}
}
