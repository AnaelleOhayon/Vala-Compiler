/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Primitives.Coordinate;


public class CoordinateTest {
	@Test
	public void test() {
	Coordinate c=new Coordinate(3);
	Coordinate d=new Coordinate(5);
	assertEquals(3,c.getCoordinate());
	assertEquals(5,d.getCoordinate());
	}
	
	@Test
	public void test2() {
	Coordinate c=new Coordinate();
	Coordinate d=new Coordinate();
	c.setCoordinate(3);
	d.setCoordinate(5);
    assertEquals(3,c.getCoordinate());
	assertEquals(5,d.getCoordinate());
	}
	@Test
	public void test3() {
		Coordinate c=new Coordinate(3);
		Coordinate d=new Coordinate(3);
        assertTrue( c.equals(d));
		
	}
	@Test
	public void test4() {
		Coordinate c=new Coordinate(3);
		String f=c.toString();
		assertEquals("coordinate="+c.getCoordinate(),f);
		
		
	}
	}



