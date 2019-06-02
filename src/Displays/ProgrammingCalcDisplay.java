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

public class ProgrammingCalcDisplay extends JFrame implements ActionListener
{
	//JFrame f;
	JTextField t;
	JButton bo,bd,bh,ob,od,oh,db,doo,dh,hb,ho,hd;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	static int a=0;
	ProgrammingCalcDisplay()
	{
		//f=new JFrame("Programming Calculator");
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
		
		add(t);
		add(bo);
		add(bd);
		add(bh);
		add(ob);
		add(od);
		add(oh);
		add(db);
		add(doo);
		add(dh);
		add(hb);
		add(ho);
		add(hd);
		
		bar = new JMenuBar();
		setJMenuBar(bar);
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
				dispose();
				add(new StandCalcDisplay());
			}
			});
		
		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();

				add(new ProgrammingCalcDisplay());
			}
			});
		
		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();

				add(new ScientificCalcDisplay());
			}
			});
		
		setLayout(null);
		setVisible(true);
		setSize(650, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		
		bo.addActionListener(this);
		bd.addActionListener(this);
		bh.addActionListener(this);
		
		
		ob.addActionListener(this);
		od.addActionListener(this);
		oh.addActionListener(this);
		
		
		db.addActionListener(this);
		doo.addActionListener(this);
		dh.addActionListener(this);
		
		
		hb.addActionListener(this);
		ho.addActionListener(this);
		hd.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bo)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toOctal(a, 2));
		} 
		
		if(e.getSource()==bd)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toDecimal(a, 2));
		} 
		
		if(e.getSource()==bh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toHexadecimal(a, 2));
		} 
		
		
		
		
		if(e.getSource()==ob)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toBinary(a, 8));
		} 
		
		if(e.getSource()==od)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toDecimal(a, 8));
		} 
		
		if(e.getSource()==oh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toHexadecimal(a, 8));
		} 
		
		
		
		
		if(e.getSource()==db)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toBinary(a, 10));
		} 
		
		if(e.getSource()==doo)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toOctal(a, 10));
		} 
		
		if(e.getSource()==dh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toHexadecimal(a, 10));
		} 
		
		
		
		
		if(e.getSource()==hb)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toBinary(a, 16));
		} 
		
		if(e.getSource()==ho)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toOctal(a, 16));
		} 
		
		if(e.getSource()==hd)
		{
			a=Integer.parseInt(t.getText());
			t.setText(src.Calculators.ProgrammingCalculator.toDecimal(a, 16));
		} 
	}

}
