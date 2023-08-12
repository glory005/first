package task;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//pyramid
//        int a, b, c, d;
//        System.out.print("Enter any number:");
//        a = in.nextInt();
//        System.out.print("Enter any number:");
//        b = in.nextInt();
//        System.out.print("Enter any number:");
//        c = in.nextInt();
//        System.out.print("Enter any number:");
//        d = in.nextInt();
//        System.out.println("   " + a);
//        System.out.println("  " + b + b + b);
//        System.out.println(" " + c + c + c + c + c);
//        System.out.println("" + d + d + d + d + d + d + d);
//------------------------------------------------------------------------------
//************COMPOUND ASSIGNMENT************  (+= -= *= /= %=)
// a=a+3; = (a+=3)
//a++ = post increment
//++a = pre increment
//a-- = post decrement
//--a = pre decrement
//        int a = 10, b = 12, c;
//        c = a++;
//        System.out.println("c is :"+c);
//        System.out.println("a is :"+a);
//------------------------------------------------------------------------------
//ex)1  ***********Arithmetic operators***************
// + - * / %
//         byte a,b;
//         System.out.print("First child age:");
//         a=in.nextByte();
//         System.out.print("Second child age:");
//         b=in.nextByte();
//         System.out.println("a+b:"+(a+b));
//         System.out.println("a-b:"+(a-b));
//         System.out.println("a*b:"+(a*b));
//         System.out.println("a/b:"+(a/b));
//         System.out.println("a%b:"+(a%b));
//------------------------------------------------------------------------------
//Ex)2
//        int a = 3, b = 4, c;
//        c = a + b + a++ + b++ + ++a + ++b;    
//        System.out.println(c);
//Ex)3
//        int a = 6, b = 4, c = 2, d;
//        d = a + b + c++ + ++a + ++b + c;
//        System.out.println(d);
//------------------------------------------------------------------------------
        //Bitwise operators(&,|,~,^,<<,>>)
//Ex)1   (& bitwise and)
//   int a,b;
//   a=20;
//   b=30;
//        System.out.println(a&b);
//Ex)2  (| bitwise or)
//    int a,b;
//    a=20;
//    b=30;
//        System.out.println(a|b);
//Ex)3   (~ bitwise not) _ one value
//     int a,b;
//     a=20;
//     b=-30;
//        System.out.println(~a); //positive  -(20+1)=-21
//        System.out.println(~b); //negative   +(30-1)=29
//Ex)4    (^  bitwise xor)
//    int a,b;
//    a=20;
//    b=30;
//        System.out.println(a^b);
//Ex)5    (<<  bitwise left shift)
//    int a,b;
//    a=20;
//    b=3;
//        System.out.println(a<<b);
//Ex)6    (>>  bitwise right shift)
//    int a,b;
//    a=17;
//    b=3;
//        System.out.println(a>>b);
//------------------------------------------------------------------------------
//Ex)7
//pre increment(++a), post incement(a++)
//    int a;
//    a=12;
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);
//pre decrement(--a),post decrement(a--)
//    int a;
//    a=12;
//        System.out.println(--a);
//        System.out.println(a--);
//        System.out.println(a);
//------------------------------------------------------------------------------
//Ex)8
//       boolean male=true;
//       String out=(male)?"boy":"girl";
//        System.out.println(out);
//Ex)9
//      Conditional operators(ternary operators)
//        int number;
//        System.out.print("Enter any number:");
//        number=in.nextInt();
//        String result=(number>0)?"positive number":"negative number";
//        System.out.println(result);
//------------------------------------------------------------------------------
// if-else statement
//
//        int year;
//        System.out.println("Enter the year:");
//        year=in.nextInt();
//        if(year%4==0)
//        {
//            System.out.println(year+" year is leap year");
//        }
//        else{
//            System.out.println(year+" year is not leap year");
//        }
//------------------------------------------------------------------------------
// nested if
//        int year;
//        System.out.print("Enter the year:");
//        year = in.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " is leap year");
//                } else {
//                    System.out.println(year + " is not leap year");
//                }
//            } 
//            else {
//                System.out.println(year + " is leap year");
//            }
//        }
//        else {
//            System.out.println(year + " is not leap year");
//        }

//------------------------------------------------------------------------------
// Task-2  Switch case

//            String food;
//            System.out.print("Enter your favorite food:");
//            food=in.nextLine().toLowerCase();
//            switch(food){ 
//                case "noodles":
//                {
//                    System.out.println(food+"price is Rs.65");
//                    break;
//                }
//                case "fride rice":
//                {
//                    System.out.println(food+"price is Rs.70");
//                    break;
//                }
//                case "briyani":
//                {
//                    System.out.println(food+"price is Rs.150");
//                    break;
//                }
//                case "ice cream":
//                {
//                    System.out.println(food+"price is Rs.50");
//                    break;
//                }
//                default:
//                {
//                    System.out.println("This food is not available");
//                }
//            }
 

//------------------------------------------------------------------------------
//    TASK-3
     
//    String city;
//        System.out.print("Enter the ticket booked(tenkasi to chennai):");
//        city=in.nextLine().toLowerCase();
//        switch (city)
//        {
//            case "chennai":
//            {
//                System.out.println(city+" ticket rate Rs.900");
//                break;
//            }
//              case "madurai":
//            {
//                System.out.println(city+" ticket rate Rs.100");
//                break;
//            }
//              case "tiruchy":
//            {
//                System.out.println(city+" ticket rate Rs.300");
//                break;
//            }
//              default:
//              {
//                  System.out.println("sorry ticket not available");
//              }
//        }

//------------------------------------------------------------------------------

//        TASK-4

        int num;
        System.out.print("Enter the any number(1 to 7):");
        num=in.nextInt();
        switch(num){
            case(1):{
                System.out.println("MONDAY");
                break;
            }
            case(2):{
                System.out.println("TUESDAY");
                 break;
            }
            case(3):{
                System.out.println("WEDNESDAY");
                 break;
            }
            case(4):{
                System.out.println("THURSDAY");
                 break;
                }
            case(5):{
                System.out.println("FRIDAY");
                 break;
            }
            case(6):{
                System.out.println("SATURDAY");
                 break;
            }
            case(7):{
                System.out.println("SUNDAY");
                 break;
            }
            default:
            {
                System.out.println("Sorry this number not available");
                 break;
            }
        }
        
        
        
        
        
        
        
        
        
        
        

        
        




    }
}
