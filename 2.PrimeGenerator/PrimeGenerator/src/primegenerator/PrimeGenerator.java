package primegenerator;

import java.util.Scanner;

public class PrimeGenerator {
    
    public boolean isPrime(int value, int divisor)
    {        
        if(value==1 && divisor==0) return true;
        else if(divisor==1)
        {
            return true;
        }
        else if(value % divisor == 0)
        {
            return false;
        }
        else return isPrime(value, divisor-1);
    }
    
    public boolean containPrime(int min, int max)
    {
        boolean contain = false;
        for(int i=min;i<=max;i++)
        {
            if(i>1)
            {
                if(isPrime(i, i-1)) return true;
            }
        }
        return contain;
    }
    public int countPrimes(int min, int max)
    {
        int total = 0;
        for(int i=min;i<=max;i++)
        {
            if(i>1)
            {
                if(isPrime(i, i-1))
                {
                    total++;
                }
            }
        }
        return total;
    }
    public void printPrimes(int min, int max)
    {
        for(int i=min;i<=max;i++)
        {
            if(i>1)
            {
                if(isPrime(i, i-1))
                {
                    System.out.println(i);
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {        
        PrimeGenerator PG = new PrimeGenerator();
        Scanner entrada = new Scanner(System.in);
        int totalTestes = entrada.nextInt();
        for(int i=0; i<totalTestes; i++)
        {
            int min = entrada.nextInt();
            int max = entrada.nextInt();
            PG.printPrimes(min, max);
        }
        
    }
    
}
