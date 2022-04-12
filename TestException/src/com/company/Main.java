package com.company;

import java.util.Scanner;

import static com.company.Main.SampleException.validateInput;

public class Main {



    class SampleException{
        public static void  validateInput(int number) throws InvalidInputException{
            if(number>100)
            {
                throw new InvalidInputException("The number you entered has to be lower or equal to 100");
            }
            System.out.println("All good");
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number equal or lower than 100");
        int number = scanner.nextInt();
        try
        {
            validateInput(number);
        }
        catch (InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}
