
import java.io.PrintWriter;

/**
 * Con esta clase podemos obtener la distancia que existe entre dos puntos 
 * que se encuentran en un eje de coordenadas cartesianas, x e y en este caso.
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */
class Point 
{
    // Variable x e y, representan dos puntos del eje de coordenadas
    private double x ;
    private double y;

    /**
     * Constructor por defecto, establece el valor de x e y
     */
    public Point() 
    {
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * Constructor que inicializa x e y
     */
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
     /**
     * Establece los valores de x e y a dos puntos. 
     */
    public Point(Point pnt)
    {
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * Devuelve el valor de x
     * @return Devuelve el valor de x
     */
    public double getX() 
    {
        return x;
    }
    
    
     /**
     * Establece el valor de x
     * @return Establece el valor de x
     */
    public void setX(double x) 
    {
        this.x = x;
    }
    
    
    /**
     * Devuelve el valor de y
     * @return Devuelve el valor de y
     */
    public double getY() 
    {
        return y;
    }
    
    
     /**
     * Establece el valor de y
     * @return Establece el valor de y
     */
    public void setY(double y) 
    {
        this.y = y;
    }
    
    
    /**
     * Devuelve la distancia entre un punto y otro (x e y), calcula la longitud de 
     * la linea.
     */
    public double  distance(Point p)
    {
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
