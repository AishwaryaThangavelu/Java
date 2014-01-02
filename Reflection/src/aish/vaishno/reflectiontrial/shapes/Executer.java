package aish.vaishno.reflectiontrial.shapes;


import java.util.Arrays;
import java.util.List;



public class Executer {

	public static void main(String[] args) {
		List<Shapes> shapeClassList=Arrays.asList(new Square(),new Triangle());
		for (Shapes shapes : shapeClassList) {
			shapes.draw();
		}
	}
}
