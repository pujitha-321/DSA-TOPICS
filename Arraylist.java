
import java.util.*;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list.contains(100));
        System.out.println(list.get(4));
        System.out.println(list.remove(3));
        list.set(4,40);
        System.out.println(list.size()); 
        System.out.println(list);



    }

}