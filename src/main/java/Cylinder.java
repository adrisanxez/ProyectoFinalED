
import java.io.PrintWriter;

/**
 * Esta clase nos permite obtener el radio y la altura de un cilindro
 * Representa a un cilindro en 3 Dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

class Cylinder extends ThreeDimensionalShape{
    //Variable que inicializa la altura y el radio
    double radius , height;

    public Cylinder() {
    }

    
    /**
     * Constructur por defecto 
     */
    public Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }


    public Cylinder(Cylinder cyl)
    {
        this.radius = cyl.radius;
        this.height = cyl.height;
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
     * Metodo que obtiene el area de la superficie del cilindro
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * Metodo que obtiene el volumen del cono
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    
    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}
