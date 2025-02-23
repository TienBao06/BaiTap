
abstract class Shape {
public String coler ="red";
public boolean filled =true;
public Shape() {}

	public Shape(String coler,boolean filled) {
		this.coler = coler;
		this.filled = filled;
	}

	public String getColer() {
		return coler;
	}

	public void setColer(String coler) {
		this.coler = coler;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [coler=" + coler + ", filled=" + filled + "]";
	}
	

}
