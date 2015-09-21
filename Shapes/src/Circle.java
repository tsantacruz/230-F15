
public class Circle  {

private int radius;
	public Circle() {
	
		radius = 2;
	
	}
  public double getWidth(){
	  return radius* 2;
	  
  }
  
  public double getHeight(){
	  return radius *2;
  }
  
  public double getPerimeter(){
	  return 2* radius * 3.14;
  }
  public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	  System.out.println(c.getPerimeter());
  }
}
