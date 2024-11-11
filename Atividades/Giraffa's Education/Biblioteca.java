public class Biblioteca{
    public double edificio (double baseE, double alturaE, double areaE, double areaFinal){
        areaE = baseE * alturaE;
        areaFinal = areaE - (areaE * 0.2);
        return areaFinal;
    }
    
    public double garagem (double baseG, double alturaG, double sombra){
        sombra = baseG * alturaG;
        return sombra;
    }
    
    public double terreno (double baseT, double alturaT, double areaT, double resultado){
        areaT = baseT * alturaT;        
        resultado = areaT - garagem();
        return resultado;
    }
}