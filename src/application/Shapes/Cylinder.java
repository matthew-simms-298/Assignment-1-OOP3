package application.Shapes;

public class Cylinder extends Shape {

    private double height;
    private double radius;
	
    public Cylinder(){}
    
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

	public void setHeight(double var){
		this.height = var;
	}

	public void setRadius(double var){
		this.radius = var;
	}

}
