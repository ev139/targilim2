import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//
//
//        //                                                        1
//        //
//        // int   =       ערך  שלם
//        // flout  =     ערך  עשרוני
//
//
//        //                                                       2
//
//
//        //    scanner  =        מאפשר  לנו לקבל  איפורמציה  (input)   מהיוזר
//
//
//        //                                                         3
//
//        //  System.out.println();  =    מדפיס לטרמינל
//
//
//        //                                                   4
//
////        int x = 5;
//
//
////      int a = 20 + 12 ;
//
//
////       float z = 5.7f;
//
//
//        //                                                      5
//
////
////        int a  = 5;
////         int b  = 10;
////
////         int sum = a + b ;
////         int multiply = a * b ;
////
////
////         //                                                           6
////
////
////        String color ="blue";
////
////        //                                                          7
////
////
////           String name  = s.nextLine();
////       System.out.println( " hello "  + name  + " welcome to java ! ");
//
//
//        //                                                            8
////
////        int year = 2020;
////        year+=10;
////        year-=30;
////        System.out.println( year );
//
//
//        //                                                            9
//
////
////        int a = s.nextInt();
////        int b = s.nextInt();
////        int c = s.nextInt();
////        System.out.println(( a + b + c) / 3);
//
//
//        //                                                             10
////
////        int speed = s.nextInt();
////        if (speed > 120) {
////            System.out.println(" too  fast  " + speed);
////        } else if (speed < 80) {
////            System.out.println(" too slow !  " + speed);
////        } else {
////            System.out.println(" good driver " + speed);
////        }
//
//
//        //                                                                 11
////
////        System.out.println( " hello tomer what is your age ");
////        int tomerAge = s.nextInt();
////        System.out.println( " hello danny what is your age ");
////        int dannyAge = s.nextInt();
////        if ( tomerAge > dannyAge){
////            System.out.println( " tomer is the older " + tomerAge);
////        }else {
////            System.out.println( " danny is the older " + dannyAge);
////        }
//
//
//        //                                                               12
//
////
////        System.out.println( " hello , enter 2 numbers " );
////        int num1 = s.nextInt();
////        int num2 = s.nextInt();
////
////        if ( num1 == num2 ){
////            System.out.println( " equal ");
////        }
////        if ( num1 > num2 ){
////            System.out.println( num2  );
////        }else {
////            System.out.println( num1 );
////        }
//
//
//        //                                                                13
//
////
////        int a = 0, b = 100;                                   //      אןפציה 1
////        while (a < b) {
////            System.out.println(a);
////            a += 3;                                           //     עולה  ב 3
////            if (a == b) {
////                break;
////
////
////            }
////        }
//
//
////
////        for ( int a = 0; a < 100; a++ ){                      //     אןפציה  2
////        if ( a % 3 == 0){                                      //    חילוק  ב  3
////            System.out.println(a);
////        }
////        }
//
//
//        //                                                              14
//
//        System.out.println(" enter 3 numbers : ");             //
//
//        int num1 = s.nextInt();
//        System.out.println("num1 " + num1);
//
//        int num2 = s.nextInt();
//        System.out.println("num2 " + num2);
//
//        int num3 = s.nextInt();
//        System.out.println("num3 " + num3);
//
//
//        System.out.println(" the middel num is : ");
//
//        if ((num1 < num2 && num1 > num3) || (num1 < num3 && num2 < num1)) {
//            System.out.println("num1  " + num1 + "  is the middel  ");
//
//        } else if ((num2 < num1 && num2 > num3) || (num2 < num3 && num1 < num2)) {
//            System.out.println("num2 " + num2 + "  is the middel  ");
//
//        } else if ((num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num1)) {
//            System.out.println("num3 " + num3 + "  is the middel  ");
//        }
//    }
//}


//        //                                                                        15
//////
////        int x = s.nextInt();             //     הזן ההיוזר  2  מספרים  וסדר אותם  מהקטן לגדול
////        int y = s.nextInt() ;
////
////        if   ( x < y) {
////            System.out.println( String.format( " %d , %d " , x , y));
////        }else {
////            System.out.println( String.format( " %d ,%d " , y ,x));
////        }
//
//
//        //                                                                     16
////
////         int a = 0 , b = 10 ;        //      לולאה  מ  1  עד  10
////        do {
////            System.out.println(a);
////            a++;
////        }while ( a <= b );
////
//
//
//        //                                                                     17
//
////
////        int a = 1 , b = 50 ;           //       לולאה  מ  1  עד  50    במספרים  לא  זוגיים
////        do {
////            System.out.println(a);
////            a += 2;
////        } while  ( a <= b);
////
////
////        }
////
//
//
//       //                                                                      18
//
       // Random random = new Random();             //   לולאת    random    מ  10   עד  30
//
//        int r;
//
//        do {
//
//            r = random.nextInt(21) + 10;
//            System.out.println(r);
//        } while (r != 15);


        //                                                                     19
//
//        int num = s.nextInt();                  //                          switch
//        switch ( num ){
//            case 1 :
//                System.out.println( " one ");
//                break;
//
//            case 2 :
//                System.out.println( " two ");
//                break;
//
//
//            case 3 :
//                System.out.println( " three ");
//                break;
//
//            default:
//                System.out.println("unknown number");
//        }


        //                                                                     20

//
//            int a ;              //      לןלאת  while / true    יציאה ב 0   וסופר את  הניסיונות
//            int enterTime  = 0;
//
//            a = s.nextInt();
//
//            while ( true ) {
//                a = s.nextInt();
//                enterTime ++;
//
//                if (a == 0) {
//                    break;
//                }
//            }
//
//            System.out.println(enterTime);
//
//            }


        //                                                                         21
//
//        int a;                   //      הזן  מספר  בן 3 ספרות והדפס את ספרת המאות
//        a = s.nextInt();
//
//
//        while (a >= 100 && a <= 999) {
//            System.out.println(a / 100);
//        break;
//        }
//    }
//}


          int gread;                               //                                  22
        int  a ;
        int sum = 1;                              //      מספר הפעמים

        System.out.println(" enter the gread " + sum);
        gread = s.nextInt();
         int mya;
        //a = gread + gread ;
        sum++;
        while (gread != -1) {
            System.out.println(" enter the gread " + sum);
            gread = s.nextInt();
            a = gread + gread ;
            sum++;
             mya = a+ a ;
            if (gread == -1) {

                break;
            }
        }
        System.out.println(" the averege of your testes is :  " +  gread / sum);


















    }
    }






















































