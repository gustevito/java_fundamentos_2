import java.util.*;
public class Calc{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double resultado;
        double x;
        
        System.out.println("Insira um valor para X:");
        x = teclado.nextDouble();
        
        resultado = (3/5) + 2 * ((6 * x) + (7/Math.sqrt(x)));
        System.out.println(resultado);
    }
}