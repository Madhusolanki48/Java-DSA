public class Java6_3CallByValue_Swap {
        //swap--values exchange
    public static void swap(int a, int b){
            //swap
            int temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping !");
            System.out.print("a = "+a+" | ");
            System.out.println("b =" +b);

        }

       /* System.out.println("Before Swapping !");
        int a=5;
        System.out.print("a = "+a +" | ");
        int b=10;
        System.out.println("b = "+b);

        */
        //swap
        /*int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping !");
        System.out.print("a = "+a+" | ");
        System.out.println("b =" +b);
         */
       public static void main(String[] args) {
           int a=5;
           int b=10;
           swap(a,b);
           System.out.print("a = "+a+" | ");
           System.out.println("b =" +b);

    }



}
