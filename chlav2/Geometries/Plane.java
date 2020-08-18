/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Geometries;

import java.awt.Color;

import Primitives.Point3D;
import Primitives.Vector;

public class Plane extends Geometry{
	
protected Point3D points;
protected Vector vect;
//***************** Constructors ********************** // 
public Plane() {
	super();
	points=new Point3D();
	vect=new Vector();
	}
public Plane(Color color,Point3D points, Vector vect) {
	super(color);
	this.points = points;
	this.vect = vect;
}
public Plane(Plane p)
{
	color=p.color;
	points=p.points;
	vect=p.vect;
}
//***************** Getters/Setters ********************** // 
public Point3D getPoints() {
	return points;
}
public void setPoints(Point3D points) {
	this.points = points;
}
public Vector getVect() {
	return vect;
}
public void setVect(Vector vect) {
	this.vect = vect;
}
//***************** Administration  ******************** // 
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Plane other = (Plane) obj;
	if (points == null) {
		if (other.points != null)
			return false;
	} else if (!points.equals(other.points))
		return false;
	if (vect == null) {
		if (other.vect != null)
			return false;
	} else if (!vect.equals(other.vect))
		return false;
	return true;
}

@Override
public String toString() {
	return "Plane [points=" + points + ", vect=" + vect + ", color=" + color + "]";
}
//***************** Operations ******************** // 
@Override
public Vector getNormal(Point3D p) {
	// TODO Auto-generated method stub
	return vect;
}

}
