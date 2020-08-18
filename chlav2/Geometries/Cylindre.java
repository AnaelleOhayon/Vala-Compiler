/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Geometries;

import java.awt.Color;

import Primitives.Point3D;
import Primitives.Vector;
public class Cylindre extends Geometry {

	protected Point3D p;
	protected double radius;
	//***************** Constructors ********************** // 
	public Cylindre()
	{
		super();
		p=new Point3D();
		radius=0.0;
	}
	public Cylindre(Cylindre c)
	{
		color=c.color;
		p=c.p;
		radius=c.radius;
	}
	public Cylindre(Color color, Point3D p, double radius) {
		super(color);
		this.p = p;
		this.radius = radius;
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
	//***************** Administration  ******************** // 
	@Override
	public String toString() {
		return "Cylindre [p=" + p + ", radius=" + radius + ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cylindre other = (Cylindre) obj;
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
