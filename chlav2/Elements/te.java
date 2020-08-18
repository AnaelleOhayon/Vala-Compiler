package Elements;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Point3D P0=new Point3D(0,0,0);
			Point3D p0=new Point3D(P0);
			Vector v1=new Vector(0,1,0);//Vup
			Vector v2=new Vector(0,0,-1);//Vto
			Camera c=new Camera(p0,v1,v2);
	        Vector v=new Vector(50.0,-50.0,-100.0);
	       // Ray r=new Ray(P0,v);
	        Ray r2=new Ray(c.constructRayThroughPixel(3, 3, 3, 3, 100, 150, 150));
	        r2=c.constructRayThroughPixel(3, 3, 3, 3, 100, 150, 150);
	        System.out.print(r2.toString());
	        r2.toString();
	}

}
