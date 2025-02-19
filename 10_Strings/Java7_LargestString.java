public class Java7_LargestString {
    //For a given set of Strings, print the largest string.
    //Lexicographical order

    //compareTo Function

    public static void main(String[] args) {
        String fruits[]={"appple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}

               //Time Complexity=O(n*x)
