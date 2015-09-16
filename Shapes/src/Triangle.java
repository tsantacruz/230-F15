
public class Triangle implements Shape{

	private int NumSide;
	private double sideLength;

	public double getWidth() {
		return sideLength();
	};
	public double getHeight() {
		return (getArea()/0.5*sideLength());
	};
	public double getArea() {
		return 0.5*getSideLength()*3;
	};
	public void setSideLength(double sideLength) {

	};
	public double getPerimeter() {

	};
	public double getInteriorAngle() {

	};
	public int getNumSides() {
		return NumSide;
	};
	public double getSideLength() {
		return sideLength;
	};
}
