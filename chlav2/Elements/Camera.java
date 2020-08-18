/*
 *  ANAELLE OHAYON 341101426
 * CHOCHANA CHARVIT 341269454 
 */
package Elements;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

public class Camera {
	protected Point3D _P0;
	protected Vector _vUp;
	protected Vector _vTo;
	protected Vector _vRight;
	
//***************** Constructors ********************** // 

	public Camera() 
	{
		super();
		this._P0=new Point3D(0,0,0);
		this._vUp=new Vector(0,0,0);
		this._vRight=new Vector(0,0,0);
		this._vTo=new Vector(0,0,0);
	}
	
	public Camera(Point3D _P0, Vector _vUp, Vector _vTo) {
		super();
		this._P0 = _P0;
		this._vUp = _vUp;
		this._vTo = _vTo;
		this._vRight = _vTo.crossProduct(_vUp);
	}
	public Camera(Camera c)
	{
		super();
		this._P0=new Point3D(c._P0);
		this._vUp=new Vector(c._vUp);
		this._vRight=new Vector(c._vRight);
		this._vTo=new Vector(c._vTo);
	}
//***************** Getters/Setters ********************** // 

	public Point3D get_P0() {
		return _P0;
	}

	public void set_P0(Point3D P0) {
		this._P0 = P0;
	}

	public Vector get_vUp() {
		return _vUp;
	}

	public void set_vUp(Vector vUp) {
		this._vUp = vUp;
	}

	public Vector get_vTo() {
		return _vTo;
	}

	public void set_vTo(Vector vTo) {
		this._vTo = vTo;
	}

	public Vector get_vRight() {
		return _vRight;
	}

	public void set_vRight(Vector vTo,Vector vUp)  {
		this._vRight =vTo.crossProduct(vUp);
	}
	
	//***************** Administration  ******************** // 
	
	@Override
	public String toString() {
		return "Camera [_P0=" + _P0 + ", _vUp=" + _vUp + ", _vTo=" + _vTo + ", _vRight=" + _vRight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		if (_P0 == null) {
			if (other._P0 != null)
				return false;
		} else if (!_P0.equals(other._P0))
			return false;
		if (_vRight == null) {
			if (other._vRight != null)
				return false;
		} else if (!_vRight.equals(other._vRight))
			return false;
		if (_vTo == null) {
			if (other._vTo != null)
				return false;
		} else if (!_vTo.equals(other._vTo))
			return false;
		if (_vUp == null) {
			if (other._vUp != null)
				return false;
		} else if (!_vUp.equals(other._vUp))
			return false;
		return true;
	}
	
	//***************** Operations ******************** // 
	
	public Ray constructRayThroughPixel (int Nx, int Ny, double x, double y,
            double screenDist, double screenWidth,
            double screenHeight) 
	{
		Vector v=new Vector(_vTo);
		v.scale(screenDist);//d*Vto
		Point3D p0=new Point3D(_P0);
		p0.add(v);//p0+d*vTo
		Point3D pc=new Point3D(p0);//pc=p0+d*vTo
		this._vRight=new Vector(this._vTo.crossProduct(this._vUp));
		double Rx=screenWidth/Nx;//50
		double Ry=screenHeight/Ny;//50
       this._vRight.scale((x-(Nx/2)*Rx+Rx/2));
       this._vUp.scale((y-(Ny/2)*Ry+Ry/2));
       this._vRight.subtract(_vUp);
       pc.add(this._vRight);//pc+[...]
       Point3D p=new Point3D(pc);
       Vector v2=new Vector(p);
		Ray r=new Ray(_P0,v2);
		return r;
	}


}
