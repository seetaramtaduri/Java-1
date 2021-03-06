import java.util.regex.Pattern;

public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("X{n,} = X occurs n or more times");  
		
		System.out.println(Pattern.matches("a{3,}", "aaa"));//true (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "aaaaaa"));//true (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "aa"));//false (a can come 3 times or more) 
		System.out.println(Pattern.matches("a{3,}", "a"));//false (a can come 3 times or more)
		System.out.println(Pattern.matches("a{3,}", "bbb"));//false (a can come 3 times or more)
	}

}