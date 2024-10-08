import java.util.*;
public class Repeticao{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int x;
        int resultado;
        boolean resultadoBool;
        
        String palavra;
        int qtChars;
        
         while(true){
            exibirMenu();
            int opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcao){
                case 0:
                    System.out.print('\u000C');
                    System.out.println("   ___  _          _                 _       _ ");
                    System.out.println("  / _ \\| |__  _ __(_) __ _  __ _  __| | ___ | |");
                    System.out.println(" | | | | '_ \\| '__| |/ _` |/ _` |/ _` |/ _ \\| |");
                    System.out.println(" | |_| | |_) | |  | | (_| | (_| | (_| | (_) |_|");
                    System.out.println("  \\___/|_.__/|_|  |_|\\__, |\\__,_|\\__,_|\\___/(_)");
                    System.out.println("                     |___/                     ");
    
                    System.out.println("\n               Volte sempre! :)");
                    teclado.close();
                    System.exit(0);
                break;
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
                    System.out.println("Insira um nº natural:");
                    x = teclado.nextInt();
                    
                    resultado = Biblioteca.divisoresPropriosSoma(x);
                    System.out.println("A soma dos divisores proprios de " + x + " é " + resultado + "!");
                break;
                case 5:
                    System.out.print('\u000C');
                    System.out.println("Insira um nº natural:");
                    x = teclado.nextInt();
                    
                    resultadoBool = Biblioteca.ehPrimo(x);
                    System.out.println("O nº natural é primo?");
                    System.out.println(resultadoBool);
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
                case 12:
                    System.out.print('\u000C');
                    System.out.println("Insira uma palavra:");
                    
                    palavra = teclado.nextLine();
                    qtChars = Biblioteca.quantidadeCaracteres(palavra);
                    System.out.println("A palavra '" + palavra + "' possui " + qtChars + " caracteres.");
                break;
                case 13:
                    System.out.print('\u000C');
                    System.out.println("Insira uma palavra:");
                    
                    palavra = teclado.nextLine();
                    qtChars = Biblioteca.quantidadeVogais(palavra);
                    System.out.println("A palavra '" + palavra + "' possui " + qtChars + " vogais.");
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
        System.out.println("\n-------------------------------------------------------");
        System.out.println("\n               MENU STRINGS                 ");
        System.out.println("\n12 - Contar a quantidade de caracteres de uma palavra");
        System.out.println("13 - Contar a quantidade de vogais de uma palavra");
        System.out.println("\n0 – Sair do programa");
    }
}