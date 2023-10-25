package application.Shapes;

public class Prism extends Shape {

    private double edgeLength;
    private double height;
    private Base type;
	
	public Prism(){}
    
	@Override
	public double getHeight() {
		return this.height;
	}

	public Base getBase(){
		return this.type;
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

	public void setHeight(double var){
		this.height = var;
	}

	public void setEdgeLength(double var){
		this.edgeLength = var;
	}

	public void setBase(String base){
		switch(base.toUpperCase()){
			case "EQUILATERIAL":
				this.type = Base.EQUILATERIAL;
				break;
			case "OCTOGONAL":
				this.type = Base.OCTOGONAL;
				break;
			case "PENTAGONAL":
				this.type = Base.PENTAGONAL;
				break;
			case "SQUARE":
				this.type = Base.SQUARE;
				break;
			default:
				this.type = null;
		}
	}
	
}
