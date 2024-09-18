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
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                qtd += x;
            }
        }
        return qtd;
    }
}