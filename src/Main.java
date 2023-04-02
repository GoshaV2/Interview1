public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrom("123321"));
        System.out.println(isPalindrom("123221"));
        System.out.println(isPalindrom("12321"));
    }
    public static boolean isPalindrom(String str){
        int index=str.length()/2;
        for(int i=0;i<index;i++){
            int secondIndex=str.length()-i-1;
            if(str.charAt(i)!=str.charAt(secondIndex)){
                return false;
            }
        }
        return true;
    }

}