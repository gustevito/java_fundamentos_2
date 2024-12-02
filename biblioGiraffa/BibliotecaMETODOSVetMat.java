/*
 * conjuntos de metodos  estudados ao longo do semestre 
 * Fundamentos 10 *** 2024/2
 */


public class BibliotecaMETODOSVetMat
{
    public void imprimeVetorInt(int[] vetor)
    {   //imprime um vetor de inteiros
         System.out.print("\n");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.print("|"+vetor[i]);
        }
        System.out.print("|\n");
            
    }
    
    public void imprimeVetorDouble(double[] vetor)
    {   //imprime um vetor de doubles
         System.out.print("\n");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.print("|"+vetor[i]);
        }
        System.out.print("|\n");
            
    }
    
    public int maiorVetorInt(int[] vetor)
    {   //retorna o maior valor em um vetor de inteiros
        int maior = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]>maior)
            {
                maior = vetor[i];
            }
        }
        return maior;
            
    }
    
    public double maiorVetorDouble(double[] vetor)
    {   //retorna o maior valor em um vetor de doubles
        double maior = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]>maior)
            {
                maior = vetor[i];
            }
        }
        return maior;
            
    }
    
    public int menorVetorInt(int[] vetor)
    {   //retorna o menor valor em um vetor de inteiros
        int menor = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]<menor)
            {
                menor = vetor[i];
            }
        }
        return menor;
            
    }
    
    public double menorVetorDouble(double[] vetor)
    {   //retorna o menor valor em um vetor de doubles
        double menor = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]<menor)
            {
                menor = vetor[i];
            }
        }
        return menor;
            
    }
    
    public int[] ordenaVetorInt(int[] vetor)
    {   //ordena um vetor de inteiros (crescente)
        int aux = 0;
        boolean troca = false;
        do{
            troca = false;
            for(int i = 0; i<vetor.length-1;i++)
            {
                if(vetor[i]>vetor[i+1])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca);
        return vetor;
            
    }
    
    public double[] ordenaVetorDouble(double[] vetor)
    {   //ordena um vetor de doubles (crescente)
        double aux = 0;
        boolean troca = false;
        do{
            troca = false;
            for(int i = 0; i<vetor.length-1;i++)
            {
                if(vetor[i]>vetor[i+1])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca);
        return vetor;
            
    }
    
    
    public int[] multiplicaVetorInt(int[] vetor, int num)
    {   //multiplica os elementos de um vetor de ints por um int
        for(int i = 0; i<vetor.length;i++)
        {
            vetor[i]=vetor[i]*num;
        }
        
        return vetor;
            
    }
    
    public double[] multiplicaVetorDouble(double[] vetor, double num)
    {   //multiplica os elementos de um vetor de doubles por um double
        for(int i = 0; i<vetor.length;i++)
        {
            vetor[i]=vetor[i]*num;
        }
        
        return vetor;
            
    }
    
    public int[] somaVetorInt(int[] vetor1, int[] vetor2)
    {   //soma os elementos de dois vetores int
        
        
        if(vetor1.length<vetor2.length)
        {
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i] + vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public double[] somaVetorDouble(double[] vetor1, double[] vetor2)
    {   //soma os elementos de dois vetores double
        
        
        if(vetor1.length<vetor2.length)
        {
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i] + vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public int[] produtoVetorInt(int[] vetor1, int[] vetor2)
    {   //multiplica os elementos de dois vetores int e gera num vetor **nao e produto escalar
        
        
        if(vetor1.length<vetor2.length)
        {
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public double[] produtoVetorDouble(double[] vetor1, double[] vetor2)
    {   //multiplica os elementos de dois vetores double
        
        
        if(vetor1.length<vetor2.length)
        {
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public int[] uniaoVetorInt(int[] vetor1, int[] vetor2)
    {   //faz a uniao entre dois vetores de numeros inteiros, assumindo que elementos nao repetem dentro dos próprios vetores (podem repetir entre (termo comum) os vetores)
        int count  = 0;
        int[] temp = new int[vetor2.length]; // vetor temporário para receber os termos no vetor 2 que nao estao no vetor 1
        int tempIndex = 0;
        
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        
        boolean unico = true;
        for (int i = 0; i<tamanho2; i++) //verifica quantos elementos repetidos existem entre os vetores e coloca os nao repetidos do vetor 2 em um vetor temporário
        {
            for(int j= 0; j<tamanho1; j++)
            {
                
                if(vetor2[i]==vetor1[j]) // checamos cada termo do vetor 2 com todos os termos do vetor1
                {
                    count++;
                    unico = false; // o termo do vetor2 existe no vetor1
                }
            }
            if(unico)// se o termo do vetor 2 nao existe no vetor 1...
            {
             temp[tempIndex]=vetor2[i];// ...entao ele é colocado em um vetor temporario
             tempIndex++;   
            }
            unico = true;
        }
        
        int[] vetor3 = new int[tamanho1 + tamanho2 - count]; //declara o vetor que receberatodos os termos com o tamanho correto
        for(int i = 0; i<tamanho1; i++)// colocando os termos do vetor 1 no novo vetor
        {
            vetor3[i]=vetor1[i];
        }
        for(int i = 0; i<(tamanho2-count); i++)// colocando os termos nao repetidos do vetor 2 no novo vetor
        {
            vetor3[tamanho1+i]=temp[i];
        }
        return vetor3;
        
    }
    
    public double[] uniaoVetorDouble(double[] vetor1, double[] vetor2)
    {   //faz a uniao entre dois vetores de numeros double, assumindo que elementos nao repetem dentro dos próprios vetores (podem repetir entre (termo comum) os vetores)
        int count  = 0;
        double[] temp = new double[vetor2.length]; // vetor temporário para receber os termos no vetor 2 que nao estao no vetor 1
        int tempIndex = 0;
        
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        
        boolean unico = true;
        for (int i = 0; i<tamanho2; i++) //verifica quantos elementos repetidos existem entre os vetores e coloca os nao repetidos do vetor 2 em um vetor temporário
        {
            for(int j= 0; j<tamanho1; j++)
            {
                
                if(vetor2[i]==vetor1[j]) // checamos cada termo do vetor 2 com todos os termos do vetor1
                {
                    count++;
                    unico = false; // o termo do vetor2 existe no vetor1
                }
            }
            if(unico)// se o termo do vetor 2 nao existe no vetor 1...
            {
             temp[tempIndex]=vetor2[i];// ...entao ele é colocado em um vetor temporario
             tempIndex++;   
            }
            unico = true;
        }
        
        double[] vetor3 = new double[tamanho1 + tamanho2 - count]; //declara o vetor que receberatodos os termos com o tamanho correto
        for(int i = 0; i<tamanho1; i++)// colocando os termos do vetor 1 no novo vetor
        {
            vetor3[i]=vetor1[i];
        }
        for(int i = 0; i<(tamanho2-count); i++)// colocando os termos nao repetidos do vetor 2 no novo vetor
        {
            vetor3[tamanho1+i]=temp[i];
        }
        return vetor3;
        
    }
    
    public int[] interVetorInt(int[] vetor1, int[] vetor2)
    {// faz a intersecao entre dois vetores int, sendo que os vetores nao possuim termos repetidos internamente
        int[] temp = new int[vetor1.length]; // vetor temporario para mater as variaveis, seu tamanho precisa ser maior do que o menor vetor (aqui escolhemos arbitrariamente um dos vetores)
        int tempIndex = 0;
        
        for (int i =0; i<vetor1.length; i++)
        {
            for(int j = 0; j<vetor2.length;j++)
            {
                if(vetor1[i] == vetor2[j])
                {
                    temp[tempIndex]=vetor1[i]; //coloca os valores comuns nos dois vetores no vetor temporario
                    tempIndex++;
                    break;
                }
            }
        }
        
        int[] vetor3 = new int[tempIndex]; // vetor a ser retornado, do tamanho certo
        
        for(int i =0; i<tempIndex;i++)
        {
            vetor3[i]=temp[i];
        }
        return vetor3;
        
    }
    
    public double[] interVetorDouble(double[] vetor1, double[] vetor2)
    {// faz a interseccoao entre dois vetores double, sendo que os vetores nao possuim termos repetidos internamente
        double[] temp = new double[vetor1.length]; // vetor temporario para mater as variaveis, seu tamanho precisa ser maior do que o menor vetor (aqui escolhemos arbitrariamente um dos vetores)
        int tempIndex = 0;
        
        for (int i =0; i<vetor1.length; i++)
        {
            for(int j = 0; j<vetor2.length;j++)
            {
                if(vetor1[i] == vetor2[j])
                {
                    temp[tempIndex]=vetor1[i]; //coloca os valores comuns nos dois vetores no vetor temporario
                    tempIndex++;
                    break;
                }
            }
        }
        
        double[] vetor3 = new double[tempIndex]; // vetor a ser retornado, do tamanho certo
        
        for(int i =0; i<tempIndex;i++)
        {
            vetor3[i]=temp[i];
        }
        return vetor3;
        
    }
    
    public int produtoEscalarInt(int[] vetor1, int[] vetor2)
    {   //retorna o produto escala de dois vetores inteiros com mesmo tamanho, e 0 se os vetores tem tamanho diferente
        if(vetor1.length!=vetor2.length)
        {
            return 0;
        }
        int produto=0;
        for (int i =0; i<vetor1.length; i++)
        {
            produto+=vetor1[i]*vetor2[i];
        }
        return produto;
        
    }
    
    public double produtoEscalarInt(double[] vetor1, double[] vetor2)
    {   //retorna o produto escala de dois vetores double com mesmo tamanho, e 0 se os vetores tem tamanho diferente
        if(vetor1.length!=vetor2.length)
        {
            return 0;
        }
        double produto=0;
        for (int i =0; i<vetor1.length; i++)
        {
            produto+=vetor1[i]*vetor2[i];
        }
        return produto;
        
    }
    
    
       
    public int somaTotalVetorInt(int[] vetor)
    {   // soma todos os elementos de um vetor de inteiros
        int total = 0;
        for( int i = 0 ; i<vetor.length;i++)
        {
            total+=vetor[i];
        }
        return total;
    }
    
    public double somaTotalVetorDouble(double[] vetor)
    {   // soma todos os elementos de um vetor de inteiros
        double total = 0;
        for( int i = 0 ; i<vetor.length;i++)
        {
            total+=vetor[i];
        }
        return total;
    }
    
    // ********************* parte 3 ******************* operações com Matrizes (vetor de vetor)
     public void imprimeMatrizInt(int[][] matriz)
    {
        for (int i = 0; i<matriz.length;i++)
        {
            System.out.print("\n");
            for(int j= 0; j<matriz[i].length;j++)
            {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.print("|");
        }
        
    }
    public void imprimeMatrizDouble(double[][] matriz)
    {
        for (int i = 0; i<matriz.length;i++)
        {
            System.out.print("\n");
            for(int j= 0; j<matriz[i].length;j++)
            {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.print("|");
        }
        
    }
    
    ///****************destaque  para possiveis solucoes dos exercicios de 11/11
    
    public int[] diagonalInt(int[][] matriz)
    {   //imprime a diagonal principal de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public double[] diagonalInt(double[][] matriz)
    {   //imprime a diagonal principal de uma matriz quadrada de doubles e retorna um vetor com estes termos
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public int[] secundariaInt(int[][] matriz)
    {   //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public double[] secundariaDouble(double[][] matriz)
    {   //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
        
    public boolean matrizDiagonalInt(int[][] matriz)
    {   //checa se uma matriz é diagonal (int)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i!=j)
                {
                    if(matriz[i][j]!=0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean matrizDiagonalDouble(double[][] matriz)
    {   //checa se uma matriz é diagonal (double)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i!=j)
                {
                    if(matriz[i][j]!=0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean matrizUnidadeInt(int[][] matriz)
    {   //checa se uma matriz é uma matriz unidade (int)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i==j)
                {
                    if(matriz[i][j]!=1)
                    {
                        return false;
                    }
                }
                else if (matriz[i][j]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean matrizUnidadeInt(double[][] matriz)
    {   //checa se uma matriz é uma matriz unidade (double)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i==j)
                {
                    if(matriz[i][j]!=1)
                    {
                        return false;
                    }
                }
                else if (matriz[i][j]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean matrizEsparsaInt(int[][] matriz)
    {   //retorna true se a matriz tem mais de 50% dos elementos iguais a zero
        //Uma matriz é dita esparsa quando possui uma grande quantidade de elementos com valor zero 
        //Matrizes esparsas são matrizes nas quais a maioria das posições é preenchida por zeros. 
        //Para essas matrizes,podemos economizar um espaço significativo de memória se apenas os termos diferentes de zero forem
        //armazenados. As operações usais sobre essas matrizes (somar, multiplicar, inverter, pivotar) também podem
        //ser feitas em tempo muito menor se não armazenarmos as posições que contêm zeros; 
        //Na disciplina de estrutura de dados farao isto com listas encadeadas
        double count = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                
                if(matriz[i][j]==0)
                {
                    count+=1.0;
                }
                
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5)
        {
            return true;
        }
        return false;
    }
    
    public boolean matrizEsparsaDouble(double[][] matriz)
    {   //retorna true se a matriz (retangular) tem mais de 50% dos elementos iguais a zero
        double count = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                
                if(matriz[i][j]==0)
                {
                    count+=1.0;
                }
                
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5)
        {
            return true;
        }
        return false;
    }
    
    public int[][] somaMatrizInt(int[][] matriz1, int[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (int)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=somaVetorInt(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    public double[][] somaMatrizDouble(double[][] matriz1, double[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (double)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=somaVetorDouble(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    //*** para pensar não  e o algoritmo sugerido no texro verso que s epoaia na existencia de um  outro metodo 
    public int[][] produtoMatrizInt(int[][] matriz1, int[][] matriz2)
    {   //multiplica os elementos de duas matrizes de mesmo tamanho (int)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=produtoVetorInt(matriz1[i],matriz2[i]);//????o que este metodo faria? "desafio" como foi esta ideia?
        }
        return matriz1;
    }
    
    public double[][] produtoMatrizDouble(double[][] matriz1, double[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (double)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=produtoVetorDouble(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
}