package Primitives;

public class Point2D {
protected Coordinate _x;
protected Coordinate _y;
//***************** Constructors ********************** // 
public Point2D() {
	_x=new Coordinate();
    _y=new Coordinate();
}


public Point2D(Coordinate _x, Coordinate _y) {
	this._x = _x;
	this._y = _y;
}

public Point2D(Point2D d)
{
	_x=d._x;
	_y=d._y;
}
//***************** Getters/Setters ********************** // 
public Coordinate getX() {
	return _x;
}

public void setX(Coordinate x) {
	this._x = x;
}
public Coordinate getY() {
	return _y;
}
public void setY(Coordinate y) {
	this._y = y;
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
	Point2D other = (Point2D) obj;
	if (_x == null) {
		if (other._x != null)
			return false;
	} else if (!_x.equals(other._x))
		return false;
	if (_y == null) {
		if (other._y != null)
			return false;
	} else if (!_y.equals(other._y))
		return false;
	return true;
}

@Override
public String toString() {
	return "(x="+this._x+",y="+this._y+")";
}
}
//***************** Operations ******************** // 

