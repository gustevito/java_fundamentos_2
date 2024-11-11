

//aula de   *** Fundamentos *** Profa.Giraffa
 public class ComparacaoString 
 {
 public static void main(String[] args) 
 {
     System.out.println ("\f");
     String string1 = "Fundamentos";
     String string2 = "FUNDAmentos";
     int comparacao = string1.compareTo(string2);
     System.out.println("comparacao entre string1 e string2 (sensitive case)");
     if (comparacao > 0) {
     System.out.println("string1 e lexicograficamente maior que string2");
     } else if (comparacao < 0) {
     System.out.println("string1 e lexicograficamente menor que string2");
    } else {
    System.out.println("string1 e lexicograficamente igual a string2");
    }
}
}