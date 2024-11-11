import java.util.*;
public class Biblioteca{
    Scanner teclado = new Scanner(System.in);
    
    public boolean semRepetidos(int[] v1, int valorVetor, int tamanho){
        for (int i=0; i<tamanho; i++){
            valorVetor = teclado.nextInt();
            v1[i] = valorVetor; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
        return true;
    }
    
    public int[] repetidos(int[] v1, int[] v2){
        int[] vetor = {};
        
        for(int i=0; i<v1.length; i++){
            
        }
        return vetor;
    }
    
    public  int[] comum(int[] v1, int[] v2){
        int[] vetor = {};
        
        for(int i=0; i<v1.length; i++){
            
        }
        return vetor;
    }
    
    public  int[] multiplos(int[] v1){
        for(int i=0; i<v1.length; i++){
            
        }
        return v1;
    }
    
}