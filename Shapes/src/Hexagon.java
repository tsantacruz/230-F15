
public class Hexagon implements Shape {
	
	private double sidelength;
	private int numsides;
	
	public double getWidth() {
		return 0;
	}

	public double getHeight() {
		return 0;
	}

	public double getArea() {
		double area = ((3 * Math.sqrt(3)) / 2) * (sidelength * sidelength);
		return area;
	}

	public void setSideLength(double sidelength) {
		sidelength = sidelength;
	}

	public double getPerimeter() {
		double perimeter = sidelength * numsides;
	}

	public double getInteriorAngle() {
		int interiorangle = (numsides-2) * 180;
		return interiorangle;
	}

	public int getNumSides() {
		return numsides;
	}

	public double getSideLength() {
		return sidelength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
