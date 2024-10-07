
/**
 * Escreva uma descrição da classe BibliotecaProf aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BibliotecaProf
{
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
    { // retorna a area da superfÃ­cie do paralelepipedo
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
    if (numero < 1000 || numero > 9999) {System.out.print("O número natural digitado não tem 4 dígitos !!! ");}
              else
                    { 
                    // isolando os dígitos do número
                    int primeiroDigito = numero / 1000; // Extrai o primeiro dígito
                    int segundoDigito = (numero / 100) % 10; // Extrai o segundo dígito
                    int terceiroDigito = (numero / 10) % 10; // Extrai o terceiro dígito
                    int quartoDigito = numero % 10; // Extrai o quarto dígito
        
                    // Verificar se o número é capicua
                    if (primeiroDigito == quartoDigito && segundoDigito == terceiroDigito) 
                            {
                                System.out.println("O número " + numero + " é capicua.");
                            } 
                                else 
                                     {System.out.println("O número " + numero + " não é capicua.");
                    }
                
              }
        }
    public static void tipoTriangulo( int a, int b, int c) 
    {
    if ((Math.abs(b - c) < a && a < b + c) && (Math.abs(a - c) < b && b < a + c) && (Math.abs(a - b) < c && c < a + b)) 
                {
                    if (a == b && b == c) {System.out.println("Triângulo Equilátero"); } 
                        else 
                            if (a == b || b == c || a == c) {System.out.println("Triângulo Isósceles");} 
                                else {System.out.println("Triângulo Escaleno");}
                } 
                else 
                    { System.out.println("As medidas não formam um triângulo."); }
                    
    }
}
