// Write a function named "reduce" that take one argument that is an array containing two positive
// integer values, and treats them as the numerator and denominator of a fraction, and reduces the fraction.
// That is to say, each of the two elements will be modified by dividing it by the greatest common divisor of
// the two integers. The function should return the value false (to indicate failure to reduce) if either of
// the two arguments is zero or negative, and should return the value true otherwise. Thus, for example,
// if m and n have been declared to be integer variables in a program, then
// int[] fraction = {25, 15};
// if (reduce(fraction))
//     System.out.println("" + fraction[0] + '/' + fraction[1]);
// else
//     System.out.println("fraction error");
// will produce the following output:
// 5/3
// Note that the values of the fraction were modified by the function call. Similarly,
// int[] fraction = {15, 50};
// if (reduce(fraction))
//     System.out.println("" + fraction[0] + '/' + fraction[1]);
//        else
// System.out.println("fraction error");
// will produce the following output:
// 3/10
// Here is another example.
// int[] fraction = {25, 0};
// if (reduce(fraction))
//     System.out.println("" + fraction[0] + '/' + fraction[1]);
// else
//     System.out.println("fraction error");
// will produce the following output:
// fraction error
// The function reduce is allowed to make calls to other functions that you have written. 

public class P26{
  static boolean reduce(int[] fraction){
    if(fraction[0]<=0|| fraction[1]<=0)
    return false;
    else{
      int common = gcd (fraction[0],fraction[1]);
      fraction[0]/=common;
      fraction[1]/=common;
      return true;
    }
  }
   static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  public static void main(String []args){
    int[] fraction={20,100};
    if(reduce(fraction))
System.out.println(fraction[0]+"/"+ fraction[1]);
else
    System.out.println("fraction error");
    
  }
}