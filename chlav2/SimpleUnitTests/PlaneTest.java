/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import Geometries.Plane;
import Primitives.Point3D;
import Primitives.Vector;

class PlaneTest {

	@Test
	void testGetNormal() {
		Vector v=new Vector(1,2,3);
		Point3D p1=new Point3D(4,5,6);
		Color c=new Color(255);
		Plane p=new Plane(c,p1,v);
		assertEquals(v,p.getNormal(p1));
	}

}
