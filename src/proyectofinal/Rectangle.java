 
import java.io.PrintWriter;
/**
 * Esta clase nos permite obtener la longitud y la anchura de un rectangulo.
 * Representa a un cubo en 3 dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

 class Rectangle  extends TwoDimensionalShape{

     //Variable que inicializa la longitud y la anchura
     double length;  
     double width;   
     
    public Rectangle() {
    }

    
    /**
     * Constructor por defecto. 
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Devuelve el valor de la longitud del rectangulo
     * @return Devuelve el valor de la longitud del rectangulo
     */
    public double getLength() 
    {
        return length;
    }

    
    
    /**
     * Establece el valor de la longitud del rectangulo
     * @return Establece el valor de la longitud del rectangulo
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * Devuelve el valor de la anchura del rectangulo
     * @return Devuelve el valor de la anchura del rectangulo
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * Establece el valor de la anchura del rectangulo
     * @return Establece el valor de la anchura del rectangulo
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Metodo que nos devuelve el area.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * Metodo que nos devuelve el perimetro.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * Metodo booleano que nos identifica si el rectangulo es cuadrado o no.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}
