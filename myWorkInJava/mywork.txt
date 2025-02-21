public class DispatchRider  {
public static void main(String[] args){


System.out.println("The riders pay at the end of the day is: "+ridersPay(25));
System.out.println("The riders pay at the end of the day is: "+ridersPay(55));
System.out.println("The riders pay at the end of the day is: "+ridersPay(68));
System.out.println("The riders pay at the end of the day is: "+ridersPay(80));


}


public static int ridersPay ( int numberOfSuccesfulDelivery) {

int basePay = 5000;

int collectionRate = (numberOfSuccesfulDelivery * 100) / 100;
int amountPerParcel = 0;

if (collectionRate < 50){
amountPerParcel = 160;

}

else if (collectionRate >= 50 && collectionRate < 60){
amountPerParcel = 200;

}

else if (collectionRate >= 60 && collectionRate < 70){
amountPerParcel = 250;

}

else if (collectionRate >= 70){
amountPerParcel = 500;

}

int totalPay =  (numberOfSuccesfulDelivery * amountPerParcel) + basePay;

return totalPay;


}


	}
