public class Java4_3CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Madhu";
        s1.roll=489;
        s1.password="abcd";
        s1.marks[0]=10;
        s1.marks[1]=35;
        s1.marks[2]=55;

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=25;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }   
    }
}
    class Student{
        String name;
        int roll;
        String password;
        int marks[];

        Student(){
            marks=new int[3];
            System.out.println("const is called...");
        }
         //Shallow Copy Constructor
        // Student(Student s1){  //Copy Constructor
        //     marks=new int[3];
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }


        //Deep Copy Constructor
        Student(Student s1){  
                 marks=new int[3];
                 this.name=s1.name;
                 this.roll=s1.roll;
                 for(int i=0;i<marks.length;i++){
                    this.marks[i]=s1.marks[i];
                 }
                }

        
        Student(String name){
            marks=new int[3];
            this.name=name;
        }
    }
    
