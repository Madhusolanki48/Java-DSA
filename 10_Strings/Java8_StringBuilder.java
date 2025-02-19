public class Java8_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //abcdefgh......
        System.out.println(sb);
    }
}
