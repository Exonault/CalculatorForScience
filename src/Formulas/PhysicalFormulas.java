package src.Formulas;

public class PhysicalFormulas
{
    public final double g=9.8;//for gases
    public final double q=1.602*Math.pow(10, -19);//for gases
    public final double c=2.997*Math.pow(10, 8);//for gases
    public final double h=6.626*Math.pow(10, -34);
    public final double OK=-273.15;


    public double S(double V, double t){return V*t;} //pat
    public double V(double S, double t){return S*t;} //skorost
    public double t(double V, double S){return S/V;} //vreme


    public double I(double U, double R){return U/R;} //tok
    public double U(double I, double R){return I*R;} //naprejenie
    public double R(double U, double I){return U/I;} //saprotivlenie


    public double E1(double m){return m*c*c;} //Ainshtain
    public double E2(double v){return v*h;} //KV energiq
    public double m(double E){return E*c*c;} //Ainshtain
    public double v(double E){return E*h;}

}
