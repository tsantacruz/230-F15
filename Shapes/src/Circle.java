
public class Circle implements Shape  {

private int radius;
private int ns;
	public Circle() {
	
		radius = 2;
		ns = 0;
	
	}
  public double getWidth(){
	  return radius * 2;
	  
  }
  
  public double getHeight(){
	  return radius * 2;
  }
 
@Override
public double getArea() {
	return  radius * radius * 3.14;
}

@Override
public double getPerimeter() {
	
	 return 2* radius * 3.14;
}
@Override
public double getInteriorAngle() {
	return 0;
}
@Override
public int getNumSides() {
	
	return ns;
}

	
public double getSideLength(){
	return 0;
}
@Override
public void setSideLength(double sideLength) {

	
}


 public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	  System.out.println(c.getPerimeter());
	  System.out.println(c.getSideLength());
	
	  
  }
}