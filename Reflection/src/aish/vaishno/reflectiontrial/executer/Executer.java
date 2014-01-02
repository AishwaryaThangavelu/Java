package aish.vaishno.reflectiontrial.executer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Executer {

	public static void main(String[] args) {
	//	args= {"a","b"};
		/*String[] a= {"a","b"};
		System.out.println(a[0]);*/		
		
		try {
			Class class1=Class.forName("sdf");
		
			Method[] method=class1.getDeclaredMethods();
			for (int i = 0; i < method.length; i++) {
				System.out.println("Methods: "+method[i].toString());
			}
			System.out.println("Class Name: "+class1);
			class1=int.class;
			System.out.println("Class Name: "+class1);
			class1=Integer.TYPE;
			System.out.println("Class Name: "+class1);
			class1=new POJO().getClass();
			System.out.println("Class Name: "+class1);
			method=class1.getDeclaredMethods();
			for (int i = 0; i < method.length; i++) {
				System.out.println("*************"+method[i]);
			}
			Field[] decField=class1.getDeclaredFields();
			for (int i = 0; i < decField.length; i++) {
				System.out.println("Fields: "+decField[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
