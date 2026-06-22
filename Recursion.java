
 public class Recursion{
    public static void main(String[] args){
       
     numbers(1);
    }
    
 public static void numbers(int n){
    if(n == 6){
        return;
    }
    numbers(n+1);
    System.out.println(n);

 }
 }