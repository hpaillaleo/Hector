
public class Lavadora extends Electrodomestico{
  
    private final static int CARGADEFECTO=5;
  
    private int carga;
  
    public int getCarga() {
        return carga;
    }
  
    public double precioFinal(){
        
        double plus=super.precioFinal();
  
        if (carga>30){
            plus+=50000;
        }
  
        return plus;
    }
  
    public Lavadora(){
        this(PRECIOBASEPORDEFECTO, PESODEFECTO, CONSUMOENERGETICODEFECTO, COLORPORDEFECTO, CARGADEFECTO);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICODEFECTO, COLORPORDEFECTO, CARGADEFECTO);
    }
  
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}