
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *  Main class del proyecto
 * 
 * @author  Adrian Sanchez
 * @version 1 Date: 15/03/2021
 */
public class Project4 {

    public static void main(String args[]) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(args[0]));
            ArrayList<Shape> myShapes = new ArrayList<Shape>(30);
            
            /*
            Creamos 4 variables y le asignamos valores a 2 de ellas.
            */
            Point pt1 = new Point(1, 1);
            Point pt2 = new Point(5, 8);
            Point pt3;
            Point pt4 = new Point();
            
            
            /*
            * Con el metodo Triangle creamos 3 triangulos con los puntos 
            * que hemos creado anteriormente
            */
            
            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            pt1.setX(2);
            pt1.setY(2);
            pt2 = new Point(2, 8);
            pt3 = new Point(12, 2);
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            Triangle triangle_3 = new Triangle(triangle_2);

            /*
            * Cambiamos los valores del triangulo 2
            */
            triangle_2.setPoint2(new Point(5, 8));
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            /*
            * Con el metodo Circle creamos 3 circulos con el punto central
            */
            
            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            circle_3 = new Circle(circle_2);
            circle_3.setRadius(5);
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            /*
            * Con el metodo Rectangle creamos 3 rectangulos con los valores 
            * que queramos
            */ 
            
            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            r1.setWidth(3);
            r2.setHeight(10);
            r3 = new Rectangle(r2);
            r3.setHeight(100);
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);
            
            /*
            * Con el metodo Sphere creamos 3 esferas con el radio que deseemos,
            * con el metodo set podemos cambiar el valor
            */ 
            
            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            sphere_3 = new Sphere(sphere_1);
            sphere_3.setRadius(5);
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);

            /*
            * Con el metodo Cube creamos 3 cubos con los valores 
            * que queramos y con el set podemos cambiarlo
            */ 
            
            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            cube_3 = new Cube(cube_1);
            cube_3.setSideLength(5);
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);

            /*
            * Con el metodo Cylinder creamos 3 cilindros con los valores 
            * que queramos y set para cambiarlos
            */ 
            
            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            cy3 = new Cylinder(cy2);
            cy3.setHeight(15);
            cy3.setRadius(10);
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);

            /*
            * Con el metodo Cone creamos 3 conos con los valores 
            * que queramos
            */ 
            
            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            cone_3 = new Cone(cone_1);
            cone_3.setHeight(15);
            cone_3.setRadius(10);
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            /*
            * Bucle for que nos imprime el nombre de la clase a la pertenece cada
            * objeto
            */ 
            
            for (Shape s : myShapes) { 
                
                out.println(s.getClass().getName());
                s.print(out);
                out.println();
            }
            out.close();
        }
        
        /*
        * Captamos un error e imprimir el registro del stack donde se ha iniciado la excepción.
        * 
        */ 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }



    }
}
