package ConditionalStatments;

public class ifelseinternary {

    public static void main(String[] args) {


        int a = 12;
        int b = 23;
        int max = 0;
//    if(a > b){
//        max = a;
//    }else{
//        max = b;
//    }

        max = a > b ? a : b;

        System.out.println("max num is " + max);
    }
}
