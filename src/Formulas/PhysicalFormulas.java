package Formulas;

public class PhysicalFormulas
{
    public static final double g=9.8;//for gases
    public static final double q=1.602*Math.pow(10, -19);//for gases
    public static final double c=2.997*Math.pow(10, 8);//for gases
    public static final double h=6.626*Math.pow(10, -34);
    public static final double OK=-273.15;


    public static double S(double V, double t){return V*t;} //pat
    public static double V(double S, double t){return S*t;} //skorost
    public static double t(double V, double S){return S/V;} //vreme


    public static double I(double U, double R){return U/R;} //tok
    public static double U(double I, double R){return I*R;} //naprejenie
    public static double R(double U, double I){return U/I;} //saprotivlenie


    public static double E1(double m){return m*c*c;} //Ainshtain
    public static double E2(double v){return v*h;} //KV energiq
    public static double m(double E){return E/(c*c);} //Ainshtain
    public static double v(double E){return E/h;}

}
