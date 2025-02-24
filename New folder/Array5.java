import java.util.List;
import java.util.ArrayList;

public class Array5{
public static void main(String[] args){

int[] score = {2, 4, 5, 10, 12, 3, 7, 13, 0, 15};


List<Integer> item = evenNumber(score); 


System.out.println("even numbers in the array are: "+item);


}


public static List<Integer> evenNumber(int[] score){
List<Integer> item = new ArrayList<>();

for(int i = 1; i < score.length; i++){

if (i % 2 == 0){
item.add(score[i]);

}

}

return item;
}


}