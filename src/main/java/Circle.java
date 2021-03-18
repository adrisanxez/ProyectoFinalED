
import java.io.PrintWriter;
/**
 * Esta clase nos permite obtener el radio y el centro de un circulo
 * Representa a un circulo en 2 dimensiones
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

public class Circle  extends TwoDimensionalShape{
    //Variables radius y center, privadas.
    private double  radius ;
    private Point center;

    /**
     * Constructor por defecto
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
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
     * @return Establece el valor del radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Nos devuelve el valor del centro
     * @return valor del centro
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * Establece el valor del centro
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Imprime el circulo, centro, area, perimetro y radio
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radious = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Metodo que nos devuelve el area.
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Metodo que nos devuelve el perimetro.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

