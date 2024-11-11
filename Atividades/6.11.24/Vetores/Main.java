import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opt;
        int tamanho;
        int valorVetor = 0;
        Biblioteca b = new Biblioteca(); // solução para não declarar os métodos da biblioteca como STATIC
        
        System.out.println("        MENU        ");
        System.out.println("\n1 - Reescrever vetor sem valores repetidos");
        System.out.println("2 - Exibir todos os valores de dois vetores em um só");
        System.out.println("3 - Exibir valores em comum entre dois vetores");
        System.out.println("4 - Remover todos os múltiplos de algum nº no vetor");
        opt = teclado.nextInt();
        switch(opt){
            case 1:
                System.out.println("Insira o tamanho do vetor:");
                tamanho = teclado.nextInt();
                int[] v1 = new int[tamanho];
                
                System.out.println("Agora, insira " + tamanho + " valores no vetor separadamente:");
                
                

            break;
            
            case 2:
                /////
            break;
            
            case 3:
                /////
            break;
            
            case 4:
                System.out.println("Primeiro, insira o tamanho do vetor que desejas criar:");
                tamanho = teclado.nextInt();
                v1 = new int[tamanho];
                
                System.out.println("Agora, insira " + tamanho + " valores no vetor separadamente:");                
                
                for (int i=0; i<tamanho; i++){
                    valorVetor = teclado.nextInt();
                    v1[i] = valorVetor;
                }
                
                System.out.println("Informe um nº natural para remover todos os seus múltiplos do vetor:");
                int multiplo = teclado.nextInt();
                
                
                
            break;
        }
        
        
        
    }
}