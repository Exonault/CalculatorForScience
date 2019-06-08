package CalculatorDisplays;


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
	public ProgrammingCalcDisplay()
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
		
		
		JMenu CustF = new JMenu("Custom Formulas");
		bar.add(CustF);
	
		JMenuItem CF = new JMenuItem("Custom Formula");
		
		CustF.add(CF);
		
		
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
		
		
		CF.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) 
            {
            	dispose();
            	FormulasDisplays.CustomFormulaDisplay.idk();
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
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 2));
		} 
		
		if(e.getSource()==bd)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 2));
		} 
		
		if(e.getSource()==bh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 2));
		} 
		
		
		
		
		if(e.getSource()==ob)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 8));
		} 
		
		if(e.getSource()==od)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 8));
		} 
		
		if(e.getSource()==oh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 8));
		} 
		
		
		
		
		if(e.getSource()==db)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 10));
		} 
		
		if(e.getSource()==doo)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 10));
		} 
		
		if(e.getSource()==dh)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 10));
		} 
		
		
		
		
		if(e.getSource()==hb)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 16));
		} 
		
		if(e.getSource()==ho)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 16));
		} 
		
		if(e.getSource()==hd)
		{
			a=Integer.parseInt(t.getText());
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 16));
		} 
	}

}
