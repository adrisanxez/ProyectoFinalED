
import java.io.PrintWriter;

/**

 * Esta clase nos permite obtener el radio y la altura de un cono
 * Representa a un cono en 3 dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 * 
 */

 class Cone extends ThreeDimensionalShape{
    //Variables radio y altura
    double radius;
    double height;

    public Cone() 
    {
    }

    
    /**
     * Constructor por defecto que coge el radio y la altura 
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
    }
    
    
  
    /**
     * Devuelve el valor del radio
     * @return Devuelve el valor del radio.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor de la radio.
     * @return establece el valor del radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    
    /**
     * Devuelve el valor del la altura
     * @return Devuelve valor de la altura.
     */
    public double getHeight() 
    {
        return height;
    }

    
    
    /**
     * Establece el valor del la altura
     * @return Establece el valor de la altura.
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Metodo que obtiene el area del cono
     */
    @Override
    public double getSurfaceArea() 
    {

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * Metodo que obtiene el volumen del cono
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}
