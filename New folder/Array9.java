import java.util.ArrayList;
import java.util.List;

public class Array9 {
public static void main(String[] args){

List<String> item1 = new ArrayList<>();
	item1.add("a");
	item1.add("b");
	item1.add("c");

List<Integer> item2 = new ArrayList<>();
	item2.add(1);
	item2.add(2);
	item2.add(3);


List<Object> concatenatedItems = combine(item1, item2);

System.out.println("The concatenated list: "+ concatenatedItems);

}


public static List<Object> combine(List<?>item1, List<?>item2){
	List<Object> result = new ArrayList<>(item1);
	result.addAll(item2);
	return result;
}


	}