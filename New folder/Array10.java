import java.util.ArrayList;

public class Array10{
public static void main(String[] args){

ArrayList<String> item1 = new ArrayList<>();
item1.add("a");
item1.add("b");
item1.add("c");

ArrayList<Integer> item2 = new ArrayList<>();
item2.add(1);
item2.add(2);
item2.add(3);


ArrayList<Object> alternatingList = alternate (item1, item2);

System.out.println("The alternating list is: "+alternatingList);


}

public static ArrayList<Object> alternate (ArrayList<?>item1, ArrayList<?>item2){
	ArrayList<Object> outcome = new ArrayList<>();
	 
	int minLength = Math.min(item1.size(), item2.size());

	for (int i = 0; i < minLength; i++){
	outcome.add(item1.get(i));
	outcome.add(item2.get(i));
}
	return outcome;


}



	}