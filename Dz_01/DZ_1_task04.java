//https://leetcode.com/problems/valid-palindrome/      №125 дополнительные строки, стрингбилдеры и replaceAll нельзя использовать
public class DZ_1_task4 {
    public static Boolean isAlphaNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
                !(c >= 'a' && c <= 'z') &&
                !(c >= '0' && c <= '9')) {
                    return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    public static void main(String[] args)  {
        String s1= "A man, a plan, a canal: Panama";
        String s2=s1.toLowerCase();
        String s3="";
        System.out.println(s2.toLowerCase());
        for (int i=0;i<s2.length();i++) {
            String test1=Character.toString(s2.charAt(i)) ;
            if (isAlphaNumeric(test1)==true) {
               s3=s3+test1;
            }
        }
        System.out.println(s3);
        int bukv_sovpad=0;
        for (int j =0 ; j< s3.length(); j++)  {
            if (s3.charAt(j)==s3.charAt(s3.length()-j-1)){
                bukv_sovpad=bukv_sovpad+1;
            }
        }
        if  (s3.length()==bukv_sovpad){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}