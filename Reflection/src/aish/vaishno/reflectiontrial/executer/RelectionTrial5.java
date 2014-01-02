package aish.vaishno.reflectiontrial.executer;

import java.awt.print.Printable;
import java.lang.reflect.Method;

public class RelectionTrial5 {

	public static void main(String[] args) {
		if(args.length<1) {
			
		}
		try {
			Class<?> class1=Class.forName("aish.vaishno.reflectiontrial.executer.POJO");
			System.out.println(class1.getPackage());
			Method[] methods=class1.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
