
public class Function22 {
    public static int enough(int goal){
        int n=1, sum=1;
        while(sum<goal)
            sum+=++n;
             return n;
        
       
    }
    public static void main(String[] args) {
        
        System.out.println(enough(9));
    }
}
