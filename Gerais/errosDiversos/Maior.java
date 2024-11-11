import java.util.*;
public class Maior{
    public static void main(){
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.println("Insira o nº A:");
        a = teclado.nextInt();
        
        System.out.println("Insira o nº B:");
        b = teclado.nextInt();
        
        System.out.println("Insira o nº C:");
        c = teclado.nextInt();
        
        if (a > b && a > c){
            System.out.println("A é o maior nº");
        }
        
        else if(b > a && b > c){
            System.out.println("B é o maior nº");
        }
        
        else if (c > a && c > b){
            System.out.println("C é o maior nº");
        }
        
        if(a == b && a == c ){
            System.out.println("Todos os nºs sao iguais");
        }

        else if (a == b){
            System.out.println("A e B sao iguais");
        }
        
        else if (a == c){
            System.out.println("A e C sao iguais");
        }
        
        else if(b == c){
            System.out.println("B e C sao iguais");
        }
    }
}