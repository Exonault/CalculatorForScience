package Calculator;
import java.util.Scanner;
public class MainMenu 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
		System.out.print("Vavedete 1 za programistki calculator\n");//za da se vidi che moje da se vika spokoino sam slojil tova
        //pls no hate
		int a=input.nextInt();
		while(a!=1)
		{
			System.out.print("Vavedete nanovo\n");
			a=input.nextInt();
		}
		if(a==1)
		{
			ProgrammingCalculator programmingCalculator=new ProgrammingCalculator();
            //vikane na tozi calc
		}
    }
}
