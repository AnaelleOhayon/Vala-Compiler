package Primitives;

public class Point3D extends Point2D {
protected Coordinate _z;
//***************** Constructors ********************** // 
public Point3D() 
{
	super();
_z=new Coordinate();
}
public Point3D(double x,double y,double z)
{
	Coordinate x1=new Coordinate(x);
	Coordinate x2=new Coordinate(y);
	Coordinate x3=new Coordinate(z);
    _x=x1;
    _y=x2;
    _z=x3;
	
}
public Point3D(Coordinate x,Coordinate y,Coordinate z){
	_x=x;
	_y=y;
	 _z=z;
	 }


public Point3D(Point3D d)
{
super(new Point2D(d._x,d._y));
_z=d._z;
}
//***************** Getters/Setters ********************** // 
public Coordinate getZ() {
	return _z;
}

public void setZ(Coordinate z) {
	this._z = z;
}
// ***************** Administration  ******************** // 
@Override
public String toString() {
	return "(x="+this._x+",y="+this._y+",z="+this._z+")";

}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Point3D other = (Point3D) obj;
	if (_z == null) {
		if (other._z != null)
			return false;
	} else if (!_z.equals(other._z))
		return false;
	return true;
}
//***************** Operations ******************** // 

public void add (Vector vector) 
{
	this._x.add(vector.get_head().getX());
	this._y.add(vector.get_head().getY());
	this._z.add(vector.get_head().getZ());

}
public void subtract (Vector vector )
{
	this._x.subtract(vector.get_head().getX());
	this._y.subtract(vector.get_head().getY());
	this._z.subtract(vector.get_head().getZ());	
}

public Point3D subtract(Point3D p1) {
	// TODO Auto-generated method stub
	this._x._coordinate=this._x._coordinate-p1._x._coordinate;
	this._y._coordinate=this._y._coordinate-p1._y._coordinate;
	this._z._coordinate=this._z._coordinate-p1._z._coordinate;
	Point3D p=new Point3D(_x,_y,_z);
	return p;
}



}
