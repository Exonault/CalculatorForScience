package Formulas;

public class PhysicalFormulas
{
	//Pre-definirane na fizichnite konstanti
    public static final double g=9.8;//for gases
    public static final double q=1.602*Math.pow(10, -19);//zarqd na elektron
    public static final double c=2.997*Math.pow(10, 8);//skorost na svetlina
    public static final double h=6.626*Math.pow(10, -34);//konst. na Plank
    public static final double OK=-273.15;//Absolutna nyla


    
    //Formula za pyt (S = V*t)
    public static double S(double V, double t){return V*t;} //pyt
    //Formula za skorost
    public static double V(double S, double t){return S*t;} //skorost
    //Formula za vreme
    public static double t(double V, double S){return S/V;} //vreme

    
    //Formula za tok
    public static double I(double U, double R){return U/R;} //tok
    //Formula za naprejenie
    public static double U(double I, double R){return I*R;} //naprejenie
    //Formula za saprotivlenie
    public static double R(double U, double I){return U/I;} //saprotivlenie

    
    //Formula na Ainshtain
    public static double E1(double m){return m*c*c;} //Ainshtain
    //Formula za kvantova energiq
    public static double E2(double v){return v*h;} //KV energiq
    //Formula za masa
    public static double m(double E){return E/(c*c);} //Ainshtain
    //Formula za chestota na valnata
    public static double v(double E){return E/h;}

}
