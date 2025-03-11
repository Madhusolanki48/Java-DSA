public class Java4_1Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
    }
}
    class Student{
        String name;
        int roll;
        // Student(String name){
            Student(){
            // this.name=name;
            // System.out.println();
            System.out.println("Constructor is called...");
        }
    }
    

