package mx.com.kabec;
/*
 * 
The naming conventions are as follows:
T - Type
E - Element
K - Key
N - Number
V - Value
 * 
 */

class Data<K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E, N> void display(E element, N number){
		System.out.println("Element: "+element+ " Number: "+number);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer, String> data = new Data<Integer, String>(1, "Chaand");
		Data<Double, String> dataSecond = new Data<Double, String>(20.0, "Another value");
		
		System.out.println("Key: "+data.getKey()+" value: "+data.getValue());
		System.out.println("Second object Key: "+dataSecond.getKey()+" value: "+dataSecond.getValue());
		System.out.println("data.display()");
		data.display("2.0 String", 25);
		data.display(2.0, "25 String");
		data.display("2.0 String", "25 String");
		data.display(2.0, 25);
		data.display(2, 25.0f);
	}

}




