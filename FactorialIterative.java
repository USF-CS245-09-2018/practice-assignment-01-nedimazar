package edu.usfca.cs.cs245;

public class FactorialIterative implements edu.usfca.cs.cs245.Factorial {


    //@Override
    public int factorial(int n) {
        int out = 1;
        for(int x = 1; x <= n ;x++){
            out = out * x;
        }
        return out;
    }

    public static void main(String args[]){
        FactorialIterative n = new FactorialIterative();
        System.out.println(n.factorial(6));
    }
}
