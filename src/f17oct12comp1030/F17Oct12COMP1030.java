
package f17oct12comp1030;

/**
 *
 * @author JWright
 */
public class F17Oct12COMP1030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10)
        {
            System.out.printf("%2d. %n", count);
            count++;
        }
        
        System.out.printf("%nUsing a for loop: %n");
        forLoop();
        
        System.out.printf("%nUsing a do ... while loop: %n");
        doWhileLoop();
    }
    
    public static void forLoop()
    {
        for (int count=1; count <=10; count++)
            System.out.printf("%2d. %n", count);
    }
    
    public static void doWhileLoop()
    {
        //even though the loop condition is false, it will still do the commands
        //inside the loop at least once
        int count = 100;
        
        do
        {
            System.out.printf("%2d. %n", count);
        } while (count <= 10);
    }
}
