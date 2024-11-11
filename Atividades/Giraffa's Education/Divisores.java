import java.util.*;
public class Divisores{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int cont = 0;
        
        x = in.nextInt();
        y = in.nextInt();
        if (x % y == 0){
            cont++;
        } 
        
        System.out.println(cont);
    }
}