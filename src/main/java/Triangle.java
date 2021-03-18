
import java.io.PrintWriter;

/**
 * Esta clase nos permite obtener cualquiera esquina del triangulo (3)
 * Representa a un triangulo en 3 dimensiones
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

class Triangle extends TwoDimensionalShape {

    //Variables punto1, punto2 y punto3
    private Point point1, point2, point3;

    public Triangle() {
    }

    
    /**
     * Constructor por defecto 
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Metodo que nos devuelve el valor del primer punto
     * @return Metodo que nos devuelve el valor del primer punto
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * Metodo que establece el valor del primer punto
     * @return Metodo que establece el valor del primer punto
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * Metodo que nos devuelve el valor del segundo punto
     * @return Metodo que nos devuelve el valor del segundo punto
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    /**
     * Metodo que establece el valor del segundo punto
     * @return Metodo que establece el valor del segundo punto
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * Metodo que nos devuelve el valor del tercer punto
     * @return Metodo que nos devuelve el valor del tercer punto
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * Metodo que establece el valor del tercer punto
     * @return Metodo que establece el valor del tercer punto
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * Imprime todas las caracteristicas por pantalla
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Traiangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Metodo que obtiene el area, crea dos variables area y perimetro, usamos el metodo Math.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Metodo que obtiene el perimetro, creamos la variable sum.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
