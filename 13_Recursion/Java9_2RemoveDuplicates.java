public class Java9_2RemoveDuplicates {
    public static void removeDuplicates(String str,int idx,StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), null);
    }
    
}
