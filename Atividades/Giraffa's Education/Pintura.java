import java.util.*;
public class Pintura{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Giraffa's Education!");
        System.out.println("Escolha a estrutura que você deseja pintar:");
        int codigo = input.nextInt();
        
        switch (codigo){
            case 1: 
                System.out.println("1 - Orçamento de pintura do Edificio");
            break;
            case 2:
                System.out.println("2 - Orçamento de pintura da Escultura");
            break;
            case 3:
                System.out.println("3 - Orçamento de pintura de ambas estruturas");
            break;
            case 4:
                System.out.println("4 - Orçamento da troca de piso do terreno");
            break;
        }
    }
}