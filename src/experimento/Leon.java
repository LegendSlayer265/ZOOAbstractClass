
package experimento;


public class Leon implements Animal {

        @Override
    public String comer() {
        return "El león come carne";
    }

    @Override
    public String dormir() {
        return "El león duerme en su jaula";
    }

    @Override
    public String hacerRuido() {
        return "El león ruge";
    }
    
}
