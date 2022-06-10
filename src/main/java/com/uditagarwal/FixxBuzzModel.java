package com.uditagarwal;

public class FixxBuzzModel {

    private final int maxValue;
    private  int n = 1;

    public FixxBuzzModel(int maxValue)
    {

        this.maxValue = maxValue;

    }

    public synchronized void isDivisibleBy3_5() throws InterruptedException {
        while(n<=maxValue)
        {
            if(n%3==0 && n%5==0)
            {
                System.out.println(FizzBuzz.FizzBuzz);
                n++;
                this.notifyAll();
            }
            else {
                this.wait();
            }
        }

    }
    public synchronized void isDivisibleBy3() throws InterruptedException {
        while(n<=maxValue)
        {
            if(n%3==0 && n%5!=0)
            {
                System.out.println(FizzBuzz.Fizz);
                n++;
                this.notifyAll();
            }
            else {
                this.wait();
            }
        }

    }
    public synchronized void isDivisibleBy5() throws InterruptedException {
        while(n<=maxValue)
        {
            if(n%3!=0 && n%5==0)
            {
                System.out.println(FizzBuzz.Buzz);
                n++;
                this.notifyAll();
            }
            else {
                this.wait();
            }
        }

    }
    public synchronized void isDivisibleByNone() throws InterruptedException {
        while(n<=maxValue)
        {
            if(n%3!=0 && n%5!=0)
            {
                System.out.println(n);
                n++;
                this.notifyAll();
            }
            else {
                this.wait();
            }
        }

    }
}
