package application.Shapes;

public class Cone extends Shape{
    private double height;
    private double radius;
	
    public Cone(){}
    
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

    public void setHeight(double var){
		this.height = var;
	}

    public void setRadius(double var){
		this.radius = var;
	}
}
