package StringTDD;

public class Example {

	public String swap2char(String str)
	{
		int len = str.length();
		
		if(len < 2) return str;
		
		char lchar = str.charAt(len-1);
		char slchar = str.charAt(len-2);
		
		String leftStr = str.substring(0,len-2);
		//return  ""+lchar + slchar;  for only two char in string
		
		return  leftStr +lchar + slchar;
	}
}
