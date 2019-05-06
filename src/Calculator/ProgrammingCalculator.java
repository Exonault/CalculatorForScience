public class ProgrammingCalculator 
{
		public String KamDvoichna(String chislo, int sistema)
	{
		return Integer.toString(Integer.parseInt(chislo, sistema), 2);
	}
	
	public String KamOsmichna(String chislo, int sistema)
	{
		return Integer.toString(Integer.parseInt(chislo, sistema), 8);
	}
	
	public String KamDesetichna(String chislo, int sistema)
	{
		return Integer.toString(Integer.parseInt(chislo, sistema), 10);	}
	
	public String KamShestnadesetichna(String chislo, int sistema)
	{
		return Integer.toString(Integer.parseInt(chislo, sistema), 16);	}
	

	//Integer.parseInt(chislo, sistema) - izvejdane na chislo OT opredelena sistema kam desetichna
	
	//Integer.toString(chislo, sistema) - izvejdane na chislo v opredelena sistema
}
