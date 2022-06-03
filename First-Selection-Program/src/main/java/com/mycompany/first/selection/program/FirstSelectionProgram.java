package com.mycompany.first.selection.program;
import java.util.Scanner;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

public class FirstSelectionProgram {

    public static void main(String[] args) {
        
        //imported
        Scanner keyedInput = new Scanner(System.in);
        
        
        //variables
        double cartPrice;
        double discount = 1;
        double totalPrice;
        double totalDiscount;
        
        final int BRACKET_ONE   = 40;
        final int BRACKET_TWO   = 80;
        final int BRACKET_THREE = 120;
        final double BRACKET_FOUR  = 120.01;
        
        final double DISCOUNT_ONE   = 0.1;
        final double DISCOUNT_TWO   = 0.2;
        final double DISCOUNT_THREE = 0.3;
        final double DISCOUNT_FOUR  = 0.4;
        
        
        //input
        System.out.println("Please enter the amount spent:");
        cartPrice = keyedInput.nextDouble();
        
        
        //elseifs
        if(cartPrice < 0){
            System.out.println("Error: Input a value greater than 0.");
            System.exit(0);
        } else if (cartPrice <= BRACKET_ONE){
            discount = DISCOUNT_ONE;
        } else if(cartPrice <= BRACKET_TWO){
            discount = DISCOUNT_TWO;
        } else if(cartPrice <= BRACKET_THREE){
            discount = DISCOUNT_THREE;
        } else if(cartPrice >= BRACKET_FOUR){
            discount = DISCOUNT_FOUR;
        } else{
            System.out.println("Error: invalid input.");
            System.exit(0);
        }
        
        
        //calculations
        totalDiscount = cartPrice * discount;

        totalPrice = cartPrice - totalDiscount;
        
        totalPrice = totalPrice*100;
        totalPrice = Math.round(totalPrice);
        totalPrice = totalPrice / 100;
        
        totalDiscount = totalDiscount*100;
        totalDiscount = Math.round(totalDiscount);
        totalDiscount = totalDiscount / 100;
        
        
        //results
        System.out.println("The discount value is: " + discount*100 + "%");
        System.out.println("The total saved is: $" + totalDiscount);
        System.out.println("The final price is: $" + totalPrice);
        
    }
}
