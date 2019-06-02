

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainMenu
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
		
		
		frame.setBounds(0, 0, 600,480);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu CalcMenu = new JMenu("Calculators");
		menuBar.add(CalcMenu);	
		
		JMenuItem PrCalc = new JMenuItem("Programming Calculator");
		CalcMenu.add(PrCalc);
		JMenuItem ScCalc = new JMenuItem("Scientific Calculator");
		CalcMenu.add(ScCalc);
		JMenuItem StCalc = new JMenuItem("Standart Calculator");
		CalcMenu.add(StCalc);
        //slojete kodovete ot drygite LayoutiNaCalcolatorite otdolo:
        
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();

				frame.add(new StandCalcDisplay());
				
			}
			});
		
		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();

				frame.add(new ProgrammingCalcDisplay());
			}
			});
		
		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();

				frame.add(new ScientificCalcDisplay());
			}
			});
        
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

  //  System.out.print(CustomFormulas.TheAnsIsIntWhenTheParametarIs("A=(x-7)*(x-10)*(x-7)*(x-10)-40",7,0.5));
    }
}
