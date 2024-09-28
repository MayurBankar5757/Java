package demos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class KnowingAboutTheClass {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("java.lang.String");
			System.out.println("Package : "+cls.getPackage());
			System.out.println("Super class : "+cls.getSuperclass());
			System.out.println("***********interfaces");
			Class [] interfaces = cls.getInterfaces();
			for(Class iface : interfaces)
				System.out.println(iface.getSimpleName());
			System.out.println("***********constrcutors");
			Constructor [] allcons = cls.getConstructors();
			for(Constructor con : allcons)
				System.out.println(con);
			System.out.println("***********methods");
			Method [] methods = cls.getMethods();
			for(Method m : methods)
				System.out.println(m);
			System.out.println("***********mofdifiers");
			int modifer = cls.getModifiers();
			if(Modifier.isFinal(modifer))
				System.out.println("Final class");
			if(Modifier.isPublic(modifer))
				System.out.println("public class");
			if(Modifier.isAbstract(modifer))
				System.out.println("Abstract class");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
