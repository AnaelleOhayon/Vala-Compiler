/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import Geometries.Sphere;
import Primitives.Point3D;
import Primitives.Vector;

class SphereTest {

	@Test
	void testGetNormal() {
		Color c=new Color(255);
		Vector v=new Vector(1,2,4);
		Point3D p=new Point3D(1,0,3);
		Sphere s=new Sphere(c,p,4,v);
		Point3D p2=new Point3D(3,0,2);
		Point3D p3=new Point3D(2,0,-1);
		Vector v2=new Vector(p3);
		assertEquals(v2,s.getNormal(p2));
	}

}
