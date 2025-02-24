public class Array3{
public static void main(String[] args){

int[] score = {2, 5, 9, 4, 7};

int check = 2;

if (elementCheck(score, check)){

System.out.println("Element " + check + " exists in the array");

}

else{

System.out.println("Element " + check + " does not exist in the array");


}

	}



public static boolean elementCheck (int[] score, int check){

for (int i = 0; i < score.length; i++){

if (i == check){

return true;

}

}

return false;

}


	}



