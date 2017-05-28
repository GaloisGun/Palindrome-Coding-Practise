public class PalindromeNumber{
	public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        if(x != 0 && x % 10 == 0)
            return false;
            
        int compare = 0;
        while(compare < x){
            compare = 10 * compare + x % 10;
            x = x / 10;
        }
        
        return (x == compare || x == compare / 10);
    }
}