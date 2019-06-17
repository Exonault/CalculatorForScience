package CalculatorDisplays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class StandCalcDisplay extends JFrame implements ActionListener {
	// Predefinirane na text-fielda. bytonite, menu-bara, itemite na menuto, samoto
	// menu
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;
	JMenuBar bar;
	JMenuItem PrCalc, StCalc, ScCalc;
	JMenu CalcMenu;

	// Definirane na promenlivi za kalkulatora
	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	public StandCalcDisplay() {
		// Zadavane na imena na bytonite
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

		// Zadavane na tehnite pozicii
		t.setBounds(30, 40, 280, 30);
		b7.setBounds(30, 100, 50, 40);
		b8.setBounds(100, 100, 50, 40);
		b9.setBounds(170, 100, 50, 40);
		bdiv.setBounds(240, 100, 50, 40);

		b4.setBounds(30, 170, 50, 40);
		b5.setBounds(100, 170, 50, 40);
		b6.setBounds(170, 170, 50, 40);
		bmul.setBounds(240, 170, 50, 40);

		b1.setBounds(30, 240, 50, 40);
		b2.setBounds(100, 240, 50, 40);
		b3.setBounds(170, 240, 50, 40);
		bsub.setBounds(240, 240, 50, 40);

		bdec.setBounds(30, 310, 50, 40);
		b0.setBounds(100, 310, 50, 40);
		beq.setBounds(170, 310, 50, 40);
		badd.setBounds(240, 310, 50, 40);

		bdel.setBounds(55, 380, 100, 40);
		bclr.setBounds(175, 380, 100, 40);

		// Pribavqne na bytonite kym frame-a
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

		// Zadavane na menu-bar-a
		bar = new JMenuBar();
		setJMenuBar(bar);
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
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.factoriel(); // Vikane na saotvetnata funkciq
			}
		});

		perm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();// Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.permutation(); // Vikane na saotvetnata funkci
			}
		});

		var.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();// Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.variable(); // Vikane na saotvetnata funkci
			}
		});

		comb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.combination(); // Vikane na saotvetnata funkci
			}
		});

		proba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.probability(); // Vikane na saotvetnata funkci
			}
		});

		sinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sinTheorem(); // Vikane na saotvetnata funkci
			}
		});

		trAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.trArea(); // Vikane na saotvetnata funkci
			}
		});

		prlgAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.prlgArea(); // Vikane na saotvetnata funkci
			}
		});

		sumofNEl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE1(); // Vikane na saotvetnata funkci
			}
		});

		sumofNEl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumE2(); // Vikane na saotvetnata funkci
			}
		});

		sumofNElGeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.sumG(); // Vikane na saotvetnata funkci
			}
		});

		cosTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.cosTh(); // Vikane na saotvetnata funkci
			}
		});

		med.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.med(); // Vikane na saotvetnata funkci
			}
		});

		trAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe2(); // Vikane na saotvetnata funkci
			}
		});

		trAe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trAe3(); // Vikane na saotvetnata funkci
			}
		});

		trpAe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.trPAe(); // Vikane na saotvetnata funkci
			}
		});

		prlgAe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.ThreeVariableDisplay.prlgAe2(); // Vikane na saotvetnata funkci
			}
		});

		trAe4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.FourVariableDisplay.trAe4(); // Vikane na saotvetnata funkci
			}
		});

		// Himiq
		Cm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.CM(); // Vikane na saotvetnata funkci
			}
		});

		nCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nCM(); // Vikane na saotvetnata funkci
			}
		});

		vCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vCM(); // Vikane na saotvetnata funkci
			}
		});

		Dns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.DNs(); // Vikane na saotvetnata funkci
			}
		});

		mDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mDNs(); // Vikane na saotvetnata funkci
			}
		});

		vDns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vDNs(); // Vikane na saotvetnata funkci
			}
		});

		Vm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.VM(); // Vikane na saotvetnata funkci
			}
		});

		vVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vVM(); // Vikane na saotvetnata funkci
			}
		});

		nVm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nVM(); // Vikane na saotvetnata funkci
			}
		});

		Mm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.MM(); // Vikane na saotvetnata funkci
			}
		});

		mMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.mMM(); // Vikane na saotvetnata funkci
			}
		});

		nMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.nMM(); // Vikane na saotvetnata funkci
			}
		});

		// Fizika
		sVt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.sVT(); // Vikane na saotvetnata funkci
			}
		});

		vSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.vST(); // Vikane na saotvetnata funkci
			}
		});

		tSv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.tSV(); // Vikane na saotvetnata funkci
			}
		});

		iUr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.iUR(); // Vikane na saotvetnata funkci
			}
		});

		uIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.uIR(); // Vikane na saotvetnata funkci
			}
		});

		rUi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.TwoVariableDisplay.rUI(); // Vikane na saotvetnata funkci
			}
		});

		ainst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E1(); // Vikane na saotvetnata funkci
			}
		});
		kvE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.E2(); // Vikane na saotvetnata funkci
			}
		});

		mEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.m(); // Vikane na saotvetnata funkci
			}
		});

		vEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.OneVariableDisplay.v(); // Vikane na saotvetnata funkci
			}
		});

		CF.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a
				FormulasDisplays.CustomFormulaDisplay.idk(); // Vikane na saotvetnata funkci
			}
		});

		// Kalkulatori
		StCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a

				add(new StandCalcDisplay()); // Vikane na kalkulatora
			}
		});

		PrCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a

				add(new ProgrammingCalcDisplay()); // Vikane na kalkulatora
			}
		});

		ScCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose(); // Zatvarqna na frame-a

				add(new ScientificCalcDisplay()); // Vikane na kalkulatora
			}
		});

		// Zadavane funckii na frame-a
		setLayout(null);
		setVisible(true);
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		// Davane na bytonite funkcii
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

	public void actionPerformed(ActionEvent e) {
		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b1)
			t.setText(t.getText().concat("1"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b2)
			t.setText(t.getText().concat("2"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b3)
			t.setText(t.getText().concat("3"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b4)
			t.setText(t.getText().concat("4"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b5)
			t.setText(t.getText().concat("5"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b6)
			t.setText(t.getText().concat("6"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b7)
			t.setText(t.getText().concat("7"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b8)
			t.setText(t.getText().concat("8"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b9)
			t.setText(t.getText().concat("9"));

		// Pri natiskane na byton za chislo, da se zadava na text-fielda saotvetnata
		// stoinost
		if (e.getSource() == b0)
			t.setText(t.getText().concat("0"));

		// Pri na tiskane na bytona, da se slaga tochka
		if (e.getSource() == bdec)
			t.setText(t.getText().concat("."));

		// Pri natiskane na +
		if (e.getSource() == badd) {
			// Vav promenlivata a se zapisva parvoto chislo
			a = Double.parseDouble(t.getText());
			// Davane na znak che e natisnat +
			operator = 1;
			// Pochistvane na text-fielda
			t.setText("");
		}

		// Pri natiskane na -
		if (e.getSource() == bsub) {
			// Vav promenlivata a se zapisva parvoto chislo
			a = Double.parseDouble(t.getText());
			// Davane na znak che e natisnat -
			operator = 2;
			// Pochistvane na text-fielda
			t.setText("");
		}

		// Pri natiskane na *
		if (e.getSource() == bmul) {
			// Vav promenlivata a se zapisva parvoto chislo
			a = Double.parseDouble(t.getText());
			// Davane na znak che e natisnat *
			operator = 3;
			// Pochistvane na text-fielda
			t.setText("");
		}
		// Pri natiskane na delenie

		if (e.getSource() == bdiv) {
			// Vav promenlivata a se zapisva parvoto chislo
			a = Double.parseDouble(t.getText());
			// Davane na znak che e natisnato delenie
			operator = 4;
			// Pochistvane na text-fielda
			t.setText("");
		}

		// Ako e natisnato =
		if (e.getSource() == beq) {
			// Vav stoinost b se zapisva vtoroto chislo
			b = Double.parseDouble(t.getText());

			switch (operator) {
			// Ako e natisnato sabirane
			case 1:
				result = Calculators.StandardCalculator.sum(a, b); // Vikane na nyjnata funkciq

				break;
			// Ako e natisnato izvajdane
			case 2:
				result = Calculators.StandardCalculator.diff(a, b); // Vikane na nyjnata funkciq

				break;
			// Ako e natisnato ymnojavane

			case 3:
				result = Calculators.StandardCalculator.multi(a, b); // Vikane na nyjnata funkciq

				break;
			// Ako e natisnato delenie
			case 4:
				result = Calculators.StandardCalculator.dev(a, b); // Vikane na nyjnata funkciq

				break;

			default:
				result = 0;
			}
			// Izvejdane na resultata
			t.setText("" + result);
		}

		// Ako e natisnato pochistvane
		if (e.getSource() == bclr)
			t.setText(""); // Text-fielda se pochistva

		// Ako e natisnato Izstrivane
		if (e.getSource() == bdel) {
			// Premahva se posledniqt element ot text-fielda
			String s = t.getText();
			t.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				t.setText(t.getText() + s.charAt(i));
		}
	}

}
