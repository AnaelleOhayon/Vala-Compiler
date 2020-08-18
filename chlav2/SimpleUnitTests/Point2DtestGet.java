/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package SimpleUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Primitives.Coordinate;
import Primitives.Point2D;

class Point2DtestGet {

	@Test
	public void test() {
		Coordinate c=new Coordinate(3);
		Coordinate d=new Coordinate(5);
        Point2D p=new Point2D(c,d);
		assertEquals(3,p.getX().getCoordinate());
		assertEquals(5,p.getY().getCoordinate());
	}
	@Test
	public void test2()
	{
		Coordinate c=new Coordinate(3);
		Coordinate d=new Coordinate(5);
		Point2D p=new Point2D();
		p.setX(c);
		p.setY(d);
		assertEquals(3,p.getX().getCoordinate());
		assertEquals(5,p.getY().getCoordinate());
	}
	@Test
	public void test3() {
		Coordinate c=new Coordinate(3);
		Coordinate d=new Coordinate(5);
        Point2D p=new Point2D(c,d);
        Point2D p2=new Point2D(c,d);
        assertTrue( p.equals(p2));
		
	}
	@Test
	public void test4() {
		Coordinate c=new Coordinate(3);
		Coordinate d=new Coordinate(5);
		Point2D p=new Point2D(c,d);
		String f=p.toString();
		assertEquals("(x="+p.getX()+",y="+p.getY()+")",f);
		
		
	}

	
}


