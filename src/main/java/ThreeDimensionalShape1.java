
/**
 * Esta clase nos obtiene el perimetro y el area de las figuras de 3 dimensiones
 * esta clase esta implementada en casi todas las demas clases.
 * @author Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

abstract class ThreeDimensionalShape extends Shape{
 
    /**
     *@return Metodo que nos devuelve el area de la superficie, devuelve 0.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     *@return Metodo que nos devuelve el volumen, devuelve 0.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
