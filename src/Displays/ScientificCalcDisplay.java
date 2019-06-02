import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ScientificCalcDisplay extends JFrame implements ActionListener
{

	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,
	bmul,bsub,badd,bdec,beq,bdel,bclr,sin,cos,ln
	,log,TenX,XY,tg,cotg,sinh,cosh,tgh,cotgh,asin
	,acos,atg,acotg,pm,kor,xx;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	static double a=0,b=0,result=0;
	static int operator=0;
	
	static int checker=0;
	ScientificCalcDisplay()
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
		bclr = new JButton("C");
		
		sin = new JButton("Sin");
		cos = new JButton("Cos");
		tg = new JButton("Tg");
		cotg = new JButton("Cotg");
		
		sinh = new JButton("SinH");
		cosh = new JButton("CosH");
		tgh = new JButton("TgH");
		cotgh = new JButton("CotgH");
		
		asin = new JButton("ASin");
		acos = new JButton("ACos");
		atg = new JButton("ATg");
		acotg = new JButton("ACotg");
		
		
		ln = new JButton("Ln");
		
		log = new JButton("Log");
		
		TenX = new JButton("10(x)");
		
		XY = new JButton("X(y)");

		xx = new JButton("x*x");
		
		pm = new JButton("±");
		
		kor = new JButton("√");
		
		
		t.setBounds(40,40,530,30);
		b7.setBounds(220,200,80,40);
		b8.setBounds(310,200,80,40);
		b9.setBounds(400,200,80,40);
		bdiv.setBounds(490,200,80,40);
		
		b4.setBounds(220,250,80,40);
		b5.setBounds(310,250,80,40);
		b6.setBounds(400,250,80,40);
		bmul.setBounds(490,250,80,40);
		
		xx.setBounds(310,150,80,40);
		kor.setBounds(400,150,80,40);
		pm.setBounds(490,150,80,40);
		
		
		b1.setBounds(220,300,80,40);
		b2.setBounds(310,300,80,40);
		b3.setBounds(400,300,80,40);
		bsub.setBounds(490,300,80,40);
		
		bdec.setBounds(220,350,80,40);
		b0.setBounds(310,350,80,40);
		beq.setBounds(400,350,80,40);
		badd.setBounds(490,350,80,40);
		
		
		bclr.setBounds(220,150,80,40);
		
	
		sin.setBounds(40,100,80,40);
		cos.setBounds(130,100,80,40);
		tg.setBounds(40,150,80,40);
		cotg.setBounds(130,150,80,40);
		
		sinh.setBounds(40,200,80,40);
		cosh.setBounds(130,200,80,40);
		tgh.setBounds(40,250,80,40);
		cotgh.setBounds(130,250,80,40);
		
		asin.setBounds(40,300,80,40);
		acos.setBounds(130,300,80,40);
		atg.setBounds(40,350,80,40);
		acotg.setBounds(130,350,80,40);
		
		ln.setBounds(220,100,80,40);
		
		log.setBounds(310,100,80,40);
		
		TenX.setBounds(400,100,80,40);
		
		XY.setBounds(490,100,80,40);
		
		
		
		
	
		
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
		add(sin);
		add(cos);
		add(ln);
		add(log);
		add(TenX);
		add(XY);
		add(tg);
		add(cotg);
		add(sinh);
		add(cosh);
		add(tgh);
		add(cotgh);
		add(asin);
		add(acos);
		add(atg);
		add(acotg);
		add(pm);
		add(xx);
		add(kor);
		
		
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
		setSize(620, 450);
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
		
		sin.addActionListener(this);
		cos.addActionListener(this);
		tg.addActionListener(this);
		cotg.addActionListener(this);
		
		sinh.addActionListener(this);
		cosh.addActionListener(this);
		tgh.addActionListener(this);
		cotgh.addActionListener(this);
		
		asin.addActionListener(this);
		acos.addActionListener(this);
		atg.addActionListener(this);
		acotg.addActionListener(this);
		
		ln.addActionListener(this);
		
		log.addActionListener(this);
		
		TenX.addActionListener(this);
		
		XY.addActionListener(this);
		
		pm.addActionListener(this);
		
		kor.addActionListener(this);
		
		xx.addActionListener(this);
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
		
		
		
		
		
		if(e.getSource()==sin)
		{
			a=Double.parseDouble(t.getText());
			t.setText("sin("+a+") = "+src.Calculators.ScientificCalculator.Sin(a));
		}
		
		
		if(e.getSource()==cos)
		{
			a=Double.parseDouble(t.getText());
			t.setText("cos("+a+") = "+src.Calculators.ScientificCalculator.Cos(a));
		}
		
		
		if(e.getSource()==tg)
		{
			a=Double.parseDouble(t.getText());
			operator=7;
			t.setText("tg("+a+") = "+src.Calculators.ScientificCalculator.Tan(a));
		}
		
		
		if(e.getSource()==cotg)
		{
			a=Double.parseDouble(t.getText());
			operator=8;
			t.setText("cotg("+a+") = "+1/src.Calculators.ScientificCalculator.Tan(a));
		}
		
		
		
		
		
		if(e.getSource()==asin)
		{
			a=Double.parseDouble(t.getText());
			t.setText("asin("+a+") = "+src.Calculators.ScientificCalculator.Asin(a));
		}
		
		
		if(e.getSource()==acos)
		{
			a=Double.parseDouble(t.getText());
			t.setText("acos("+a+") = "+src.Calculators.ScientificCalculator.Acos(a));
		}
		
		
		if(e.getSource()==atg)
		{
			a=Double.parseDouble(t.getText());
			operator=7;
			t.setText("atg("+a+") = "+src.Calculators.ScientificCalculator.Atan(a));
		}
		
		
		if(e.getSource()==acotg)
		{
			a=Double.parseDouble(t.getText());
			operator=8;
			t.setText("acotg("+a+") = "+1/src.Calculators.ScientificCalculator.Atan(a));
		}
		
		
		
		
		
		
		if(e.getSource()==sinh)
		{
			a=Double.parseDouble(t.getText());
			t.setText("sinh("+a+") = "+src.Calculators.ScientificCalculator.Sinh(a));
		}
		
		
		if(e.getSource()==cosh)
		{
			a=Double.parseDouble(t.getText());
			t.setText("cohs("+a+") = "+src.Calculators.ScientificCalculator.Cosh(a));
		}
		
		
		if(e.getSource()==tgh)
		{
			a=Double.parseDouble(t.getText());
			t.setText("tgh("+a+") = "+src.Calculators.ScientificCalculator.Tanh(a));
		}
		
		
		if(e.getSource()==cotgh)
		{
			a=Double.parseDouble(t.getText());
			t.setText("cotgh("+a+") = "+1/src.Calculators.ScientificCalculator.Tanh(a));
		}
		
		
		
		
		
		if(e.getSource()==ln)
		{
			a=Double.parseDouble(t.getText());
			t.setText("ln"+a+" = "+src.Calculators.ScientificCalculator.Ln(a));
		}
		
		if(e.getSource()==log)
		{
			a=Double.parseDouble(t.getText());
			t.setText("log"+a+" = "+src.Calculators.ScientificCalculator.Log(a));
		}
		
		if(e.getSource()==TenX)
		{
			a=Double.parseDouble(t.getText());
			t.setText("10*("+a+") = "+src.Calculators.ScientificCalculator.TenToPower(a));
		}
		
		if(e.getSource()==XY)
		{
			a=Double.parseDouble(t.getText());
			t.setText(a+"x("+a+") = "+src.Calculators.ScientificCalculator.NumberToAnotherNumberPower(a, b));
		}
		
		
		
		
		
		if(e.getSource()==kor)
		{
			a=Double.parseDouble(t.getText());
			t.setText(""+Math.sqrt(a));
		}
		
		
		if(e.getSource()==xx)
		{
			a=Double.parseDouble(t.getText());
			t.setText(""+a*a);
		}
		
		
		if(e.getSource()==pm)
		{
			a=Double.parseDouble(t.getText());
			t.setText(""+-a);
		}
		
		
		
		
		
		if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());
		
			switch(operator)
			{
				case 1: result = src.Calculators.StandardCalculator.sum(a,b); //+

					break;
		
				case 2: result = src.Calculators.StandardCalculator.diff(a,b); //-

					break;
		
				case 3: result = src.Calculators.StandardCalculator.multi(a,b); //*

					break;
		
				case 4: result = src.Calculators.StandardCalculator.dev(a,b); // /

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
