import java.util.*;
public class Repeticao{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int x;
        int resultado;
        
         while(true){
            exibirMenu();
            int opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.print('\u000C');   
                    System.out.println("Insira um nº natural:");
                    x = teclado.nextInt();
                    
                    resultado = Biblioteca.divisoresNatural(x);
                    System.out.println("O nº " + x + " possui " + resultado + " divisores!");
                break;
                case 2:
                    System.out.print('\u000C');
                    
                    System.out.println("Insira um nº natural:");
                    x = teclado.nextInt();
                    
                    resultado = Biblioteca.divisoresProprios(x);
                    System.out.println("O nº " + x + " possui " + resultado + " divisores próprios!");

                break;
                case 3:
                    System.out.print('\u000C');
                    
                    System.out.println("Insira um nº natural:");
                    x = teclado.nextInt();
                    
                    resultado = Biblioteca.divisoresSoma(x);
                    System.out.println("A soma dos divisores de " + x + " é " + resultado + "!");
                break;
                case 4:
                    System.out.print('\u000C');
                break;
                case 5:
                    System.out.print('\u000C');
                break;
                case 6:
                    System.out.print('\u000C');
                break;
                case 7:
                    System.out.print('\u000C');
                break;
                case 8:
                    System.out.print('\u000C');
                break;
                case 9:
                    System.out.print('\u000C');
                break;
                case 10:
                    System.out.print('\u000C');
                break;
                case 11:
                    System.out.print('\u000C');
                break;
                
                default:
                    System.out.println("## ERRO! ##");
                    System.out.println("Verifique a opção digitada e tente novamente.");
                    
            }
        }
    }
    
    private static void esperarEnter(Scanner teclado){
       System.out.println("\nPressione Enter para acessar o menu.");
       teclado.nextLine();
       System.out.print('\u000C');
    }
    
    private static void exibirMenu() {
        System.out.println("\n                  MENU                    ");
        System.out.println("Digite o nº da opção que deseja executar:");
        System.out.println("\n1 – Quantidade de divisores de um nº natural");
        System.out.println("2 – Quantidade de divisores PRÓPRIOS de um nº natural");
        System.out.println("3 – Soma dos divisores de um nº natural");
        System.out.println("4 – Soma dos divisores PRÓPRIOS de um nº natural");
        System.out.println("5 – Verificar se o nº natural é PRIMO");
        System.out.println("6 – Verificar se o nº natural é PERFEITO");
        System.out.println("7 – Verificar se o nº natural é ABUNDANTE");
        System.out.println("8 – Verificar se o nº natural é DEFECTIVO");
        System.out.println("9 – Progressão aritmética");
        System.out.println("10 – Somatório");
        System.out.println("11 – Produtório");
        System.out.println("\n0 – Sair do programa");
    }
}