package aish.vaishno.reflectiontrial.executer;

import java.lang.reflect.Method;

public class ReflectionTrial4 {
	
		
	public static void main(String[] args) {
		
		try {
			Class class1=Class.forName("java.lang.Package");
			Package package1=class1.getPackage();
			System.out.println("package: "+package1);
			Package[] packages=package1.getPackages();
			System.out.println("****** Packages: ");
			for (int i = 0; i < packages.length; i++) {
				System.out.println("* "+i+" "+packages[i]);
			}
			
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
