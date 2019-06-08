package Formulas;

public class ChemistryFormula {
    public final double Vm=22.41;//for gases
    //Cm=n/v[mol/l]
    public static double molarConcentration(double n, double v){return n/v;}
    public static double nByMolarConcentration(double molarConcentration, double v){return molarConcentration*v;}
    public static double vBymolarConcentration(double n, double molarConcentration){return n/molarConcentration;}
    //p=m/v[kg/l]
    public static double density(double m, double v){return m/v;}
    public static double mByDensity(double density, double v){return density*v;}
    public static double vByDensity(double m, double density){return m/density;}
    //Vm=v/n[l/mol]
    public static double molarVolume(double v, double n){return v/n;}
    public static double vBymolarVolume(double n, double molarVolume){return n*molarVolume;}
    public static double nBymolarVolume(double v, double molarVolume){return v/molarVolume;}
    //M=m/n[g/mol]=Mr
    public static double molarMass(double m,double n){return m/n;}
    public static double mByMolarMass(double molarMass,double n){return molarMass*n;}
    public static double nByMolarMass(double m,double molarMass){return m/molarMass;}
}
