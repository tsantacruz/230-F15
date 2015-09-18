
public class Circle  {

private int radius;
	public Circle() {
	
		radius = 2;
	
	}
  public double getWidth(){
	  return radius * 2;
	  
  }
  
  public double getHeight(){
	  return radius * 2;
  }
  public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	
	  
  }
}
