
import java.io.PrintWriter;

/**
 * Esta clase nos permite obtener el radio de la esfera
 * Representa a una esfera en 2 dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

public class Sphere extends ThreeDimensionalShape{
    //Variable radio
    double radius ;

    public Sphere() {
    }
    
    
    /**
     * Constructor por defecto
     * @param radius
     */
    public Sphere(double radius) 
    {
        this.radius = radius;
    }

    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * Nos devuelve el valor del radio
     * @return valor del radio
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor del radio
     * @param radius
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Metodo que nos hace el area de la superficie de la esfera
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * Metodo que nos hace el volumen de la esfera
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
