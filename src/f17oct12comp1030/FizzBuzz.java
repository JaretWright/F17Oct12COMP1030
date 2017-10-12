
package f17oct12comp1030;

/**
 *
 * @author JWright
 */
public class FizzBuzz {
    public static void main(String[] args)
    {
        for (int count=1; count <= 100; count++)
        {
            System.out.printf("%n%3d. ", count);
            
            //check if the count is divisible by 3, if true, print Fizz
            if (count % 3 == 0)
                System.out.print("Fizz");
            
            //check if the count is divisible by 5, if true, print Buzz
            if (count % 5 == 0)
                System.out.print("Buzz"); 
        }
        
       
        
    }
}
