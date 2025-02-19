public class Java2_StringMethod {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "PROGRAMMING";
        System.out.println(str.charAt(2));
        printLetters(str);

    }

}
