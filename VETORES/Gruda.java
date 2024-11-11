
/**
 * justaposicao de vetores
 *
 * @author (giraffa)
 * aula de 4 de novembro
 */
public class Gruda
{
    public static void imprime(int [] vetor) 
    { 
     for (int v:vetor) //ou for(int i=0;i<vetor.length;i++)
     {
         System.out.print (v+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
              int [] vetA = new int[3];
              int [] vetB = new int[3];
              int [] vetC = new int[vetA.length+vetB.length];
              int aux=0;
            vetA[0] = 5;
                vetA[1] = 61;
                vetA[2] = 15;
                
                vetB[0] = 7;
                vetB[1] = 14;
                vetB[2] = 5;
                
                System.out.println ("\n Elementos do vetor A");
                imprime(vetA);
                System.out.println ("\n Elementos do vetor B");
                imprime(vetB);
                //coloco todos de A em C
                
                for(int i=0; i<vetA.length;i++) 
                { 
                 vetC[aux++]=vetA[i];
                }
                               
               //vou colocar os de B em C
                for(int i=0; i<vetB.length;i++) 
                { 
                 vetC[aux++]=vetB[i];
                }                    
                 
                System.out.println ("\n Elementos do vetor C");            
                imprime(vetC);
                   
            }
}
