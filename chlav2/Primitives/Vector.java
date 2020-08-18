/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Primitives;

public class Vector {
protected Point3D _head;
//***************** Constructors ********************** // 
public Vector(Point3D head) {
	
	this._head = head;
}

public Vector() {_head=new Point3D();
	}
public Vector(double x,double y ,double z)
{
	_head=new Point3D(x,y,z);
}
public Vector(Point3D p1,Point3D p2)
{
	Point3D p=new Point3D(p2.subtract(p1));
    this._head=new Point3D(p);
}

public Vector(Vector v)
{
	_head=v._head;
}
//***************** Getters/Setters ********************** //
public Point3D get_head() {
	return _head;
}

public void set_head(Point3D _head) {
	this._head = _head;
}
@Override
public String toString() {
	return this._head.toString();
}
// ***************** Administration  ******************** // 
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vector other = (Vector) obj;
	if (_head == null) {
		if (other._head != null)
			return false;
	} else if (!_head.equals(other._head))
		return false;
	return true;
}
//***************** Operations ******************** // 

public void add(Vector vector) {
	
	this._head.add(vector);

}
public void subtract (Vector vector ) {this._head.subtract(vector);}
public void scale(double scalingFactor) 
{
	_head._x.setCoordinate(_head._x._coordinate*scalingFactor);
	_head._y.setCoordinate(_head._y._coordinate*scalingFactor);
	_head._z.setCoordinate(_head._z._coordinate*scalingFactor);
}
public Vector crossProduct (Vector vector) 
{
	Coordinate _x=new Coordinate(_head._y._coordinate*vector._head._z._coordinate-_head._z._coordinate*vector._head._y._coordinate);
	Coordinate _y=new Coordinate(_head._z._coordinate*vector._head._x._coordinate-_head._x._coordinate*vector._head._z._coordinate);
	Coordinate _z=new Coordinate(_head._x._coordinate*vector._head._y._coordinate-_head._y._coordinate*vector._head._x._coordinate);
	Point3D point=new Point3D(_x,_y,_z);
	Vector news=new Vector(point);
	return news;
}
public double length() 
{
		return Math.sqrt(Math.pow(this._head._x._coordinate,2)+Math.pow(this._head._y._coordinate,2)+Math.pow(this._head._z._coordinate,2));
}
public Vector normalize() 
{
	double length=this.length();
	this._head._x.setCoordinate(this.get_head().getX().getCoordinate()/length);  
	this._head._y.setCoordinate(this.get_head().getY().getCoordinate()/length);  
	this._head._z.setCoordinate(this.get_head().getZ().getCoordinate()/length);  
	Point3D p=new Point3D(_head._x,_head._y,_head._z);
	Vector v=new Vector(p);
	return v;
}
public double dotProduct(Vector vector) 
{
	return (double)(this._head._x._coordinate*vector._head._x._coordinate)+(this._head._y._coordinate*vector._head._y._coordinate)+(this._head._z._coordinate*vector._head._z._coordinate);
}

}
