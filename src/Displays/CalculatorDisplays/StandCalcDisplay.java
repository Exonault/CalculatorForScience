package CalculatorDisplays;


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
	
	public StandCalcDisplay()
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
		
		JMenu ChF = new JMenu("Chemistry Formulas");
		bar.add(ChF);	
		
		JMenuItem Cm = new JMenuItem("Cm=n/v [mol/l]n");
		ChF.add(Cm);
		JMenuItem nCm = new JMenuItem("n=Cm*v [mol]");
		ChF.add(nCm);
		JMenuItem vCm = new JMenuItem("v=n/Cm [l]");
		ChF.add(vCm);
        
		
		
		JMenuItem Dns = new JMenuItem("p=m/v [kg/l]");
		ChF.add(Dns);
		JMenuItem mDns = new JMenuItem("m=p*v [kg]");
		ChF.add(mDns);
		JMenuItem vDns = new JMenuItem("v=p [l]");
		ChF.add(vDns);
		
		
		
		JMenuItem Vm = new JMenuItem("Vm=v/n [l/mol]");
		ChF.add(Vm);
		JMenuItem vVm = new JMenuItem("v=Vm*n [l]");
		ChF.add(vVm);
		JMenuItem nVm = new JMenuItem("n=v/Vm [mol]");
		ChF.add(nVm);
		
		JMenuItem Mm = new JMenuItem("M=m/n[g/mol]");
		ChF.add(Mm);
		JMenuItem mMm = new JMenuItem("m=M/n[g/mol]");
		ChF.add(mMm);
		JMenuItem nMm = new JMenuItem("n=m/M[g/mol]");
		ChF.add(nMm);
		
		
		
		
		JMenu MaF = new JMenu("Math Formulas");
		bar.add(MaF);
		
		
		JMenuItem fact = new JMenuItem("Factoriel");
		MaF.add(fact);
		
		JMenuItem perm = new JMenuItem("Permutations");
		MaF.add(perm);
		
		JMenuItem var = new JMenuItem("Variations");
		MaF.add(var);
		
		JMenuItem comb = new JMenuItem("Combinations");
		MaF.add(comb);
		
		JMenuItem proba = new JMenuItem("Probability");
		MaF.add(proba);
		
		JMenuItem sumofNEl1 = new JMenuItem("((a1 + an) / 2) * n");
		MaF.add(sumofNEl1);
		
		JMenuItem sumofNEl2 = new JMenuItem("(((2 * a1) + ((n - 1) * d)) / 2) * n");
		MaF.add(sumofNEl2);
		
		JMenuItem sumofNElGeo = new JMenuItem("Sum of first N elements geometric series");
		MaF.add(sumofNElGeo);
		
		JMenuItem sinTh = new JMenuItem("Sine theorem");
		MaF.add(sinTh);
		
		JMenuItem cosTh = new JMenuItem("Cosine theorem");
		MaF.add(cosTh);
		
		JMenuItem med = new JMenuItem("Median");
		MaF.add(med);
		
		JMenuItem trAe = new JMenuItem("Triangle area (c, hc)");
		MaF.add(trAe);
		
		JMenuItem trAe2 = new JMenuItem("Triangle area (b, c, sinA)");
		MaF.add(trAe2);
		
		JMenuItem trAe3 = new JMenuItem("Triangle area (a, b, c)");
		MaF.add(trAe3);
		
		JMenuItem trAe4 = new JMenuItem("Triangle area (a, b, c, R)");
		MaF.add(trAe4);
		
		JMenuItem trpAe = new JMenuItem("Trapezoid area");
		MaF.add(trpAe);
		
		JMenuItem prlgAe = new JMenuItem("Paralelogram area (a, ha)");
		MaF.add(prlgAe);
		
		JMenuItem prlgAe2 = new JMenuItem("Paralelogram area (b, c, sinA)");
		MaF.add(prlgAe2);
		
		
		
		
		
		
		
		JMenu PhF = new JMenu("Physics Formulas");
		bar.add(PhF);
		
		JMenuItem sVt = new JMenuItem("S=V*t");
		PhF.add(sVt);
		
		JMenuItem vSt = new JMenuItem("V=S*t");
		PhF.add(vSt);
		
		JMenuItem tSv = new JMenuItem("t=S/V");
		PhF.add(tSv);
		
		JMenuItem iUr = new JMenuItem("I=U/R");
		PhF.add(iUr);
		
		JMenuItem uIr = new JMenuItem("U=I*R");
		PhF.add(uIr);
		
		JMenuItem rUi = new JMenuItem("R=U/I");
		PhF.add(rUi);
		
		JMenuItem ainst = new JMenuItem("E=m*c*c");
		PhF.add(ainst);
		
		JMenuItem kvE = new JMenuItem("E=v*h");
		PhF.add(kvE);
		
		JMenuItem mEn = new JMenuItem("m=E/c*c");
		PhF.add(mEn);
		
		JMenuItem vEn = new JMenuItem("v=E/h");
		PhF.add(vEn);
		
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.factoriel();
			}
			});
		
		perm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.permutation();
			}
			});
		
		comb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.combination();
			}
			});
		
		proba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.probability();
			}
			});
		
		sinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.sinTheorem();
			}
			});
		
		trAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.trArea();
			}
			});
		
		prlgAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.prlgArea();
			}
			});
		
		sumofNEl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.sumE1();
			}
			});
		
		sumofNEl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.sumE2();
			}
			});
		
		sumofNElGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.sumG();
			}
			});
		
		cosTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.cosTh();
			}
			});
		
		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.med();
			}
			});//sumofNEl1,sumofNEl2,sumofNElGeo,cosTh,med,trAe2,trAe3,trpAe,prlgAe2
		
		trAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.trAe2();
			}
			});
		
		trAe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.trAe3();
			}
			});
		
		trpAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.trPAe();
			}
			});
		
		prlgAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.ThreeVariableDisplay.prlgAe2();
			}
			}); // Formulas.FourVariableDisplay.trAe4();	
		
		trAe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.FourVariableDisplay.trAe4();
			}
			});
		
		
		
		
		
		
		
		Cm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.CM();
			}
			});
		
		nCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.nCM();
			}
			});
		
		vCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.vCM();
			}
			});
		
		Dns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.DNs();
			}
			});
		
		mDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.mDNs();
			}
			});
		
		vDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.vDNs();
			}
			});
		
		Vm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.VM();
			}
			});
		
		vVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.vVM();
			}
			});
		
		nVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.nVM();
			}
			});
		
		Mm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.MM();
			}
			});
		
		mMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.mMM();
			}
			});
		
		nMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.nMM();
			}
			});		
		
		
		
		
		
		
		
		sVt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.sVT();
			}
			});
		
		vSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.vST();
			}
			});
		
		tSv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.tSV();
			}
			});
		
		iUr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.iUR();
			}
			});

		
		uIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.uIR();
			}
			});
		
		rUi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.TwoVariableDisplay.rUI();
			}
			});
		
		ainst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.E1();
			}
			});
		kvE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.E2();
			}
			});
		
		mEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.m();
			}
			});
		
		vEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();
				FormulasDisplays.OneVariableDisplay.v();
			}
			});
		
		
		
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
				case 1: result = Calculators.StandardCalculator.sum(a,b);

					break;
		
				case 2: result = Calculators.StandardCalculator.diff(a,b);

					break;
		
				case 3: result = Calculators.StandardCalculator.multi(a,b);

					break;
		
				case 4: result = Calculators.StandardCalculator.dev(a,b);

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
