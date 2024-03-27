package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MathUtils utility = new MathUtils();
        System.out.println("The sum is " + utility.add(3, 4));
    }
}
