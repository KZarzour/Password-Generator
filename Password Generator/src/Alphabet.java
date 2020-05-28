


public class Alphabet {
	String UppercaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String LowercaseLetters="abcdefghijklmnopqrstuvwxyz";
	String Numbers="1234567890";
	String Symbols="!@#$%^&*()-_=+\\/~?";
	String Pool="";
	int PoolSize;

	public Alphabet(boolean Upper,boolean Lower, boolean Num, boolean Sym) {
		
		if (Upper==true) {
			Pool=Pool+UppercaseLetters;
		}
		
		if (Lower==true) {
			Pool=Pool+LowercaseLetters;
		}
		
		if (Num==true) {
			Pool=Pool+Numbers;
		}
		
		if (Sym==true) {
			Pool=Pool+Symbols;
		}
		
		PoolSize=Pool.length();
		
	}
	

	
	@Override
	public String toString() {
		return Pool;
	}


}
