
import java.io.PrintWriter;

/**
 * Esta clase representa el area y el perimetro
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */

abstract class Shape {
    
   public void print(PrintWriter out) {
  
   }
   
   /**
    * Devuelve el area
    * @return devuelve 0.
   */
   public double getArea()
   {
       return 0;
       
   }
   
   /**
     * Devuelve el perimetro.
     * @return devuelve 0.
     */
   public double getPerimeter()
   {
       return 0;
   }
   
}
