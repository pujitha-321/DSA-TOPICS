import java.util.*;
public class findmaxiArray {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        max(list);



    }
    public static void max(ArrayList<Integer>list){
        int maxi = Integer.MIN_VALUE;
        int len = list.size();
        for(int i=0;i<len;i++){
            maxi = Math.max(list.get(i),maxi);
        }
        System.out.println(maxi);


    }
    
}
