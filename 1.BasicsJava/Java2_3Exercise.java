//----------Operators Questions--------
public class Java2_3Exercise {
    public static void main(String[] args) {
        // Ques1.What will be the output of the following programs
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + ",");
        System.out.println(exp2);
        //ans.= 5 , 4

        // Ques2.
        int a = 200, b = 50, c = 100;
        if(a > b && b > c){
            System.out.println("Hello");
        }if(c > b && c < a){
            System.out.println("Java");
        }if((b+200) < a && (b+150) < c){
            System.out.println("Hello Java");
        }
        // ans2. Java

        // Ques3.
        int l,m,n;
        l = m = n = 2;
        l += m;   // l = l+m
        m -= n;   // m = m-n
        n /= (l+m); // n = n / (l+m)
        System.out.println(l + " " + m + " " + n);
        // ans3. 4 0 0

        // Ques4.
        int u=9, v=12;
        int p=2, q=4, r=6;
        int exp= 4/3 * (u+34) + 9 * (p+q*r) + (3+v * (2+p)) / (p + q*v);
        System.out.println(exp);

        // ans4. 1+43 + 9*26 + 51/50 = 278

        // Ques5.
        int X=10, Y=5;
        int exp_1= (Y * (X / Y + X));  // 5*(10/5 + 10) => 5*(2+10) = 60
        int exp_2= (Y * X / Y * X);    // 5*10/5*10 => 50/5*10 =>10*10 =100
         System.out.println(exp_1 +"," + exp_2);

        // ans5. 60,100
                                                                                                                                                                                                                                                                                                                                                                                                   

    }


    }

