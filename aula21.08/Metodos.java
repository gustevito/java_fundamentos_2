/**
 * 
    M�todos s�o uma maneira de organizar o c�digo para que possamos reutilizar trechos de programa que executam uma tarefa espec�fica. 
    Como se fossem "mini programinhas" dentro do seu programa (projeto).
    Em Java, os m�todos se dividem em dois grandes grupos: m�todos que se comportam como as fun��es que voc� estuda em C�lculo (ou seja, s�o m�todos que retornam UM valor) 
    e aqueles que executam v�rias a��es, mas n�o retornam um �nico valor. 
    Aqui est� a vers�o aprimorada do seu texto:
    Os m�todos que se comportam como uma fun��o **retornam** um valor, e dentro do bloco de instru��es marcado por `{ }` existe a palavra-chave **return**. 
    J� nos m�todos que n�o funcionam como fun��es, n�o h� retorno de valor.
    A estrutura sint�tica dos m�todos do tipo fun��o �:  
    public static <tipo de retorno> nome(...lista de par�metros)
    A estrutura sint�tica dos m�todos que **n�o s�o fun��es** �:  
    public static void nome(...lista de par�metros)
 * 
 * @author (Giraffa) 
 * @version (22-23 agosto)
 */
import java.util.Scanner;//biblioteca para apoiar E/S
public class Metodos
{
    
    public static void operacoesAtribuicao()//metodo exemplo de void e sem parametros
    {
        int x = 10;
        System.out.println("Valor Original => " + x);
        x += 10;//x=x+10;
        System.out.println("Valor apos soma com atribuicao => " + x);
        x -= 5;//x=x-5;
        System.out.println("Valor apos subtracao com atribuicao => " + x);
        x *= 5;//x=x*5;
        System.out.println("Valor apos multiplicacao com atribuicao => " + x);
        x /= 5;//x=x/5;
        System.out.println("Valor apos divisao com atribuicao => " + x);
    }
    
    public static int somaDoisInteiros( int valor1, int valor2) // metodo com parametro e retorno
    {
        return valor1 + valor2;
    }
    
    public static double somaDoisReais( double valor1, double valor2) // metodo com parametro e retorno
    {
        return valor1 + valor2;
    }
    
    public static void main(String args[]){
        System.out.println("\f");//limpando a tela
        operacoesAtribuicao();//atencao chamada deste metodo
        
        Scanner teclado=new Scanner (System.in);
        
       int num1=9, num2=12; double valor1=34, valor2=89.3;
       /**
        * ou pode fazer assim
        * int num1=9;
        * int num2=12;
        * 
        */
        System.out.println( "\n Soma de dois valores inteiros: "+ somaDoisInteiros(num1,num2));
        System.out.println( "\n Soma de dois valores inteiros: "+ somaDoisInteiros(num2,num1));
         
        System.out.println( "\n Soma de 78 e 45: "+ somaDoisInteiros(78,45));
        System.out.println( "\n Soma de 78 e 45: "+ somaDoisInteiros(45,78));
       
       int numero1=10;
        System.out.println( "\n Soma de dois valores reais: "+ somaDoisReais(valor1,valor2));
        System.out.println( "\n divisoa1: "+ numero1+ 1/2);
        System.out.println( "\n divisoa2: "+ numero1+ 1/2.);

    }

}