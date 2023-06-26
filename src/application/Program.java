package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();

		myShapes.add(new Retangle(2.0, 3.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircle = new ArrayList<>();

		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));

		// Vai dar um erro de casting, por que o listShpe nao e um super tipo de
		// myCircle

		// System.out.println(String.format("Total area " + "%.2f",
		// totalArea(myCircle)));

		System.out.println(String.format("Total area " + "%.2f", totalArea(myShapes)));
	}

	public static double totalArea(List<Shape> lista) {
		double sum = 0.0;
		for (Shape shape : lista) {

			sum = sum + shape.area();
		}

		return sum;
	}

}
