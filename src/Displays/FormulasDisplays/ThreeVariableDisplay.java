package FormulasDisplays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ThreeVariableDisplay 
{
	public static JFrame frame = new JFrame();
	
	public static JTextField VarA,VarB,VarC,result;
	
	public static JButton equal;
	
	
	public static JMenuBar bar;
	
	public static JMenu CalcMenu,ChF,MaF,PhF;
	
	public static JMenuItem PrCalc,StCalc,ScCalc; //Calculators
	
	public static JMenuItem sumofNEl1,sumofNEl2,sumofNElGeo,cosTh,med,trAe2,trAe3,trpAe,prlgAe2; //Math Formulas
	
	
	
	public static void run()
	{
		frame.setTitle("Math Formulas - Factoriel");
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
		
		
		
		JMenu ChF = new JMenu("Chemistry Formulas");
		menuBar.add(ChF);	
		
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
		menuBar.add(MaF);
		
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
		menuBar.add(PhF);
		
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
		menuBar.add(CustF);
	
		JMenuItem CF = new JMenuItem("Custom Formula");
		
		CustF.add(CF);
		
		
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.factoriel();
			}
			});
		
		perm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.permutation();
			}
			});
		
		comb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.combination();
			}
			});
		
		proba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.probability();
			}
			});
		
		sinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.sinTheorem();
			}
			});
		
		trAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.trArea();
			}
			});
		
		prlgAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.prlgArea();
			}
			});
		
		sumofNEl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.sumE1();
			}
			});
		
		sumofNEl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.sumE2();
			}
			});
		
		sumofNElGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.sumG();
			}
			});
		
		cosTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.cosTh();
			}
			});
		
		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.med();
			}
			});//sumofNEl1,sumofNEl2,sumofNElGeo,cosTh,med,trAe2,trAe3,trpAe,prlgAe2
		
		trAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.trAe2();
			}
			});
		
		trAe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.trAe3();
			}
			});
		
		trpAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.trPAe();
			}
			});
		
		prlgAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.ThreeVariableDisplay.prlgAe2();
			}
			}); // Formulas.FourVariableDisplay.trAe4();	
		
		trAe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.FourVariableDisplay.trAe4();
			}
			});
		
		
		
		
		
		
		
		Cm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.CM();
			}
			});
		
		nCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.nCM();
			}
			});
		
		vCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.vCM();
			}
			});
		
		Dns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.DNs();
			}
			});
		
		mDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.mDNs();
			}
			});
		
		vDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.vDNs();
			}
			});
		
		Vm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.VM();
			}
			});
		
		vVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.vVM();
			}
			});
		
		nVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.nVM();
			}
			});
		
		Mm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.MM();
			}
			});
		
		mMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.mMM();
			}
			});
		
		nMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.nMM();
			}
			});		
		
		
		
		
		
		
		
		sVt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.sVT();
			}
			});
		
		vSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.vST();
			}
			});
		
		tSv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.tSV();
			}
			});
		
		iUr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.iUR();
			}
			});

		
		uIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.uIR();
			}
			});
		
		rUi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.TwoVariableDisplay.rUI();
			}
			});
		
		ainst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.E1();
			}
			});
		kvE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.E2();
			}
			});
		
		mEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.m();
			}
			});
		
		vEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				FormulasDisplays.OneVariableDisplay.v();
			}
			});
		
		
		
		CF.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent event) 
            {
            	frame.dispose();
            	FormulasDisplays.CustomFormulaDisplay.idk();
            }
        });
		
		
		
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();
				
				frame.add(new CalculatorDisplays.StandCalcDisplay());
				
				
				
			}
			});
		
		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();

				frame.add(new CalculatorDisplays.ProgrammingCalcDisplay());
			}
			});
		
		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				frame.dispose();

				frame.add(new CalculatorDisplays.ScientificCalcDisplay());
			}
			});
		
		
		VarA = new JTextField("");
		VarB = new JTextField("");
		VarC = new JTextField("");
		result = new JTextField("");
		equal = new JButton("=");
		
		
		VarA.setBounds(40, 40, 500, 50);
		VarB.setBounds(40, 100, 500, 50);
		VarC.setBounds(40, 160, 500, 50);
		equal.setBounds(200, 230, 150, 80);
		result.setBounds(40, 310, 500, 50);
		
		
		frame.add(VarA);
		frame.add(VarB);
		frame.add(VarC);
		frame.add(equal);
		frame.add(result);
		
		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	//sumofNEl1,sumofNEl2,sumofNElGeo,cosTh,med,trAe2,trAe3,trAe4,trpAe,prlgAe2;
	
	public static void sumE1()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.sumOfFirstNElementsArithmethicSeries(a, b, c));
			}
			});
	}
	
	public static void sumE2()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.sumOfFirstNElementsArithmethicSeriesOption2(a, b, c));
			}
			});
	}
	
	public static void sumG()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.sumOfFirstNElementsGeometricSeries(a, b, c));
			}
			});
	}
	
	public static void cosTh()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				double c = Double.parseDouble(VarC.getText());
				result.setText(""+Formulas.MathFormulas.cosineTheorem(a, b, c));
			}
			});
	}
	
	public static void med()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				double c = Double.parseDouble(VarC.getText());
				result.setText(""+Formulas.MathFormulas.formulaForMedian(a, b, c));
			}
			});
	}
	
	public static void trAe2()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.triangleArea(a, b, c));
			}
			});
	}
	
	public static void trAe3()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				double c = Double.parseDouble(VarC.getText());
				result.setText(""+Formulas.MathFormulas.triangleArea(a, b, c));
			}
			});
	}
	
	public static void trPAe()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				int a = Integer.parseInt(VarA.getText());
				int b = Integer.parseInt(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.trapezoidArea(a, b, c));
			}
			});
	}
	
	public static void prlgAe2()
	{
		run();
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				result.setText("");
				int a = Integer.parseInt(VarA.getText());
				int b = Integer.parseInt(VarB.getText());
				int c = Integer.parseInt(VarC.getText());
				result.setText(""+Formulas.MathFormulas.paralelogramArea(a, b, c));
			}
			});
	}
	
}
