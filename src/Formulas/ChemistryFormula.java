package src.Formulas;

public class ChemistryFormula {
    public final double Vm=22.41;//for gases
    //Cm=n/v[mol/l]
    public double molarConcentration(double n, double v){return n/v;}
    public double nByMolarConcentration(double molarConcentration, double v){return molarConcentration*v;}
    public double vBymolarConcentration(double n, double molarConcentration){return n/molarConcentration;}
    //p=m/v[kg/l]
    public double density(double m, double v){return m/v;}
    public double mByDensity(double density, double v){return density*v;}
    public double vByDensity(double m, double density){return m/density;}
    //Vm=v/n[l/mol]
    public double molarVolume(double v, double n){return v/n;}
    public double vBymolarVolume(double n, double molarVolume){return n*molarVolume;}
    public double nBymolarVolume(double v, double molarVolume){return v/molarVolume;}
    //M=m/n[g/mol]=Mr
    public double molarMass(double m,double n){return m/n;}
    public double mByMolarMass(double molarMass,double n){return molarMass*n;}
    public double nByMolarMass(double m,double molarMass){return m/molarMass;}
}
