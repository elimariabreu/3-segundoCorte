
package conversiones;


public class Conversiones {

    public static void main(String[] args) {
        ConversorConcreto miConversor= new ConversorConcreto();
        miConversor.dato=60.12;
        
        System.out.println(miConversor.farenheit2kelvin());
        System.out.println(miConversor.grado2radian());
        
        ConversorImplementado miImplementado= new ConversorImplementado();
        miImplementado.valor=50.01;
        System.out.println(miImplementado.grado2radian());
        System.out.println(miImplementado.kelvin2celsius());
    }
    
}
