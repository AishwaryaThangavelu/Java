package aish.vaishno.reflectiontrial.executer;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ReflectionTrial3 {

	
		public static ArrayList<String>getClassNamesFromPackage(String packageName) throws IOException {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			URL packageURL;
			ArrayList<String> names = new ArrayList<String>();;

			packageName = packageName.replace(".", "/");
			packageURL = classLoader.getResource(packageName);

			if(packageURL.getProtocol().equals("jar")){
			String jarFileName;
			JarFile jf ;
			Enumeration<JarEntry> jarEntries;
			String entryName;

			// build jar file name, then loop through zipped entries
			jarFileName = URLDecoder.decode(packageURL.getFile(), "UTF-8");
			jarFileName = jarFileName.substring(5,jarFileName.indexOf("!"));
			System.out.println(">"+jarFileName);
			jf = new JarFile(jarFileName);
			jarEntries = jf.entries();
			while(jarEntries.hasMoreElements()){
			entryName = jarEntries.nextElement().getName();
			if(entryName.startsWith(packageName) && entryName.length()>packageName.length()+5){
			entryName = entryName.substring(packageName.length(),entryName.lastIndexOf('.'));
			names.add(entryName);
			}
			}

			// loop through files in classpath
			}else{
			File folder = new File(packageURL.getFile());
			File[] contenuti = folder.listFiles();
			String entryName;
			for(File actual: contenuti){
			entryName = actual.getName();
			entryName = entryName.substring(0, entryName.lastIndexOf('.'));
			names.add(entryName);
			}
			}
			return names;
			}
		
		public static void main(String[] args) {
			try {
				System.out.println(ReflectionTrial3.getClassNamesFromPackage("aish.vaishno.factory.classes"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
