import java.util.*;
public class Java1_9_1Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Ques 1.Input 3 numbers and output avg
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(a+b+c)/3;
        System.out.println("Average of the numbers is: "+d);

        //Ques 2. Input side of square and output area
        System.out.println("Enter the side of square: ");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("Area of Square is: "+area );

        /*Ques 3. Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser.
         You have to output the total cost of the items back to the user as their bill.
         (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem*/
        System.out.println("Enter the price of pencil: ");
        float p1=sc.nextFloat();
        System.out.println("Enter the price of pen: ");
        float p2=sc.nextFloat();
        System.out.println("Enter the price of eraser: ");
        float p3=sc.nextFloat();
        float total=p1+p2+p3;
        System.out.println("Total Price(Without GST)= "+total);

        //With GST
        float gst=total*0.18f;
        float priceWithGst=total+gst;
        System.out.println("Total Price(With GST)= "+priceWithGst);

        //Ques 4. What will be the output
         byte x=4;
         char y='a';
         short s=512;
         int i=1000;
         float f=3.14f;
         double g=99.9954;
         double result=(f*x) +(i%y)-(g*s);     // 12.56 + 30 - 51197.0688..
        System.out.println("Output= "+result); // output=-51155.0847...

        //Ques 5.Will the following statement give any error in Java?

        int $=24;
        System.out.println($);



    }
}
