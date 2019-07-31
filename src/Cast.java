import java.sql.SQLOutput;
import java.util.Scanner;

public class Cast {

    public static void main(String[] args) {
//        double a = 5.52;
//        int i;
//        i = (int) a;
//        final float PI = 3.141f;
//        final double Latitude,Lontitude;
//        Latitude = 100.1254;
//        Lontitude = 99.1564;
//        System.out.println("Value \t PI= " + PI +"\n");
//        System.out.println("Latitude \t Latitude " + Latitude + "\n");
//        System.out.println("Lontitude \t Lontitude " + Lontitude + "\n");

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter name : ");
//        String s = scan.next();
//        System.out.println(s);
//        double r = Math.random();
//        int dice1 = (int) (Math.random()*6)+1;
//        int dice2 = (int) (Math.random()*6)+1;
//        int dice3 = (int) (Math.random()*6)+1;
//        System.out.println("ลูกที่1 : " +dice1);
//        System.out.println("ลูกที่2 : " +dice2);
//        System.out.println("ลูกที่3 : " +dice3);
//
//        String s = "15";
//        int d = Integer.parseInt(s);
//        System.out.println("Convert string to int = "+d*2);
//
//
//        s = Integer.toString(d);
//        System.out.println("Convert int to string = "+s);
//        System.out.println("convert int to base 16 = "+ Integer.toHexString(100));
//        System.out.println("convert int to base 8 = "+ Integer.toOctalString(100));
//        System.out.println("convert int to base 2 = "+ Integer.toBinaryString(100));
//        String login = "admin1";
//        boolean b = login.equals("admin1");
//        System.out.println(b);
//        b= !(1>2) && (3<4);
//        System.out.println(b);

//        boolean x;
//        x = (1>0 ) ? true:false;
//        System.out.println(x);

        Scanner scan = new Scanner(System.in);
        int withdraw;
        withdraw = scan.nextInt();

        int b1000 = (int)(withdraw/1000);
        int remain = withdraw%1000;

        int b500 = (int)(withdraw/500);

        remain = remain%500;
        int b100 = (int)(remain/100);

        System.out.println("ธนบัตรที่ได้รับ");
        System.out.println("B1000 : " + b1000);
        System.out.println("B500 : " + b500);
        System.out.println("B100 : " + b100);




    }
}
