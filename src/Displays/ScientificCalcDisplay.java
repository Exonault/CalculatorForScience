import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ScientificCalcDisplay 
{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,
	bmul,bsub,badd,bdec,beq,bdel,bclr,sin,cos,ln
	,log,TenX,XY,tg,cotg,sinh,cosh,tgh,cotgh,asin
	,acos,atg,actg,pm,kor,xx;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	
	
	ScientificCalcDisplay()
	{

		f = new JFrame("Scientific Calculator");
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
		ln = new JButton("Ln");
		log = new JButton("Log");
		TenX = new JButton("10(x)");
		XY = new JButton("X(y)");
		tg = new JButton("Tg");
		cotg = new JButton("Cotg");
		sinh = new JButton("SinH");
		cosh = new JButton("CosH");
		tgh = new JButton("TgH");
		cotgh = new JButton("CotgH");
		asin = new JButton("ASin");
		acos = new JButton("ACos");
		atg = new JButton("ATg");
		actg = new JButton("ACotg");
		xx = new JButton("x*x");
		pm = new JButton("√");
		kor = new JButton("±");
		
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
		ln.setBounds(220,100,80,40);
		log.setBounds(310,100,80,40);
		TenX.setBounds(400,100,80,40);
		XY.setBounds(490,100,80,40);
		tg.setBounds(40,150,80,40);
		cotg.setBounds(130,150,80,40);
		sinh.setBounds(40,200,80,40);
		cosh.setBounds(130,200,80,40);
		tgh.setBounds(40,250,80,40);
		cotgh.setBounds(130,250,80,40);
		asin.setBounds(40,300,80,40);
		acos.setBounds(130,300,80,40);
		atg.setBounds(40,350,80,40);
		actg.setBounds(130,350,80,40);
	
		
		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bdel);
		f.add(bclr);
		f.add(sin);
		f.add(cos);
		f.add(ln);
		f.add(log);
		f.add(TenX);
		f.add(XY);
		f.add(tg);
		f.add(cotg);
		f.add(sinh);
		f.add(cosh);
		f.add(tgh);
		f.add(cotgh);
		f.add(asin);
		f.add(acos);
		f.add(atg);
		f.add(actg);
		f.add(pm);
		f.add(xx);
		f.add(kor);
		
		
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
		f.setSize(620, 450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);

		
	}
	
	public static void main(String[] args)
	{
		new ScientificCalcDisplay();
	}
	
}
