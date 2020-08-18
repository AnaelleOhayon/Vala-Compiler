/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Primitives;
import Primitives.Vector;


public class teste {
	 public static void main(String[] args)
         {

     		Point3D pt2=new Point3D(new Coordinate(2),new Coordinate(2),new Coordinate(2));
     		Point3D pt1=new Point3D(new Coordinate(5),new Coordinate(9),new Coordinate(1));
     		Vector vec1=new Vector();
     		Vector vec2=new Vector(pt2);
     		vec1.set_head(pt1);
     		System.out.println(vec1.crossProduct(vec2));
     		System.out.println(vec1.dotProduct(vec2));
     		System.out.println(vec1.toString());
         }
}
