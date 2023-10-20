package application.Shapes;

public class Cylinder extends Shape {

    private double height;
    private double radius;
	
    public Cylinder(double h, double r) {
    	this.height = h;
    	this.radius = r;
    }
    
	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public double getBaseArea() {
		return Math.pow((Math.PI * radius),2);
	}

	@Override
	public double getVolume() {
		return getBaseArea() * height;
	}

}
