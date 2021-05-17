
import java.io.PrintWriter;

/**
 * Esta clase nos permite obtener la longitud de un cubo
 * Representa a un cubo en 3 dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 * 
 */

 class Cube extends ThreeDimensionalShape{
    //Variable que inicializa la longitud
     double length;

    public Cube() {
    }

    
    /**
     * @param Constructor por defecto
     * Constructor por defecto 
     */
    public Cube(double length) 
    {
        this.length = length;
    }
    
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     * Devuelve el valor de la longitud del cubo
     * @return Devuelve el valor de la longitud del cubo
     */
    public double getLength() 
    {
        return length;
    }

    
    /**
     * Establece el valor de la longitud del cubo
     * @return Establece el valor de la longitud del cubo
     */
    public void setSideLength(double length) 
    {
        this.length = length;
    }

    
    
    /**
     * Metodo que nos obtiene el area de la superficie.
     * @return Metodo que nos obtiene el area de la superficie.
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    /**
     *  Metodo que nos obtiene el volumen.
     * @return Metodo que nos obtiene el volumen.
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
