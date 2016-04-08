import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//20150266 ÀÌÁöÇö
public class Car {
   public enum statusType{Available,CheckedOut,Inservice,discarded,Sold}
   private int carID;
   private statusType status;
   private Date datePurchased;
   private int mileage;
   public static ArrayList<Car> carList = new ArrayList<>();
   
   public Car(int id, Date d, int m){
      carID = id;
      status = statusType.Available;
      datePurchased = d;
      mileage = m;
      carList.add(this);
   }
   
   public void setMileage(int x){
      mileage = x;
   }
   
   public void addMileage(int x){
      mileage+=x;
   }
   
   public void setStatus(statusType s){
      status = s;
   }
   
   public void printInfo(){
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String s = dateFormat.format(datePurchased);
      System.out.println("Car ID:"+carID+"\n Car Status:"+status+"\n Purchase:"+s+"\n Mileage"+mileage);
   }
}