import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Array2{
public static void main(String[] args){

List<Integer> figures = new ArrayList<>();
figures.add(1);
figures.add(2);
figures.add(3);
figures.add(4);
figures.add(5);

List<Integer> result = reversal (figures);


System.out.println("The reversed list of "+result);


}


public static List<Integer> reversal (List<Integer>figures){

List<Integer> reversedFigures = new ArrayList<>(figures);
Collections.reverse(reversedFigures);
return reversedFigures;


}

}


