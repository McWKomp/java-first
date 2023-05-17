package lesson1;

public class hw {



    public static void main (String[] args){

        //task 1
        System.out.println("First task--------------------------------------------------");

        int min = 16;

        if (min >= 0 && min <=15)
            System.out.println("first quarter");
        if (min > 15 && min <=30)
            System.out.println("second quarter");
        if (min > 30 && min <=45)
            System.out.println("third quarter");
        if (min > 45 && min <=59)
            System.out.println("fourth quarter");

        //task 2
        System.out.println("Second task--------------------------------------------------");

        int a = 0;

        if (a > 0 && a < 5)
            System.out.println("Tak!");
        else
            System.out.println("Vy schojino vbyly 143 000 000 rosijan, vitajemo vas!");

        //task 3
        System.out.println("Third task--------------------------------------------------");

        if (a == 0 || a == 2)
            System.out.println(a+7);
        else
            System.out.println(a/4);

        //task 4
        System.out.println("Fourth task--------------------------------------------------");

        int b = 3;

        if(a <= 1 && b >=3)
            System.out.println(a+b);
        else
            System.out.println(a-b);

        //task 5
        System.out.println("Fifth task--------------------------------------------------");

        if(a> 2 && a< 11 || b>=6 && b < 14)
            System.out.println("Tak!");
        else
            System.out.println("Ni");


    }

}
