import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgrammingCalcDisplay 
{
	JFrame f;
	JTextField t;
	JButton bo,bd,bh,ob,od,oh,db,doo,dh,hb,ho,hd;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	
	ProgrammingCalcDisplay()
	{
		f=new JFrame("Programming Calculator");
		t = new JTextField("");
		bo = new JButton("Binary to Octal");
		bd = new JButton("Binary to Decimal");
		bh = new JButton("Binary to Hexadecimal");
		ob = new JButton("Octal to Binary");
		od = new JButton("Octal to Decimal");
		oh = new JButton("Octal to Hexadecimal");
		db = new JButton("Decimal to Binary");
		doo = new JButton("Decimal to Octal");
		dh = new JButton("Decimal to Hexadecimal");
		hb = new JButton("Hexadecimal to Binary");
		ho = new JButton("Hexadecimal to Octal");
		hd = new JButton("Hexadecimal to Decimal");
		
		t.setBounds(80,40,490,30);
		bo.setBounds(40, 100, 180, 40);
		bd.setBounds(240, 100, 180, 40);
		bh.setBounds(440, 100, 180, 40);
		ob.setBounds(40, 170, 180, 40);
		od.setBounds(240, 170, 180, 40);
		oh.setBounds(440, 170, 180, 40);
		db.setBounds(40, 240, 180, 40);
		doo.setBounds(240, 240, 180, 40);
		dh.setBounds(440, 240, 180, 40);
		hb.setBounds(40, 310, 180, 40);
		ho.setBounds(240, 310, 180, 40);
		hd.setBounds(440, 310, 180, 40);
		
		f.add(t);
		f.add(bo);
		f.add(bd);
		f.add(bh);
		f.add(ob);
		f.add(od);
		f.add(oh);
		f.add(db);
		f.add(doo);
		f.add(dh);
		f.add(hb);
		f.add(ho);
		f.add(hd);
		
		bar = new JMenuBar();
		f.setJMenuBar(bar);
		CalcMenu = new JMenu("Calculators");
		bar.add(CalcMenu);	
		
		PrCalc = new JMenuItem("Programming Calculator");
		CalcMenu.add(PrCalc);
		ScCalc = new JMenuItem("Scientific Calculator");
		CalcMenu.add(ScCalc);
		StCalc = new JMenuItem("Standart Calculator");
		CalcMenu.add(StCalc);
		
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				new StandCalcDisplay();
			}
			});
		
		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				new ProgrammingCalcDisplay();
			}
			});
		
		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				new ScientificCalcDisplay();
			}
			});
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(650, 450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);

		
	}
	
	public static void main(String[] args)
	{
		new ProgrammingCalcDisplay();
	}

}
