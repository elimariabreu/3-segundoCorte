
package conversiones;


public class ConversorImplementado implements ITransformador{
    double dato;
    double valor;
 

    @Override
    public double grado2radian() {
        return (valor*Math.PI)/180;
        
    }

    @Override
    public double kelvin2celsius() {
     
            return (valor=273.15);
        }
        
    }
    
    

