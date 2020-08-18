/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Primitives.Vector;

class VectorTest {

	@Test
	void testAdd() {
		Vector v1=new Vector(1,2,3);
		Vector v2=new Vector(1,1,1);
		v1.add(v2);
		Vector v3=new Vector(2,3,4);
		assertEquals(v3,v1);

	}

	@Test
	void testSubtract() {
		Vector v1=new Vector(1,2,3);
		Vector v2=new Vector(1,1,1);
		v1.subtract(v2);
		Vector v3=new Vector(0,1,2);
		assertEquals(v3,v1);
	}

	@Test
	void testScale() {
		Vector v1=new Vector(1,2,3);
		v1.scale(2);
		Vector v2=new Vector(2,4,6);
		assertEquals(v2,v1);

		}

	@Test
	void testCrossProduct() {
		Vector v1=new Vector(1,2,3);
		Vector v2=new Vector(2,3,4);
		Vector v4=new Vector();
		v4=v1.crossProduct(v2);
		Vector v3=new Vector(-1,2,-1);
		assertEquals(v3,v4);
	}

	@Test
	void testLength() {
	Vector v1=new Vector(1,2,3);
	double lenght=Math.sqrt(14);
	assertEquals(lenght,v1.length());
	}

	@Test
	void testNormalize() {
		Vector v1=new Vector(1,2,3);
		double lenght=Math.sqrt(14);
		Vector v3=new Vector(1/lenght,2/lenght,3/lenght);
		assertEquals(v3,v1.normalize());
	}

	@Test
	void testDotProduct() {
		
		Vector v1=new Vector(1,2,3);
		Vector v2=new Vector(2,3,4);
		double product=20;
		assertEquals(product,v1.dotProduct(v2));
	}

}
