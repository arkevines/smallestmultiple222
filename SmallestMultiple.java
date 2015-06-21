package smallestmultiple;

/**
 *
 * @author Wilczewski
 */
public class SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Poszukiwana liczba to: " + smallestMultiple(20));
    }
    
    public static int smallestMultiple(int upperLimit)
    {
        for(int i=2;;i++)
        {
            boolean canBeDivided = true;
            System.out.println("Sprawdzam liczbę: " + i);
            
            for(int j=1;j<=upperLimit;++j)
            {
                if(i % j != 0)
                {
                    canBeDivided = false;
                    break;
                }
            }
            if(canBeDivided)
                return i;
        }
    }
    
}
