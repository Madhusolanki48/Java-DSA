import java.util.*;
//Java automatically promotes each byte, short, char operand to int on evaluation
public class Java11TypePromoExp {
    public static void main(String[] args) {
        char a='a';
        char b='b';
    //  char c= a-b; ----Not Possible because (a-b) becomes an int here but storing in ch is not possible
        short x=5;
        byte y=25;
        char z='c';
    //    byte bt= x+y+z; ---Not possible as above case
        //Possible on typecasting
        byte bt=(byte) (x+y+z);
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);
        System.out.println(bt);

// if one operand is long,float or double the whole exp is promoted to that oprnd resp..

        int l=10;
        float m=56.34f;
        long n=25;
        double o=30;
        double ans=l+m+n+o;
        System.out.println(ans);


        byte q=5;
    //    byte p=q*2; ---not possible (q is made int here (type promo as it's a exp) so the data will lose in byte)
        byte p=(byte)(q*2);
        System.out.println(p);


    }
}
