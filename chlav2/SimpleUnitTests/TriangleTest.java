/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import Geometries.Triangle;
import Primitives.Point3D;
import Primitives.Vector;

class TriangleTest {

	@Test
	void testGetNormal() {
		Point3D p1=new Point3D(1,3,0);
		Point3D p2=new Point3D(6,0,2);
		Point3D p3=new Point3D(-2,0,4);
		Point3D p4=new Point3D(1,2,2);

		Color c=new Color(1,20,50);
		Triangle t=new Triangle(c,p1,p2,p3);
		Vector v1=new Vector(p4.subtract(p1));
		Vector v2=new Vector(p4.subtract(p2));
		Vector v3=new Vector(v2.crossProduct(v1).normalize());
		assertEquals(v3,t.getNormal(p4));
	}

}
