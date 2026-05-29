package String;
public class CountAlphabets {
    public static void main(String[] args) {
        
        String str="Hello World";

        int upperCount = 0;
        int lowerCount = 0;

        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);

            if (ch >='A' && ch<='Z'){
                upperCount++;
            }
            else if(ch>='a' && ch <='z'){
                lowerCount++;
            }
        }

        System.out.println("Upper case letters "+ upperCount);
        System.out.println("Lower case letters "+ lowerCount);
    }
}
