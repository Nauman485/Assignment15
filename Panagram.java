package geekster;

public class Panagram {
	public static void main(String []args) {
		String str="thequickbrownfoxjumpsoverthelazydog";
		str=str.toLowerCase();
		boolean t=isPanagram(str);
		System.out.println(t);
	}
    public static boolean isPanagram(String str) {
    	if(str.length()<26) {
    		return false;
    	}
    	else {
    		for(char c='a';c<='z';c++) {
    			if(str.indexOf(c)<0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
