package Username;

public class UnameCase {

	public boolean isValidUname(String name)
	{
		if(name.contains("#") || name.contains("*") || name.contains("%"))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean isUpper(String name)
	{
		String upname = name.toUpperCase();
		
		if(name == upname)
			return false;
		
		return true;
	}
	
	public boolean isValidPass(String pass)
	{
		char fc = pass.charAt(0);
		char sc = pass.charAt(1);
		
		if(Character.isAlphabetic(fc) && Character.isDigit(sc) && pass.length() >=8 )
			return true;
		else
			return false;
	}
	
}
