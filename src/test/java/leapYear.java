import java.sql.SQLOutput;

public class leapYear {
    public static void  isLeap(int year){
       if(year%400==0){
           if (year % 100 == 0){
               System.out.println("this is leap year");
           }
       } else if (year%4==0){
           System.out.println("this is leap year");

       }
       else{
           System.out.println("this is not aleap year");
       }
    }

    public static void main(String[] args) {
        isLeap(2002);
    }
}