import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class StandCalcDisplay  extends JFrame implements ActionListener
{
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	static double a=0,b=0,result=0;
	static int operator=0;
	
	StandCalcDisplay()
	{
		t = new JTextField("");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bdiv = new JButton("/");
		bmul = new JButton("*");
		bsub = new JButton("-");
		badd = new JButton("+");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("Delete");
		bclr = new JButton("CE");
		
		t.setBounds(30,40,280,30);
		b7.setBounds(30,100,50,40);
		b8.setBounds(100,100,50,40);
		b9.setBounds(170,100,50,40);
		bdiv.setBounds(240,100,50,40);
		
		b4.setBounds(30,170,50,40);
		b5.setBounds(100,170,50,40);
		b6.setBounds(170,170,50,40);
		bmul.setBounds(240,170,50,40);
		
		b1.setBounds(30,240,50,40);
		b2.setBounds(100,240,50,40);
		b3.setBounds(170,240,50,40);
		bsub.setBounds(240,240,50,40);
		
		bdec.setBounds(30,310,50,40);
		b0.setBounds(100,310,50,40);
		beq.setBounds(170,310,50,40);
		badd.setBounds(240,310,50,40);
		
		bdel.setBounds(55,380,100,40);
		bclr.setBounds(175,380,100,40);
		
		add(t);
		add(b7);
		add(b8);
		add(b9);
		add(bdiv);
		add(b4);
		add(b5);
		add(b6);
		add(bmul);
		add(b1);
		add(b2);
		add(b3);
		add(bsub);
		add(bdec);
		add(b0);
		add(beq);
		add(badd);
		add(bdel);
		add(bclr);
		
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
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==bdec)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());
		
			switch(operator)
			{
				case 1: result = src.Calculators.StandardCalculator.sum(a,b);

					break;
		
				case 2: result = src.Calculators.StandardCalculator.diff(a,b);

					break;
		
				case 3: result = src.Calculators.StandardCalculator.multi(a,b);

					break;
		
				case 4: result = src.Calculators.StandardCalculator.dev(a,b);

					break;
		
				default: result=0;
			}

			t.setText(""+result);
		}
		
		if(e.getSource()==bclr)
			t.setText("");
		
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}
	}
	
}
