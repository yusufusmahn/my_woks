import java.util.ArrayList;
import java.util.List;

public class Array4{
public static void main(String[] args){

	int[] score = {23, 4, 8, 3, 9};

	List<Integer> item = oddNumber(score);


	System.out.println("elements in odd position are: "+item);

}



public static List<Integer> oddNumber (int[] score){
	List<Integer> item = new ArrayList<>();
	
	for (int i = 1; i < score.length; i++){

	if (i % 2 != 0){
	item.add(score[i]);
	
}

}

	return item;


}
	}