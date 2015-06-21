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
    
    //  Public : Compute the smallest number that can be divided by each of the numbers 
    //  from 1 to given limit without any remainder.
    //
    //  upperLimit − the highest factor that has to divide the number without any reminder
    //
    //  Examples
    //
    //  smallestMultiple(4)
    //  => 12
    //
    //  isPrime(10)
    //  => 2520
    //
    //  Returns the smallest multiple of following numbers from 1 to N
    public static int smallestMultiple(int upperLimit)
    {
        int product;
        int highestPrime = highestPrime((short)upperLimit);
        if(highestPrime != upperLimit)
        {
            product = highestPrime * upperLimit;
        }
        else
        {
            product = highestPrime * (upperLimit - 1);
        }
        for(int i = product ; ;i += product)
        {
            System.out.println("Sprawdzam liczbę: " + i);
            if(canBeDivided(i,upperLimit))
            {
                return i;
            }
        }
    }
    
    //  Public : Finds the highest prime number in the given range
    //
    //  maxNum - highest number to be checked
    //
    //  Examples
    //
    //  highestPrime(20)
    //  => 19
    //
    //  highestPrime(10)
    //  => 7
    //
    //  Returns the highest prime number in range from 1 to maxNum
    public static short highestPrime(short maxNum)
    {        
        for (short i = maxNum ; i >= 1 ; i--) 
        {
            if(isPrime(i))
            {
                return i;
            }
        }
        return 0;
    }
    
    //  Public : Determine if the given number is a prime number.
    //
    //  x − The number to be checked.
    //
    //  Examples
    //
    //  isPrime(6)
    //  => false
    //
    //  isPrime(7)
    //  => true
    //
    //  Returns true if the given number is prime, else returns false
    public static boolean isPrime(int x)
    {
        for(int i = x-1 ; i > 1 ; i--)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }    
    
    //  Public : Determine if the given number that can be divided by each of the numbers 
    //  from 1 to given limit without any remainder.
    //
    //  x − The number to be checked.
    //  highestFactor - the highest number that must divide the number that is being checked 
    //
    //  Examples
    //
    //  canBeDivided(12,4)
    //  => true
    //
    //  isPrime(26,7)
    //  => false
    //
    //  Returns true if the given number can be divided without any reminder by all of following numbers
    public static boolean canBeDivided(int x,int highestFactor)
    {
        for(int i = highestFactor ; i > 1 ; i--)
        {
            if(x%i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
