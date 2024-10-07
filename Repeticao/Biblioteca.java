public class Biblioteca{
    public static int divisoresNatural(int x){
        int qtd = 0;
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                qtd++;
            }
        }
        return qtd;
    }
    
    public static int divisoresProprios(int x){
        int qtd = 0;
        for (int i = 1; i < x; i++){
            if (x % i == 0){
                qtd++;
            }
        }
        return qtd;
    }
    
    public static int divisoresSoma(int x){
        int qtd = 0;
        for(int i = 1; i <= x; i++){
            if (x % i == 0){
                qtd = i + qtd;
            }
        }
        return qtd;
    }
    
    public static int divisoresPropriosSoma(int x){
        int qtd = 0;
        for(int i = 1; i < x; i++){
            if (x % i == 0){
                qtd = i + qtd;
            }
        }
        return qtd;
    }
    
    public static boolean ehPrimo (int x){
        boolean ehP = false;
        int qtd = 0;
        
        qtd = divisoresNatural(x);
        
        if (qtd == 2){
            ehP = true;
        } else{
            ehP = false;
        }
        return ehP;
    }
    
    public static int quantidadeCaracteres (String palavra){
        int qtChars = 0;
        
        for (int i = 0; i < palavra.length(); i++){
            qtChars++;
        } return qtChars;
    }
    
    public static int quantidadeVogais(String palavra){
        int qtChars = 0;
        
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u'){
                qtChars++;                
            };    
        } return qtChars;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}