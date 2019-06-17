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

import CalculatorDisplays.ProgrammingCalcDisplay;
import CalculatorDisplays.ScientificCalcDisplay;
import CalculatorDisplays.StandCalcDisplay;

public class TwoVariableDisplay {
	// Predefinirane na frame-a, bytona za vikane na resultata, menu-bara, itemite
	// na menuto, i samoto menu
	public static JFrame frame = new JFrame();

	// Predefinirane na text-fieldovete za chislata i resultata
	public static JTextField VarA, VarB, result;

	public static JButton equal;

	public static JMenuBar bar;

	public static JMenu CalcMenu, ChF, MaF, PhF;

	public static JMenuItem PrCalc, StCalc, ScCalc; // Calculators

	public static JMenuItem var, comb, proba, sinTh, trAe, prlgAe; // Math Formulas

	public static JMenuItem Cm, nCm, vCm, Dns, mDns, vDns, Vm, vVm, nVm, Mm, mMm, nMm; // Chemistry Formulas

	public static JMenuItem sVt, vSt, tSv, iUr, uIr, rUi; // PhysicalFormulas

	public static void run() {
		// Zadavane stoinosti na frame-a
		frame.setTitle("Math Formulas - Factoriel");
		frame.setBounds(0, 0, 600, 480);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// Zadavane na menu-bar-a
		bar = new JMenuBar();
		frame.setJMenuBar(bar);
		CalcMenu = new JMenu("Calculators");
		bar.add(CalcMenu);

		// Definirane na Menu-itemite
		PrCalc = new JMenuItem("Programming Calculator");
		CalcMenu.add(PrCalc);
		ScCalc = new JMenuItem("Scientific Calculator");
		CalcMenu.add(ScCalc);
		StCalc = new JMenuItem("Standart Calculator");
		CalcMenu.add(StCalc);

		// Dobavqne na dopalnitelnite Menu-ta
		JMenu ChF = new JMenu("Chemistry Formulas");
		bar.add(ChF);

		JMenu MaF = new JMenu("Math Formulas");
		bar.add(MaF);

		JMenu PhF = new JMenu("Physics Formulas");
		bar.add(PhF);

		JMenu CustF = new JMenu("Custom Formulas");
		bar.add(CustF);

		// Zadavane na menu-itemite na Himicheskite formuli i dobavqne kym menuto
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

		// Zadavane na menu-itemite na matematicheskite formuli i dobavqne kym menuto
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

		// Zadavane na menu-itemite na fizichnite formuli i dobavqne kym menuto
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

		// Zadavane na custom-formulata i dobavqne kym menuto
		JMenuItem CF = new JMenuItem("Custom Formula");

		CustF.add(CF);

		// Zadavane na funkcii na menu-itemite pri tqhnoto natiskane

		// Matematika
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.factoriel(); // Vikane na saotvetnata funkciq
			}
		});

		perm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose();// Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.permutation(); // Vikane na saotvetnata funkci
			}
		});

		var.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose();// Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.variable(); // Vikane na saotvetnata funkci
			}
		});

		comb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.combination(); // Vikane na saotvetnata funkci
			}
		});

		proba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.probability(); // Vikane na saotvetnata funkci
			}
		});

		sinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sinTheorem(); // Vikane na saotvetnata funkci
			}
		});

		trAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.trArea(); // Vikane na saotvetnata funkci
			}
		});

		prlgAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.prlgArea(); // Vikane na saotvetnata funkci
			}
		});

		sumofNEl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE1(); // Vikane na saotvetnata funkci
			}
		});

		sumofNEl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE2(); // Vikane na saotvetnata funkci
			}
		});

		sumofNElGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumG(); // Vikane na saotvetnata funkci
			}
		});

		cosTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.cosTh(); // Vikane na saotvetnata funkci
			}
		});

		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.med(); // Vikane na saotvetnata funkci
			}
		});

		trAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe2(); // Vikane na saotvetnata funkci
			}
		});

		trAe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe3(); // Vikane na saotvetnata funkci
			}
		});

		trpAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trPAe(); // Vikane na saotvetnata funkci
			}
		});

		prlgAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.prlgAe2(); // Vikane na saotvetnata funkci
			}
		});

		trAe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.FourVariableDisplay.trAe4(); // Vikane na saotvetnata funkci
			}
		});

		// Himiq
		Cm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.CM(); // Vikane na saotvetnata funkci
			}
		});

		nCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nCM(); // Vikane na saotvetnata funkci
			}
		});

		vCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vCM(); // Vikane na saotvetnata funkci
			}
		});

		Dns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.DNs(); // Vikane na saotvetnata funkci
			}
		});

		mDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mDNs(); // Vikane na saotvetnata funkci
			}
		});

		vDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vDNs(); // Vikane na saotvetnata funkci
			}
		});

		Vm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.VM(); // Vikane na saotvetnata funkci
			}
		});

		vVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vVM(); // Vikane na saotvetnata funkci
			}
		});

		nVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nVM(); // Vikane na saotvetnata funkci
			}
		});

		Mm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.MM(); // Vikane na saotvetnata funkci
			}
		});

		mMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mMM(); // Vikane na saotvetnata funkci
			}
		});

		nMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nMM(); // Vikane na saotvetnata funkci
			}
		});

		// Fizika
		sVt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sVT(); // Vikane na saotvetnata funkci
			}
		});

		vSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vST(); // Vikane na saotvetnata funkci
			}
		});

		tSv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.tSV(); // Vikane na saotvetnata funkci
			}
		});

		iUr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.iUR(); // Vikane na saotvetnata funkci
			}
		});

		uIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.uIR(); // Vikane na saotvetnata funkci
			}
		});

		rUi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.rUI(); // Vikane na saotvetnata funkci
			}
		});

		ainst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E1(); // Vikane na saotvetnata funkci
			}
		});
		kvE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E2(); // Vikane na saotvetnata funkci
			}
		});

		mEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.m(); // Vikane na saotvetnata funkci
			}
		});

		vEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.v(); // Vikane na saotvetnata funkci
			}
		});

		CF.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a
				FormulasDisplays.CustomFormulaDisplay.idk(); // Vikane na saotvetnata funkci
			}
		});

		// Kalkulatori
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a

				frame.add(new StandCalcDisplay()); // Vikane na kalkulatora
			}
		});

		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a

				frame.add(new ProgrammingCalcDisplay()); // Vikane na kalkulatora
			}
		});

		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose(); // Zatvarqna na frame-a

				frame.add(new ScientificCalcDisplay()); // Vikane na kalkulatora
			}
		});

		// Zadavane funkcii na text-fieldovete i bytona
		VarA = new JTextField("");
		VarB = new JTextField("");
		result = new JTextField("");
		equal = new JButton("=");

		// Zadavane na tehnite pozicii
		VarA.setBounds(40, 40, 500, 50);
		VarB.setBounds(40, 100, 500, 50);
		equal.setBounds(200, 180, 150, 80);
		result.setBounds(40, 300, 500, 50);

		// Dobavqne na bytona i text-fieldovete kam frame-a
		frame.add(VarA);
		frame.add(VarB);
		frame.add(equal);
		frame.add(result);

		// Dopalnitelni funkcii na frame-a
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void variable() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("n");
		VarB.setText("k");
		// Zadavane ime na formulata za resultata
		result.setText("n!/(n-k)!");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				int a = Integer.parseInt(VarA.getText());
				int b = Integer.parseInt(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.variations(b, a));
			}
		});
	}

	public static void combination() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("n");
		VarB.setText("k");
		// Zadavane ime na formulata za resultata
		result.setText("n! / (n-k)! * k!");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				int a = Integer.parseInt(VarA.getText());
				int b = Integer.parseInt(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.combinations(b, a));
			}
		});
	}

	public static void probability() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("n");
		VarB.setText("A");
		// Zadavane ime na formulata za resultata
		result.setText("P = n/A");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.probability(b, a));
			}
		});
	}

	public static void sinTheorem() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("A");
		VarB.setText("sinA");
		// Zadavane ime na formulata za resultata
		result.setText("Result = A/sinA");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.sineTheorem(a, b));
			}
		});
	}

	public static void trArea() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("c");
		VarB.setText("Hc");
		// Zadavane ime na formulata za resultata
		result.setText("S = c*Hc / 2");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.triangleArea(a, b));
			}
		});
	}

	public static void prlgArea() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("c");
		VarB.setText("Hc");
		// Zadavane ime na formulata za resultata
		result.setText("S = c*Hc");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.MathFormulas.paralelogramArea(a, b));
			}
		});
	}

	public static void CM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("n");
		VarB.setText("v");
		// Zadavane ime na formulata za resultata
		result.setText("Cm = n/v [mol/l]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.molarConcentration(a, b));
			}
		});
	}

	public static void nCM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("Cm");
		VarB.setText("v");
		// Zadavane ime na formulata za resultata
		result.setText("n = Cm*v [mol]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.nByMolarConcentration(a, b));
			}
		});
	}

	public static void vCM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("n");
		VarB.setText("Cm");
		// Zadavane ime na formulata za resultata
		result.setText("V = n*Cm [l]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.vBymolarConcentration(a, b));
			}
		});
	}

	public static void DNs() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("m");
		VarB.setText("v");
		// Zadavane ime na formulata za resultata
		result.setText("p = m/v [kg/l]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.density(a, b));
			}
		});
	}

	public static void mDNs() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("p");
		VarB.setText("v");
		// Zadavane ime na formulata za resultata
		result.setText("m = p*v [kg]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.mByDensity(a, b));
			}
		});
	}

	public static void vDNs() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("m");
		VarB.setText("p");
		// Zadavane ime na formulata za resultata
		result.setText("v = m/p [l]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.vByDensity(a, b));
			}
		});
	}

	public static void VM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("v");
		VarB.setText("n");
		// Zadavane ime na formulata za resultata
		result.setText("Vm = v/n [l/mol]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.molarVolume(a, b));
			}
		});
	}

	public static void vVM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("Vm");
		VarB.setText("n");
		// Zadavane ime na formulata za resultata
		result.setText("v = Vm*n [l]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.vBymolarVolume(a, b));
			}
		});
	}

	public static void nVM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("v");
		VarB.setText("Vm");
		// Zadavane ime na formulata za resultata
		result.setText("n = v/Vm [mol]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.nBymolarVolume(a, b));
			}
		});
	}

	public static void MM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("m");
		VarB.setText("n");
		// Zadavane ime na formulata za resultata
		result.setText("M = m/n [kg/mol]");
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.molarMass(a, b));
			}
		});
	}

	public static void mMM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("M");
		VarB.setText("n");
		// Zadavane ime na formulata za resultata
		result.setText("m = M*n [kg]");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.mByMolarMass(a, b));
			}
		});
	}

	public static void nMM() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("m");
		VarB.setText("M");
		// Zadavane ime na formulata za resultata
		result.setText("n = m/M [mol]");
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.ChemistryFormula.nByMolarMass(a, b));
			}
		});
	}

	public static void sVT() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("V");
		VarB.setText("t");
		// Zadavane ime na formulata za resultata
		result.setText("S = V*t");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.S(a, b));
			}
		});
	}

	public static void vST() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("S");
		VarB.setText("t");
		// Zadavane ime na formulata za resultata
		result.setText("V = S/t");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.V(a, b));
			}
		});
	}

	public static void tSV() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("S");
		VarB.setText("V");
		// Zadavane ime na formulata za resultata
		result.setText("t = S/V");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.t(a, b));
			}
		});
	}

	public static void iUR() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("U");
		VarB.setText("R");
		// Zadavane ime na formulata za resultata
		result.setText("I = U/R");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.I(a, b));
			}
		});
	}

	public static void uIR() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("I");
		VarB.setText("R");
		// Zadavane ime na formulata za resultata
		result.setText("U = I*R");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.U(a, b));
			}
		});
	}

	public static void rUI() {
		// Vikane na run-a (Celiqt kod za frame-a gore)
		run();
		// Zadavane ime na nyjnite chisla
		VarA.setText("U");
		VarB.setText("I");
		// Zadavane ime na formulata za resultata
		result.setText("R = U/I");
		// Pri natiskane na bytona:
		equal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				// Zadavane na promenlivi A i B sas stoinosti na text-fieldovete
				double a = Double.parseDouble(VarA.getText());
				double b = Double.parseDouble(VarB.getText());
				// Vikane na nyjnata funkciq i zadavane na resultata
				result.setText("" + Formulas.PhysicalFormulas.R(a, b));
			}
		});
	}

}
