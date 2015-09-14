
public class Square implements Shape {
	
	private int width; 
	private int height; 
	
	//num sides
	public int ns = 4;
	//side length
	public double sl;
	
	public void SizeLength(double SideLength);
	public double permeter();
	
	
	public double getPermeter(){
		return getPermeter();
	}
	
	public void setSizeLength(double SideLength){
		this.setSizeLength(SideLength);
	}
	
	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getArea() {
		return width * height; 
	}

	
	@Override
	public double getInteriorAngle() {
		// TODO Auto-generated method stub
		//-Nate tazewell
		//since square will always have 90 degree angles
		return 90;
	}

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		//-Nate tazewell
		//returns the number of sides in the shape  
		return  ns;
	}

	public double getSideLength() {
		return getArea() * getArea(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	}

}
