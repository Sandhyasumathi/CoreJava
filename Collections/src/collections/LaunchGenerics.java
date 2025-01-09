package collections;

import java.util.ArrayList;

/**
 * We can able to use Generics to the class so that we can make use of the class with different Types
 * @param <T>
 */
class Generics<T>{
	
	private T ref;
	
	public Generics(T ref) {
		this.ref=ref;
	}

	public T getRef() {
		return ref;
	}

	public void setRef(T ref) {
		this.ref = ref;
	}
	
	public void disp() {
		System.out.println("The type of T is :" + ref.getClass().getName());
	}
}
/**
 * Generics are used to achive type safety in collection
 */
public class LaunchGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Spring");
		list.add("Python");
		
		Generics<Integer> g = new Generics<>(44);
		g.disp();
		System.out.println(g.getRef());
		
	}

}
