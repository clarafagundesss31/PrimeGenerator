package teste;

import primegenerator.PrimeGenerator;

public class TestePrimeGenerator {
    public boolean isPrime(int value, int divisor)
    {
        PrimeGenerator PG = new PrimeGenerator();
        return PG.isPrime(value, divisor-1);
    }
    public boolean containPrime(int min, int max)
    {
        PrimeGenerator PG = new PrimeGenerator();
        return PG.containPrime(min, max);
    }
    public int countPrimes(int min, int max)
    {
        PrimeGenerator PG = new PrimeGenerator();
        return PG.countPrimes(min, max);
    }
    public void printPrimes(int min, int max)
    {
        PrimeGenerator PG = new PrimeGenerator();
        PG.printPrimes(min, max);
    }
}
