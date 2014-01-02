package aish.vaishno.reflectiontrial.executer;

import java.awt.image.SampleModel;
import java.beans.PropertyChangeEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import aish.vaishno.factory.classes.CheesePizza;
import aish.vaishno.factory.classes.ConcretePizzaHutFactory;

public class ReflectionTrial2 {
	
	public static void main(String[] args) {
		System.out.println(System.getProperties());
		Properties properties=new Properties();
		try {
			properties.setProperty("executerClassName","aish.vaishno.reflectiontrial.executer.Executer");
			properties.store(new FileOutputStream("file.properties"),null);
			
			properties.load(new FileInputStream("sample.properties"));
			String className=properties.getProperty("pojoClassName");
			System.out.println("****** CLassName: "+className);
			
			Class class1=Class.forName(className);
			System.out.println("Class 1: "+class1);
			
			Method[] methods=class1.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(i+" : "+methods[i]);
			}
			POJO pojo=(POJO) class1.newInstance();
			pojo.setCarString("Audi");
			System.out.println("**** POJO Instance: "+pojo.getCarString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

}
