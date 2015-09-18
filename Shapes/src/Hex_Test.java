
public class Hex_Test {
	
	public static void main(String[] args) {
		Hexagon x = new Hexagon();
		x.setSideLength(5);
		System.out.println(x.getWidth()); //X
		System.out.println(x.getHeight());
		System.out.println(x.getArea());
		System.out.println(x.getPerimeter()); //X
		System.out.println(x.getInteriorAngle()); 
		System.out.println(x.getNumSides());
		System.out.println(x.getSideLength());
	}

}
