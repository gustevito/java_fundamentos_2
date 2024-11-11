
//aula de   *** Fundamentos *** Profa.Giraffa
public class IndiceString 
{
public static void main(String[] args) 
{
        System.out.println ("\f");
        String string1 = "www.exercicios.net";
        int posicao;
        posicao = string1.indexOf("exercicios");
        if (posicao >= 0) {
        System.out.println("A string exercicios comeca na posicao " + posicao);
        } else {
        System.out.println("nao ha exercicios na string");
        }
        posicao = string1.lastIndexOf(".com");
        if (posicao >= 0) {
        System.out.println("A string .com comeca na posicao " + posicao);
        } else {
        System.out.println("nao tem .com na string");
        }
}
}