package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		System.out.println();
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	// qualquer numerico(Covariança subTipos eu posso somente acessar)
	// lista mais generica que number(contravariança Trabalha com o super tipo do
	// tipo informado eu posso somente adicionar )
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		// para cada Number number na lista de origem

		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object lista : list) {
			System.out.print(lista + " ");
		}
	}

}