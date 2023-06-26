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
		// myCircle. Para funcionar eu preciso implementar no meu metodo o tipo curinga
		// extendendo a classe Shape

		System.out.println(String.format("Total area Circulo " + "%.2f", totalArea(myCircle)));

		System.out.println(String.format("Total area " + "%.2f", totalArea(myShapes)));
	}

	// essa minha lista pode ser de shape ou de qq SUBTIPO DE SHAPE
	// ELE VAI ACEITAR UMA LISTA DE CIRCULO E DE RETANGLO
	public static double totalArea(List<? extends Shape> lista) {
		double sum = 0.0;
		for (Shape shape : lista) {

			sum = sum + shape.area();
		}

		return sum;
	}

}
