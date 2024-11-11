

//aula de   *** Fundamentos *** Profa.Giraffa
 public class ComparacaoIgualdadeString 
 {
 public static void main(String[] args) 
 {
     System.out.println ("\f");
     String string1 = "Fundamentos";
     String string2 = "FUNDAMENTOS";
     System.out.println("sao iguais? (sem case sensitive)");
     System.out.println(string1.equals(string2) ? "sim" : "nao");
     //if (string1.equals(string2))  System.out.println("sim")
     //else  System.out.println("nao")
     System.out.println("sao iguais? (com case sensitive)");
     System.out.println(string1.equalsIgnoreCase(string2) ? "sim" : "nao");
     //uso de if ternario
 }
 }
