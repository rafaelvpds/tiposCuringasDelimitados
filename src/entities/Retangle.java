package entities;

public class Retangle implements Shape {
	private Double width;
	private Double height;

	public Retangle() {

	}

	public Retangle(Double width, Double height) {

		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
