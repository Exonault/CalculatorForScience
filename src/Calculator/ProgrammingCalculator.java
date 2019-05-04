package Calculator;

import java.util.Scanner;

public class ProgrammingCalculator 
{
	
	ProgrammingCalculator()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Vavedete ot koq br. sistema shte bade chisloto (2,8,10,16) \n");
		int i=input.nextInt();
		while(i!=0)
		{
			
			System.out.print("Vavedete chislo koeto iskate da promenite\n");
			String chislo=input.next();
			
			if(i==2)
			{
				Dvoichna(chislo,i);
			}
			if(i==8)
			{
				Osmichna(chislo,i);
			}
			if(i==10)
			{
				Desetichna(chislo,i);
			}
			if(i==16)
			{
				Shestnadesetichna(chislo,i);
			}
			
			
			
			System.out.print("\n\nZa da vkarate novo chislo vavedete ot koq br. sistema e chisloto (2,8,10,16), ili 0 za zatvarqne \n");
			i=input.nextInt();
		}
		
	}
	
	public void Dvoichna(String chislo, int sistema)
	{
		
		DvoichnaKamOsmichna(chislo,sistema);
		DvoichnaKamDesetichna(chislo,sistema);
		DvoichnaKamShestnadesetichna(chislo,sistema);
		
	}
	
	public void Osmichna(String chislo, int sistema)
	{
		
		OsmichnaKamDvoichna(chislo,sistema);
		OsmichnaKamDesetichna(chislo,sistema);
		OsmichnaKamShestnadesetichna(chislo,sistema);
		
	}
	
	public void Desetichna(String chislo, int sistema)
	{
		
		DesetichnaKamDvoichna(chislo,sistema);
		DesetichnaKamOsmichna(chislo,sistema);
		DesetichnaKamShestnadesetichna(chislo,sistema);
		
	}
	
	public void Shestnadesetichna(String chislo, int sistema)
	{
		
		ShestnadesetichnaKamDvoichna(chislo,sistema);
		ShestnadesetichnaKamOsmichna(chislo,sistema);
		ShestnadesetichnaKamDesetichna(chislo,sistema);
		
	}
	
	
	public void DvoichnaKamOsmichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 8)+"(osm)\n");
	}
	
	public void DvoichnaKamDesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+ds+"(ds)\n");
	}
	
	public void DvoichnaKamShestnadesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 16)+"(shst)\n");
	}
	
	public void OsmichnaKamDvoichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 2)+"(dv)\n");
	}
	
	public void OsmichnaKamDesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+ds+"(ds)\n");
	}
	
	public void OsmichnaKamShestnadesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 16)+"(shst)\n");
	}
	
	public void DesetichnaKamDvoichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 2)+"(dv)\n");
	}
	
	public void DesetichnaKamOsmichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 8)+"(osm)\n");
	}
	
	public void DesetichnaKamShestnadesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 16)+"(shst)\n");
	}
	
	public void ShestnadesetichnaKamDvoichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 2)+"(dv)\n");
	}
	
	public void ShestnadesetichnaKamOsmichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+Integer.toString(ds, 8)+"(osm)\n");
	}
	
	public void ShestnadesetichnaKamDesetichna(String chislo, int sistema)
	{
		int ds=Integer.parseInt(chislo, sistema);
		System.out.print(chislo+"(dv) = "+ds+"(ds)\n");
	}
	//Integer.parseInt(chislo, sistema) - izvejdane na chislo OT opredelena sistema kam desetichna
	
	//Integer.toString(chislo, sistema) - izvejdane na chislo v opredelena sistema
}
