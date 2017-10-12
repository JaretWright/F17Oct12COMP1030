
package f17oct12comp1030;

/**
 *
 * @author JWright
 */
public class EvenOdd {
    public static void main(String[] args)
    {
        for (int i=1; i<=10; i++)
            System.out.printf("%2d. %s%n",i, isEven(i));
    }
    
    public static String isEven(int numbToAssess)
    {
        if (numbToAssess % 2 == 0)
            return "even";
        else
            return "odd";
    }
    
}
