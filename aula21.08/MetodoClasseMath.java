/**
 * Entrada de teclado via teclado, codificacao, operadores aritmeticos e uso da classe Math.
 * A classe Math em Java faz parte do pacote java.lang e fornece m�todos e constantes para realizar opera��es matem�ticas, como fun��es trigonom�tricas, logaritmos, exponenciais, arredondamentos, e manipula��o de n�meros aleat�rios. A classe Math � final, o que significa que n�o pode ser estendida, e todos os seus m�todos s�o est�ticos. Isso permite que os m�todos possam ser chamados diretamente sem a necessidade de criar uma inst�ncia da classe.
       
 * Principais m�todos da classe Math:
        1. M�todos aritm�ticos:
           Math.abs(double a): Retorna o valor absoluto de um n�mero.
           Math.max(double a, double b): Retorna o maior de dois n�meros.
           Math.min(double a, double b): Retorna o menor de dois n�meros.
           Math.pow(double a, double b): Retorna o valor de a elevado � pot�ncia b.
           Math.sqrt(double a): Retorna a raiz quadrada de a.
        2. M�todos trigonom�tricos:
           Math.sin(double a): Retorna o seno de um �ngulo (em radianos).
           Math.cos(double a): Retorna o cosseno de um �ngulo (em radianos).
           Math.tan(double a): Retorna a tangente de um �ngulo (em radianos).
        3. Constantes:
           Math.PI: A constante ? (aproximadamente 3.14159).
           Math.E: A constante e (aproximadamente 2.71828).
        4. Outros m�todos �teis:
           Math.random(): Retorna um valor pseudoaleat�rio entre 0.0 (inclusive) e 1.0 (exclusivo).
           Math.round(double a): Arredonda o n�mero para o inteiro mais pr�ximo.
           Math.ceil(double a): Arredonda o n�mero para o pr�ximo inteiro maior ou igual.
           Math.floor(double a): Arredonda o n�mero para o pr�ximo inteiro menor ou igual.

 * @author (Giraffa) 
 * @version (22-23 agosto)
 */
import java.util.Scanner;//biblioteca para apoiar E/S
public class MetodoClasseMath{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);// instancio (crio) objeto que representa o teclado quem faz isto e o NEW
        double soma, subtracao, multiplica, divisao;
        int divisaoInt;
        System.out.println("\f");//limpando a tela
        System.out.println("\f Informe o primeiro numero inteiro: ");//observe que coloquei \f para limpar a tela
        int numero1 = teclado.nextInt();//aqui uso o metodo nextInt que converte String em numero int
        System.out.println("\n Informe o segundo numero inteiro: ");
        double numero2 = teclado.nextDouble();//aqui uso o metodo nextDouble que converte String em numero real
        /**
         * + - adicao e subtracao ex. soma=soma+8;//atualizacao de conteudo
         * ++ --    incremento, decremento soma++; soma=soma+1;
         * * / %    Multiplicacao, divisao e modulo (inteiros) ou resto da divisao inteira
         * 
         */
        System.out.println("\n Numeros lidos ");
        System.out.print("\n 1o numero: " + numero1); //<<<<< uso do print <<<<<
        System.out.println(" **** 2o numero: " + numero2);
        soma=numero1+numero2;
        System.out.println("\n \n Soma dos numeros lidos: " + soma);
        subtracao=numero1-numero2;
        System.out.println("\n Subtracao dos numeros lidos: " + subtracao);
        multiplica= numero1 *numero2;
        System.out.println("\n multiplicacao dos numeros lidos: " + multiplica);
        divisao=numero1/numero2;
        System.out.println("\n divisao real dos numeros lidos: " + divisao);//atencao!! se um dos numeros for REAL a divisao ocorre com casas decimais
        divisaoInt= 12/4;
        // 1/4 --- 0 pq e divisao inteira 1/4. <<< tratando 4 como 4.0 ? ou 1/4.0 transformo a operacao de divisao inteira em divisao real
        System.out.println("\n divisao inteira de 12 & 4: " + divisaoInt);
        divisaoInt= 4/12;
        System.out.println("\n divisao inteira de 4 & 12: " + divisaoInt);
        //observem o resultado!!!! porque isto ocorreu?
       /**
        * usando a classe Math para operacoes matematicas "especiais"
        * A classe Math nos proporciona uma serie de operacoes e constantes matematicas
        * que sao acessadas estaticamente, ou seja, nao precisamos instanciar um objeto para podermos usar seus metodos.
        * *****************************************************************************
        * pow (base, expoente) - calcula a poencia da base elevada ao expoente.
        * sqrt (numero) - calcula a raiz quadrada de um numero
        * cbrt (numero) - calcula  a raiz cubica de um numero
        * exp (expoente) - calcula o valor da constante de Euler (E) elevado ao expoente
        * log (numero) - logaritmo natural de um numero
        * log10 (numero) - logaritmo natural de um numero na base 10
        * abs (numero) - retorna o valor absoluto do mesmo tipo do parametro 
        * (ex.: inteiro retorna int positivo, decimal retorna float positivo, etc)
        * ceil (decimal) - este metodo retorna o valor decimal do parametro sem a parte fracionada. Ex.: 2.1 sera 2, 6.0 sera 6, 10.8 sera 10...
        * round (decimal) - retorna o arredondamento aritmetico do numero decimal passado como parametro
        * *****************************************************************************
        */
        
       System.out.println("\n numero inteiro elevado ao cubo: " + Math.pow (numero1,3));
       System.out.println("\n numero real elevado ao cubo: " + Math.pow (numero2,3));
       
       System.out.println("\n Raiz quadrada: " + Math.sqrt (numero1));
       
       System.out.println("\n Raiz cubica: " + Math.cbrt (numero1));
        
       System.out.println("\n Raiz oitava (sem revisao): " + Math.pow (numero1, 1/8));  //observem o resultado!!!! porque isto ocorreu?
       System.out.println("\n Raiz oitava (com revisao do valor): " + Math.pow (numero1, 1/8.));//<<<<<atencao detalhe..o que fiz de diferente?
         
        /**
         * sin (graus) - este metodo retorna o valor do seno de acordo com o numero de graus passado como parametro
         * cos (graus) - este metodo retorna o valor do coseno de acordo com o numero de graus passado como parametro
         * tan (graus) - este metodo retorna o valor da tangente de acordo com o numero de graus passado como parametro
         * asin (graus) - este metodo retorna o valor do arco seno de acordo com o numero de graus passado como parametro
         * acos (graus) - este metodo retorna o valor do arco coseno de acordo com o numero de graus passado como parametro
         * atan (graus) - este metodo retorna o valor do arco tangente de acordo com o numero de graus passado como parametro
         * sinh (graus) - este metodo retorna o valor hiperbolico do seno de acordo com o numero de graus passado como parametro
         * cosh (graus) - este metodo retorna o valor hiperbolico do coseno de acordo com o numero de graus passado como parametro
         * tanh (graus) - este metodo retorna o valor hiperbolico da tangente de acordo com o numero de graus passado como parametro
         * toDegrees (raio) - retorna um valor aproximado de graus de acordo com o angulo medido em raios
         * toRadians (graus) - retorna um valor aproximado de radianos de acordo com o angulo medido em graus.
         */
        
       //atencao MUITO util
       /**
        * hypot (x , y) - retorna o valor da hipotenusa, ou, basicamente, a distancia entre dois pontos fundamentada
        * na formula [sqrt (pow(x, 2) + pow(y,2))]
        */
       

    }

}