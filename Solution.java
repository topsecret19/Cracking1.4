public class MyClass {
    
   public static boolean isPermutationOfPalindrome(String s){
        if(s.length()==0)return false;
        int[] charsCount = new int[256];
        String str = s.toLowerCase();
        for (int i=0; i<s.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                int index = str.charAt(i);
            charsCount[index]++;
            }
        }
        int found=0;
        for(int i=0; i<charsCount.length; i++){
            if(charsCount[i]%2!=0) found++;
            if(found>1) return false;
        }
        return true;
    }
     public static void main(String[] args){
                 System.out.println(isPermutationOfPalindrome("act cat"));

     }
    
}
