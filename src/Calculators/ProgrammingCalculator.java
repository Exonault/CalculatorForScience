package Calculators;

public class ProgrammingCalculator
{
	public static String toBinary(int chislo, int sistema)
	{
		String a = Integer.toString(chislo, 2);
		return a;
	}
	public static String toOctal(int chislo, int sistema)
	{
		String a = Integer.toString(chislo, 8);
		return a;
	}
	public static String toDecimal(int chislo, int sistema)
	{
		String a = Integer.toString(chislo, 10);
		return a;
	}
	public static String toHexadecimal(int chislo, int sistema)
	{
		String a = Integer.toString(chislo, 16);
		return a;
	}
}
