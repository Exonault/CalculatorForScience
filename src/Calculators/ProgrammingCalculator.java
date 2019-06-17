package Calculators;

public class ProgrammingCalculator
{
	//Chislo kam dvoichna sistema br. sistema
	public static String toBinary(int chislo, int sistema)
	{
		//Vrashtane na chisloto vav dvoichna sistema
		String a = Integer.toString(chislo, 2);
		return a;
	}
	
	//Chislo kam osmichna br. sistema
	public static String toOctal(int chislo, int sistema)
	{
		//Vrashtane na chisloto vav osmichna sistema
		String a = Integer.toString(chislo, 8);
		return a;
	}
	
	//Chislo kam desetichna br. sistema
	public static String toDecimal(int chislo, int sistema)
	{
		//Vrashtane na chisloto vav desetichna sistema
		String a = Integer.toString(chislo, 10);
		return a;
	}
	
	//Chislo kam shestnadesetichna br. sistema
	public static String toHexadecimal(int chislo, int sistema)
	{
		//Vrashtane na chisloto vav shestnadesetichna sistema
		String a = Integer.toString(chislo, 16);
		return a;
	}
}
