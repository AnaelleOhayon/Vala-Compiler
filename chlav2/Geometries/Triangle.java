/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Geometries;
import java.awt.Color;

import Primitives.Point3D;
import Primitives.Vector;
public class Triangle extends Geometry{
protected Point3D p1;
protected Point3D p2;
protected Point3D p3;

//***************** Constructors ********************** // 
public Triangle()
{
	super();
	 p1=new Point3D();
	 p2=new Point3D();
	 p3=new Point3D();
	
}
public Triangle(Triangle t)
{
	color=t.color;
	p1=t.p1;
	p2=t.p2;
	p3=t.p3;
}
public Triangle(Color color, Point3D p1, Point3D p2, Point3D p3) {
	super(color);
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}
//***************** Getters/Setters ********************** // 

public Point3D getP1() {
	return p1;
}
public void setP1(Point3D p1) {
	this.p1 = p1;
}
public Point3D getP2() {
	return p2;
}
public void setP2(Point3D p2) {
	this.p2 = p2;
}
public Point3D getP3() {
	return p3;
}
public void setP3(Point3D p3) {
	this.p3 = p3;
}
//***************** Administration  ******************** // 

@Override
public String toString() {
	return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", color=" + color + "]";
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Triangle other = (Triangle) obj;
	if (p1 == null) {
		if (other.p1 != null)
			return false;
	} else if (!p1.equals(other.p1))
		return false;
	if (p2 == null) {
		if (other.p2 != null)
			return false;
	} else if (!p2.equals(other.p2))
		return false;
	if (p3 == null) {
		if (other.p3 != null)
			return false;
	} else if (!p3.equals(other.p3))
		return false;
	return true;
}
//***************** Operations ******************** // 
@Override
public Vector getNormal(Point3D p) {
	// TODO Auto-generated method stub
		Vector v1 = new Vector(p.subtract(p1));
		Vector v2 = new Vector(p.subtract(p2));
		Vector v = v2.crossProduct(v1).normalize();
		return v;
}

}
