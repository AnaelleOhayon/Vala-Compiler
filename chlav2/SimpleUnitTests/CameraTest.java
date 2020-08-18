/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Elements.Camera;
import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

class CameraTest {

	@Test
	void testConstructRayThroughPixel() {
		Point3D P0=new Point3D(0,0,0);
		Point3D p0=new Point3D(P0);
		Vector v1=new Vector(0,1,0);//Vup
		Vector v2=new Vector(0,0,-1);//Vto
		Camera c=new Camera(p0,v1,v2);
        Vector v=new Vector(50.0,-50.0,-100.0);
        Ray r=new Ray(P0,v);
        Ray r2=new Ray();
        r2=c.constructRayThroughPixel(3, 3, 3, 3, 100, 150, 150);
        r2.toString();
        assertEquals(r,r2);
       
	}
/*
 * 
 * pc=200?0?0
 * VRIGHT=0
 * -250 0 0
 * _50 0 0
 * 
 * */
}
