import java.util.*;
public class SwapIndexing {
    public static void main(String[] args){
       ArrayList<Integer>list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       System.out.println(list);
       Swap(list,1,3);


    }
    public static void Swap(ArrayList<Integer>list, int ind1, int ind3){

         int len = list.size();
         int  first = list.get(ind1);
         int second = list.get(ind3);
         list.set(ind1,second);

         list.set(ind3,first);
         System.out.println(list);


    }
}
