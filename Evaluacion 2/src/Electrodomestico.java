
public class Electrodomestico {
    protected final static String COLORPORDEFECTO="blanco";
    protected final static char CONSUMOENERGETICODEFECTO='F';
    protected final static double PRECIOBASEPORDEFECTO=100000;
    protected final static double PESODEFECTO=5;
    protected double precioBase;
   
    protected String color;
     protected char consumoEnergetico;
    protected double peso;
   
   
    private void comprobarColor(String color){
   
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLORPORDEFECTO;
        }
          
          
    }
      
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMOENERGETICODEFECTO;
        }
          
   }
    
    public double getPrecioBase() {
        return precioBase;
    }
    
    public String getColor() {
        return color;
    }
   
     
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100000;
                break;
            case 'B':
                plus+=80000;
                break;
            case 'C':
                plus+=60000;
                break;
            case 'D':
                plus+=50000;
                break;
            case 'E':
                plus+=30000;
                break;
            case 'F':
                plus+=10000;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10000;
        }else if(peso>=20 && peso<49){
            plus+=50000;
        }else if(peso>=50 && peso<=79){
            plus+=80000;
        }else if(peso>=80){
            plus+=100000;
        }
   
        return precioBase+plus;
    }
   
    
    public Electrodomestico(){
        this(PRECIOBASEPORDEFECTO, PESODEFECTO, CONSUMOENERGETICODEFECTO, COLORPORDEFECTO);
    }
   
    
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICODEFECTO, COLORPORDEFECTO);
    }
   
    
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
}