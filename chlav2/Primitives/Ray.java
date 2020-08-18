/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Primitives;

public class Ray {
protected Point3D _POO;
protected Vector _direction;
//***************** Constructors ********************** // 

public Ray(Point3D _POO, Vector _direction) {
	super();
	this._POO = _POO;
	this._direction = _direction;
}
public Ray() {}
public Ray(Ray r)
{
	_POO._x=r._POO._x;
	_POO._y=r._POO._y;
	_POO._z=r._POO._z;
	_direction._head._x=r._direction._head._x;
	_direction._head._y=r._direction._head._y;
	_direction._head._z=r._direction._head._z;
}
//***************** Getters/Setters ********************** //
public Point3D get_POO() {
	return _POO;
}

public void set_POO(Point3D _POO) {
	this._POO = _POO;
}
public Vector get_direction() {
	return _direction;
}
public void set_direction(Vector _direction) {
	this._direction = _direction;
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
	Ray other = (Ray) obj;
	if (_POO == null) {
		if (other._POO != null)
			return false;
	} else if (!_POO.equals(other._POO))
		return false;
	if (_direction == null) {
		if (other._direction != null)
			return false;
	} else if (!_direction.equals(other._direction))
		return false;
	return true;
}

@Override
public String toString() {
	return "Ray [_POO=" + _POO + ", _direction=" + _direction + "]";
}


}
