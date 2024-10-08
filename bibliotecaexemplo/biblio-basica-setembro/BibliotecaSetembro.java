
/**
 *
 * aqui coloquem lista de metodos construidos
 * ao longo do semestre - versao acumulada Agosto/Setembro
 * 
 */

public class BibliotecaSetembro
{
    /**
     * 
     * public static int quantDiv (int valor )
    {   //recebe numero natural maio que zero e devolve a quantidade de divisores do numero 
        ....
    }
    
    * public static int quantDivP (int valor )
    {   //recebe numero natural maio que zero e devolve a quantidade de divisores proprios do numero 
        ....
    }
    
    * public static int somaDiv (int valor )
    {   //recebe numero natural maio que zero e devolve a soma dos divisores do numero 
        ....
    }
    
    * public static int somaDivP (int valor )
    {   //recebe numero natural maio que zero e devolve a soma dos divisores proprios do numero 
        ....
    }
    
    * public static boolean primo (int valor )
    {   //recebe numero natural maio que zero e devolve true se for primo e false se nao for primo 
        // usando chamada de metodo existente 
        ....
    }
    
    * public static boolean primo2 (int valor )
    {  //recebe numero natural maio que zero e devolve true se for primo e false se nao for primo 
        // sem usar chamada de metodo existente ...testes encadeados
    }
    
    * public static boolean perfeito(int valor )
    {   //recebe numero natural maio que zero e devolve true se for perfeito e false se nao for perfeito 
        // usando chamada de metodo existente 
        ....
    }
    
    * public static boolean abundante(int valor )
    {   //recebe numero natural maio que zero e devolve true se for abundante e false se nao for abundante 
        // usando chamada de metodo existente 
        ....
    }
    
    * public static boolean defectivo(int valor )
    {   //recebe numero natural maio que zero e devolve true se for defectivo e false se nao for defectivo 
        // usando chamada de metodo existente 
        ....
    }
    
    * public static boolean amigos(int a, int b )
    {   //recebe numero natural maio que zero e devolve true se os numeros forem amigos  e false se nao forem amigos
        // usando chamada de metodo existente 
        ....
    }
    
    * public static int somaPA(int n, int a1, int an) 
    * { 
        //enunciado do exercicio 9 da lista de repeti��o       
      }   
      
      public static int somatorio (int a, int b, int c)  
    * { 
        //enunciado do exercicio 10 da lista de repeti��o       
      }   
      
      public static int produtorio (int a, int b)  
    * { 
        //enunciado do exercicio 11 da lista de repeti��o       
      }   
      
      ***** interessante inserir metodos dos desafios e do programa SORRIA
      ***** podem inserir na sua biblioteca metodos resultantes das suas construcoes de aula e estudos complementares
      ***** lembrem-se metodos CRIADOS por voc�s
      ***** codigos documentados =] explicando como funcionam os metodos 
     */   
    /// "heran�as" de Agosto
    
    public static double areaQuadrado (double lado)
    {   //recebe o tamanho do lado do quadrado e retorna a area deste
        return lado*lado;
    }
    
    public static double areaRetangulo (double lado1, double lado2)
    {//recebe os 2 lados de um retangulo e retorna sua area
        return lado1*lado2;
    }
    
    public static double areaCirculo (double raio)
    {//recebe o raio de um circulo e retorna sua area
        return Math.PI*raio*raio;
    }
    
    public static double areaTriangulo (double base, double altura)
    {//recebe a base e a altura de um triangulo e retorna sua area
        return (base*altura)/2.;
    }
    
    public static double volumeParalelepipedo(double lado1, double lado2,double lado3)
    {//recebe os 3 lados de um paralelepipedo e retorna o volume
        return (lado1*lado2*lado3);
    }
    
    public static double volumePiramide(double ladobase1,double ladobase2,double altura)
    {//recebe os lados da base e a altura de uma piramide e retorna seu volume
        return (ladobase1*ladobase2*altura)/3.;
    }
    
    public static double volumeCilindro(double raio,double altura)
    {//recebe os raio da base e a altura de um cilindro e retorna seu volume
        return (Math.PI*Math.pow(raio,2)*altura);
    }
    
    public static double volumeEsfera(double raio)
    {//recebe os raio de uma esfera e retorna seu volume
        return (4*Math.PI*Math.pow(raio,3)/3);
    }
    
    public static double superficieParalelepipedo(double lado1, double lado2,double lado3)
    { // retorna a area da superfície do paralelepipedo
        return (2*lado1*lado2+2*lado1*lado3+2*lado2*lado3);
    }
    
        
    public static double superficieCilindro(double raio,double altura)
    {//recebe os raio da base e a altura de um cilindro e retorna sua area superficial
        return (2*Math.PI*Math.pow(raio,2)+2*Math.PI*raio*altura);
    }
    
    public static double superficieEsfera(double raio)
    {//recebe os raio de uma esfera e retorna seu volume
        return (4*Math.PI*Math.pow(raio,2));
    }
    
    public static int maiorDeTres1(int a, int b, int c) 
    {  int aux=0;
        if (a >= b && a >= c) aux=a;
        if (b >= a && b >= c) aux=b; 
        if (c >= a && c >= b)    aux=c; 
        return aux;
    }
        
    public static int maiorDeTres2(int a, int b, int c) {
        if (a >= b && a >= c) {return a;}
            else if (b >= a && b >= c) {return b; } 
                    else {return c; }
    }
    
   public static int maiorDeTres3(int a, int b, int c)
    {   //retorna o maior numero entre 3 valores
        if (c>b)
                {
                    b=c;
                }
        if (b>a)
                {
                    a=b;
                }
        
        return a;
    }
    
    public static int maiorDeTres4(int a, int b, int c) {
        int maior;

        if (a >= b && a >= c) { maior = a; } 
           else if (b >= a && b >= c) {maior = b;} 
                 else {maior = c; }

        return maior;
    }

    public static void capicua(int numero) 
    {
    if (numero < 1000 || numero > 9999) {System.out.print("O n�mero natural digitado n�o tem 4 d�gitos !!! ");}
              else
                    { 
                    // isolando os d�gitos do n�mero
                    int primeiroDigito = numero / 1000; // Extrai o primeiro d�gito
                    int segundoDigito = (numero / 100) % 10; // Extrai o segundo d�gito
                    int terceiroDigito = (numero / 10) % 10; // Extrai o terceiro d�gito
                    int quartoDigito = numero % 10; // Extrai o quarto d�gito
        
                    // Verificar se o n�mero � capicua
                    if (primeiroDigito == quartoDigito && segundoDigito == terceiroDigito) 
                            {
                                System.out.println("O n�mero " + numero + " � capicua.");
                            } 
                                else 
                                     {System.out.println("O n�mero " + numero + " n�o � capicua.");
                    }
                
              }
        }
    public static void tipoTriangulo( int a, int b, int c) 
    {
    if ((Math.abs(b - c) < a && a < b + c) && (Math.abs(a - c) < b && b < a + c) && (Math.abs(a - b) < c && c < a + b)) 
                {
                    if (a == b && b == c) {System.out.println("Tri�ngulo Equil�tero"); } 
                        else 
                            if (a == b || b == c || a == c) {System.out.println("Tri�ngulo Is�sceles");} 
                                else {System.out.println("Tri�ngulo Escaleno");}
                } 
                else 
                    { System.out.println("As medidas n�o formam um tri�ngulo."); }
                    
    }
    }
    
    
 