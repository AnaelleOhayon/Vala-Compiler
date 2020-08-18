/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Geometries;
import java.awt.Color;

import Primitives.Point3D;
import Primitives.Vector;
public abstract class Geometry {
protected Color color;
//***************** Constructors ********************** // 
public Geometry(Color color) {
	this.color = color;
}
public Geometry() {color=new Color(0);}
public Geometry(Geometry g)
{
	color=g.color;
}
// ***************** Getters/Setters ********************** // 
public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}

//***************** Administration  ******************** // 
@Override
public String toString() {
	return "Geometry [color=" + color + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Geometry other = (Geometry) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	return true;
}
// ***************** Operations ******************** // 
public abstract Vector getNormal(Point3D p);

}
