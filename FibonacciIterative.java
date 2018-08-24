package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci {

    @Override
    public int fibonacci(int n) {
        if (n == 0){
            return(0);
        }
        int a = 1;
        int b = 0;
        int c = 0;

        for(int x = 0; x < n; x++){
           c = a + b;
           a = b;
           b = c;
        }

        return (c);
    }

    public static void main(String args[]){
        FibonacciIterative n = new FibonacciIterative();
        System.out.println(n.fibonacci(2));
    }
}
