import java.util.*;
public class Bhaskara{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c;
        double x1, x2;
        
        System.out.println("Insira o valor A:");
        a = teclado.nextDouble();
        System.out.println("Insira o valor B:");
        b = teclado.nextDouble();
        System.out.println("Insira o valor C:");
        c = teclado.nextDouble();
        
        x1 = (-b + Math.sqrt((Math.pow(b,2) - (4 * a * c)))) / (2 * a);
        x2 = (-b - Math.sqrt((Math.pow(b,2) - (4 * a * c)))) / (2 * a);
        
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
