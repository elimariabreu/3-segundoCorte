
package conversiones;

public class ConversorConcreto extends Aconversor {

    @Override
    double grado2radian() {
        
        return (dato*Math.PI)/180;
        
    }

    @Override
    double farenheit2kelvin() {
        
    }
    
}
