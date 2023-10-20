package application.Shapes;

public class Prism extends Shape {

    private double edgeLength;
    private double height;
    private Base type;
	
    public Prism(double e, double h, Base t) {
    	this.edgeLength = e;
    	this.height = h;
    	this.type = t;
    }
    
	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public double getBaseArea() {
		double val = 0;
		switch(this.type) {
		case EQUILATERIAL:
			val = ((Math.sqrt(3))/4)*(Math.pow(edgeLength, 2));
			break;
		case OCTOGONAL:
			val = 2 * (Math.pow(edgeLength, 2)) * (1+(Math.sqrt(2)));
			break;
		case PENTAGONAL:
			val = ((Math.sqrt(3))/4)*(Math.pow(edgeLength, 2));
			break;
		case SQUARE:
			val = Math.pow(edgeLength, 2);
			break;
		default:
			break;
		}
		return val;
	}

	@Override
	public double getVolume() {
		double val = 0;
		switch(this.type) {
		case EQUILATERIAL:
			val = ((Math.sqrt(3) / 4) * Math.pow(edgeLength, 2)) * height;
			break;
		case OCTOGONAL:
			val = (2 * (1 + Math.sqrt(2)) * Math.pow(edgeLength, 2)) * height;
			break;
		case PENTAGONAL:
			val = (1/4 * Math.sqrt(5*(5+2*Math.sqrt(5))) * Math.pow(edgeLength, 2)) * height;
			break;
		case SQUARE:
			val = Math.pow(edgeLength, 2) * height;
			break;
		default:
			break;
		}
		return val;
	}

	
}
