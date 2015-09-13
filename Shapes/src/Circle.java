
public class Circle {
private int numSides;
private int radius;
	public Circle() {
		numSides = 0;
		radius = 2;
	
	}
  public double getWidth(){
	  return radius + 1;
	  
  }
  
  public double getHeight(){
	  return radius + 1;
  }
  public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	
	  
  }
}
