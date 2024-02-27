package ConditionalStatments;

public class IfElse {
    public static void main(String[] args) {
      /*  int age = 4;
        //if else
        if (age >= 18) {
            System.out.println("you can vote");
            System.out.println("good morning");
        }
        else {
            System.out.println("You can not vote");
        }
*/
        //elseif
        /*int day =5;
        if(day == 1)
        {
            System.out.println("go to home ");
        } else if (day ==2) {

            System.out.println("go to village");

        } else if (day == 3) {
            System.out.println("go to party");

        } else{
            System.out.println("go to office");
        }
        System.out.println("went somewhere today");*/

        // Nested if-else statement
        //you are given 3 no and find the maximum number
        int a = 4;
        int b = 8;
        int c = 1;

        if(a > b)
        {
            System.out.println("a is bigger than b");
            if(a>c){
                System.out.println("a is bigger than c");
                System.out.println("a is largest "+a);
            }else{
                System.out.println("c is bigger than a");
                System.out.println("c is largest" +c);
            }

        }else {

            System.out.println("b is bigger than a");
            if (b > c)
            {
                System.out.println("b is bigger than c");
                System.out.println("b is largest "+b);
            }else {
                System.out.println("c is bigger than b");
                System.out.println("c is largest " +c);
            }

        }


    }
}
