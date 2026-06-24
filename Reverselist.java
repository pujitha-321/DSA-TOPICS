//THIS IS THE PROGRAM TO REVERSE THE GIVEN ARRAYLIST
import java.util.*;
public class Reverselist {
    public static void main(String[] args){
    ArrayList<Integer>list = new ArrayList<>();

     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);
     System.out.println(list);
     reverse(list);



    }
    public static void reverse(ArrayList<Integer>list){
        int len = list.size();
        for(int i=len-1;i>=0;i--){
           System.out.print(list.get(i)+" ");

        }
    }



    
}
