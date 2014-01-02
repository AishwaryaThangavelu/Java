package aish.vaishno.reflectiontrial.shapes;

public abstract class Shapes {
	
	public void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
	
	public static void main(String[] args) {
		
	
	Shapes shapes=new Shapes() {
		
		@Override
		public String toString() {
			return "toString";
		}
	};
	
	shapes=new Square();
	
	shapes.draw();
	}

}
