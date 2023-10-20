package application.Shapes;

public class Cone extends Shape{
    private double height;
    private double radius;
	
    public Cone(double h, double r) {
    	this.height = h;
    	this.radius = r;
    }
    
    @Override
    public double getHeight() {
        return this.height;
    }

    // Method to get the base area
    @Override
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to get the volume
    @Override
    public double getVolume() {
        return (1.0/3.0) * getBaseArea() * height;
    }

}
