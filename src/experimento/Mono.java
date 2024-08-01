
package experimento;


public class Mono implements Animal{
    @Override
    public String comer() {
        return "El mono come frutas";
    }

    @Override
    public String dormir() {
        return "El mono duerme en su árbol";
    }

    @Override
    public String hacerRuido() {
        return "El mono grita";
    }
    
}
