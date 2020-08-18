/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Primitives;

public class Coordinate {
protected double _coordinate;

//***************** Constructors ********************** // 

public Coordinate(double _coordinate) {
	this._coordinate = _coordinate;
}
public Coordinate() {_coordinate=0;}
public Coordinate(Coordinate c)
{
	_coordinate=c._coordinate;
}
//***************** Getters/Setters ********************** // 

public double getCoordinate() {
	return _coordinate;
}

public void setCoordinate(double coordinate) {
	this._coordinate = coordinate;
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
	Coordinate other = (Coordinate) obj;
	if (Double.doubleToLongBits(_coordinate) != Double.doubleToLongBits(other._coordinate))
		return false;
	return true;
}
@Override
public String toString() {
	return "coordinate="+this._coordinate;
}
//***************** Operations ******************** // 
public void add(Coordinate other) 
{
	_coordinate=_coordinate+other._coordinate;
} 
public void subtract (Coordinate other) 
{
	_coordinate=_coordinate-other._coordinate;
} 

}
