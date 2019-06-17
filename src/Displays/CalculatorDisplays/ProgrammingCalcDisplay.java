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
	// Predefinirane na text-fielda. bytonite, menu-bara, itemite na menuto, samoto
	// menu
	JTextField t;
	JButton bo,bd,bh,ob,od,oh,db,doo,dh,hb,ho,hd;
	JMenuBar bar;
	JMenuItem PrCalc,StCalc,ScCalc;
	JMenu CalcMenu;
	
	// Definirane na promenliva za chislata
	static int a=0;
	public ProgrammingCalcDisplay()
	{
		// Zadavane na imena na bytonite
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
		
		
		//Zadavane na tehnite pozicii
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
		
		
		//Dobavqna na bytonite kam frame-a
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
		
		
		//Zadavane na menu-bar-a
		bar = new JMenuBar();
		setJMenuBar(bar);
		CalcMenu = new JMenu("Calculators");
		bar.add(CalcMenu);	
		
		//Definirane na Menu-itemite
		PrCalc = new JMenuItem("Programming Calculator");
		CalcMenu.add(PrCalc);
		ScCalc = new JMenuItem("Scientific Calculator");
		CalcMenu.add(ScCalc);
		StCalc = new JMenuItem("Standart Calculator");
		CalcMenu.add(StCalc);
		
		//Dobavqne na dopalnitelnite Menu-ta
		JMenu ChF = new JMenu("Chemistry Formulas");
		bar.add(ChF);	
		
		JMenu MaF = new JMenu("Math Formulas");
		bar.add(MaF);
		
		JMenu PhF = new JMenu("Physics Formulas");
		bar.add(PhF);
		
		JMenu CustF = new JMenu("Custom Formulas");
		bar.add(CustF);
		
		
		
		//Zadavane na menu-itemite na Himicheskite formuli i dobavqne kym menuto
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
		
		
		
		//Zadavane na menu-itemite na matematicheskite formuli i dobavqne kym menuto
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
		
		

		//Zadavane na menu-itemite na fizichnite formuli i dobavqne kym menuto
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
		
		
	
		//Zadavane na custom-formulata i dobavqne kym menuto
		JMenuItem CF = new JMenuItem("Custom Formula");
		
		CustF.add(CF);
		
		
		
		
		//Zadavane na funkcii na menu-itemite pri tqhnoto natiskane
		
		//Matematika
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.factoriel(); //Vikane na saotvetnata funkciq 
			}
			});
		
		perm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();//Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.permutation(); //Vikane na saotvetnata funkci
			}
			});
		
		var.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose();//Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.variable(); //Vikane na saotvetnata funkci
			}
			});
		
		comb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.combination(); //Vikane na saotvetnata funkci
			}
			});
		
		proba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.probability(); //Vikane na saotvetnata funkci
			}
			});
		
		sinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sinTheorem(); //Vikane na saotvetnata funkci
			}
			});
		
		trAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.trArea(); //Vikane na saotvetnata funkci
			}
			});
		
		prlgAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.prlgArea(); //Vikane na saotvetnata funkci
			}
			});
		
		sumofNEl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE1(); //Vikane na saotvetnata funkci
			}
			});
		
		sumofNEl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE2(); //Vikane na saotvetnata funkci
			}
			});
		
		sumofNElGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumG(); //Vikane na saotvetnata funkci
			}
			});
		
		cosTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.cosTh(); //Vikane na saotvetnata funkci
			}
			});
		
		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.med(); //Vikane na saotvetnata funkci
			}
			});
		
		trAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe2(); //Vikane na saotvetnata funkci
			}
			});
		
		trAe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe3(); //Vikane na saotvetnata funkci
			}
			});
		
		trpAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trPAe(); //Vikane na saotvetnata funkci
			}
			});
		
		prlgAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.prlgAe2(); //Vikane na saotvetnata funkci
			}
			});
		
		trAe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.FourVariableDisplay.trAe4(); //Vikane na saotvetnata funkci
			}
			});
		

		//Himiq
		Cm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.CM(); //Vikane na saotvetnata funkci
			}
			});
		
		nCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nCM(); //Vikane na saotvetnata funkci
			}
			});
		
		vCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vCM(); //Vikane na saotvetnata funkci
			}
			});
		
		Dns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.DNs(); //Vikane na saotvetnata funkci
			}
			});
		
		mDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mDNs(); //Vikane na saotvetnata funkci
			}
			});
		
		vDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vDNs(); //Vikane na saotvetnata funkci
			}
			});
		
		Vm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.VM(); //Vikane na saotvetnata funkci
			}
			});
		
		vVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vVM(); //Vikane na saotvetnata funkci
			}
			});
		
		nVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nVM(); //Vikane na saotvetnata funkci
			}
			});
		
		Mm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.MM(); //Vikane na saotvetnata funkci
			}
			});
		
		mMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mMM(); //Vikane na saotvetnata funkci
			}
			});
		
		nMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nMM(); //Vikane na saotvetnata funkci
			}
			});	
		
		
		//Fizika
		sVt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sVT(); //Vikane na saotvetnata funkci
			}
			});
		
		vSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vST(); //Vikane na saotvetnata funkci
			}
			});
		
		tSv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.tSV(); //Vikane na saotvetnata funkci
			}
			});
		
		iUr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.iUR(); //Vikane na saotvetnata funkci
			}
			});

		
		uIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.uIR(); //Vikane na saotvetnata funkci
			}
			});
		
		rUi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.rUI(); //Vikane na saotvetnata funkci
			}
			});
		
		ainst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E1(); //Vikane na saotvetnata funkci
			}
			});
		kvE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E2(); //Vikane na saotvetnata funkci
			}
			});
		
		mEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.m(); //Vikane na saotvetnata funkci
			}
			});
		
		vEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.v(); //Vikane na saotvetnata funkci
			}
			});
		
		CF.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) 
            {
            	dispose(); //Zatvarqna na frame-a
            	FormulasDisplays.CustomFormulaDisplay.idk(); //Vikane na saotvetnata funkci
            }
        });
		
		
		//Kalkulatori
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a

				add(new StandCalcDisplay()); //Vikane na kalkulatora
			}
			});
		
		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a

				add(new ProgrammingCalcDisplay()); //Vikane na kalkulatora
			}
			});
		
		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				dispose(); //Zatvarqna na frame-a

				add(new ScientificCalcDisplay()); //Vikane na kalkulatora
			}
			});
		
		
		//Zadavane funckii na frame-a
		setLayout(null);
		setVisible(true);
		setSize(650, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		
		//Dobavqna na funkcii kam butonite
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
	
	
	
	//Pri natiskane na byton:
	public void actionPerformed(ActionEvent e)
	{
		//Pri natiskane B->O
		if(e.getSource()==bo)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav dvoichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 2));
		} 
		
		//Pri natiskane B->D
		if(e.getSource()==bd)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());			
			//Izvejdane na chilsoto vav desetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 2));
		} 
		
		//Pri natiskane B->H
		if(e.getSource()==bh)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav shestnadesetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 2));
		} 
		
		
		
		//Pri natiskane O->B
		if(e.getSource()==ob)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav dvoichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 8));
		} 
		
		//Pri natiskane O->D
		if(e.getSource()==od)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav desetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 8));
		} 
		
		//Pri natiskane O->H
		if(e.getSource()==oh)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav shestnadesetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 8));
		} 
		
		
		
		//Pri natiskane D->B
		if(e.getSource()==db)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav dvoichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 10));
		} 
		
		//Pri natiskane D->O
		if(e.getSource()==doo)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav osmichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 10));
		} 
		
		//Pri natiskane D->H
		if(e.getSource()==dh)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav shestnadesetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toHexadecimal(a, 10));
		} 
		
		
		
		//Pri natiskane H->B
		if(e.getSource()==hb)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav dvoichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toBinary(a, 16));
		} 
		
		//Pri natiskane H->O
		if(e.getSource()==ho)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav osmichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toOctal(a, 16));
		} 
		
		//Pri natiskane H->D
		if(e.getSource()==hd)
		{
			//Zadavane na stoinost na chisloto a
			a=Integer.parseInt(t.getText());
			//Izvejdane na chilsoto vav desetichna br. sistsema
			t.setText(Calculators.ProgrammingCalculator.toDecimal(a, 16));
		} 
	}

}
