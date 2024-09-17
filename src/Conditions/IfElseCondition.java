package Conditions;

public class IfElseCondition {
    public static void main(String[] args) {
        /*
        Syntax of if statements :

        if(boolean expression is true){

           //body

        }

        else {

           // body

        }

         */

        int salary = 24500;

        if(salary>10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }

        System.out.println("New salary is : "+salary);
    }
}
