

/**
 * intersecao de vetores
 *
 * @author (giraffa)
 * aula de 4 de novembro
 */
public class VetoresInter
     {
       
        
        public static void imprime (int [] vetor) 
        { 
            for(int i=0;i<vetor.length;i++){
         System.out.print( vetor[i]+ " ");
        }
    }
        
        
        public static void main(String[] args) { 
        {
              int [] vetA = new int[3];
              int [] vetB = new int[3];
              int [] vetC = new int[vetA.length+vetB.length];
              int aux=0;
                vetA[0] = 5;
                vetA[1] = 61;
                vetA[2] = 15;
                
                vetB[0] = 7;
                vetB[1] = 15;
                vetB[2] = 5;
                
               System.out.println ("\n Elementos do vetor A");
                imprime(vetA);
                System.out.println ("\n Elementos do vetor B");
                imprime(vetB);
                
               for(int i=0; i<vetA.length; i++){
                
                   for(int j=0; j<vetB.length; j++){
                    
                       if(vetA[i] == vetB[j]){
                        vetC[aux] = vetA[i]; aux++;
                        //se tem igual coloca em C
                    } 
                }
            }            
            
            System.out.println ("\n Elementos do vetor C intersecao");
                int preenchido=0;
                if (aux<vetC.length) { preenchido=aux;}
                    else {preenchido=vetC.length;}
                
                for(int i =0;i<preenchido;i++)
                {
                    System.out.print(vetC[i]+ " ");
                }
                   
               }
            
       
    }
    }


 



