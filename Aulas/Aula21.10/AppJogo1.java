import java.util.Scanner;
public class AppJogo1 
{

public static void main(String [] args)
{
System.out.println("\f");
Jogo v1,v2,v3,v4,v5;
v1=new Jogo("Sete", 45);
v2=new Jogo("Oito", 30);
v3=new Jogo("Nove", 12);
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
//vou escolher deixar tudo com v2
v1=v2;
v3=v1;
v4=v3;
v5=v1;
//existem varias combinacoes possiveis, basta garantir que ao final fiquem todas variaveis com mesmo endereço do objeto escolhido
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println(v4);
System.out.println(v5);

}
}