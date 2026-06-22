//TO PRINT ASCENDING ORDER USING RECURSION
public class ascendingRecursion {
    public static void main(String[] args){
        numbers(1);
    }
    public static void numbers(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }
    
}
