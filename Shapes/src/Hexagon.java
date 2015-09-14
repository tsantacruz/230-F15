
public class Hexagon implements Shape {
	private int sidelength;

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

	@Override
	public double getArea() {
		return ((3 * Math.sqrt(3)) / 2) * (sidelength * sidelength);
	}

	@Override
	public void setSideLength(double sideLength) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getInteriorAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSideLength() {
		return sidelength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
