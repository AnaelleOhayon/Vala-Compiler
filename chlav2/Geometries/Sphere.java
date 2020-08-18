/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Geometries;

import java.awt.Color;

import Primitives.Point3D;
import Primitives.Vector;

public class Sphere extends Geometry {

	protected Point3D p;
	protected double radius;
	protected Vector direction;
	//***************** Constructors ********************** // 
	public Sphere() 
	{
		super();
		p=new Point3D();
		radius=0.0;
		direction =new Vector();
	}
	public Sphere(Sphere s)
	{
		color=s.color;
		p=s.p;
		radius=s.radius;
		direction=s.direction;
	}
	public Sphere(Color color, Point3D p, double radius, Vector direction) {
		super(color);
		this.p = p;
		this.radius = radius;
		this.direction = direction;
	}
	//***************** Getters/Setters ********************** // 

	public Point3D getP() {
		return p;
	}
	public void setP(Point3D p) {
		this.p = p;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Vector getDirection() {
		return direction;
	}
	public void setDirection(Vector direction) {
		this.direction = direction;
	}
	//***************** Administration  ******************** // 
	@Override
	public String toString() {
		return "Sphere [p=" + p + ", radius=" + radius + ", direction=" + direction + ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sphere other = (Sphere) obj;
		if (direction == null) {
			if (other.direction != null)
				return false;
		} else if (!direction.equals(other.direction))
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	//***************** Operations ******************** // 
	@Override
	public Vector getNormal(Point3D p2) {
		// TODO Auto-generated method stub
		return new Vector(p2.subtract(p));
		
	}


	
}
