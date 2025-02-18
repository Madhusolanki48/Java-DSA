public class Java3_7TernaryOperator {
    public static void main(String[] args) {
        int num=4;
        String type=(num%2)==0 ? "even" : "odd";
        System.out.println(type);

        //Check if a student will pass or fail
        //marks>=33:fail and marks<33:pass

        int marks=67;
        String reportCard=marks>=33 ? "Pass" : "Fail";
        System.out.println(reportCard);

    }
}
