public class Java4_2ConstructorTypes {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Madhu");
        Student s3=new Student(123);

    }   
    }
    class Student{
        String name;
        int roll;

        Student(){ //Non-Parameterized
            System.out.println("const is called...");
        }
        Student(String name){ //Parameterized
            this.name=name;
        }
        Student(int roll){
            this.roll=roll;
        }
    }
    

