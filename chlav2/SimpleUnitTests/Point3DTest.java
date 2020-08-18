/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Primitives.Point3D;
import Primitives.Vector;

class Point3DTest {

	@Test
	void testAdd() {
		Point3D p1=new Point3D(1,2,3);
		Vector p2=new Vector(1,1,1);
		p1.add(p2);
		Point3D p3=new Point3D(2,3,4);
		assertEquals(p3,p1);
	}

	@Test
	void testSubtractVector() {
		Point3D p1=new Point3D(1,2,3);
		Vector p2=new Vector(1,1,1);
		p1.subtract(p2);
		Point3D p3=new Point3D(0,1,2);
		assertEquals(p3,p1);
	}

	@Test
	void testSubtractPoint3D() {
		Point3D p1=new Point3D(1,2,3);
		Point3D p2=new Point3D(1,1,1);
		Point3D p3=new Point3D();
		p3=p1.subtract(p2);
		Point3D p4=new Point3D(0,1,2);
		assertEquals(p4,p3);
	}

}
