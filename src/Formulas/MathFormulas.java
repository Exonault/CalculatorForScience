package Formulas;

public class MathFormulas {

    public static int factoriel(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int permutations(int n) {
        return factoriel(n);
    }

    public static double variations(int k, int n) {
        double answer = factoriel(n) / factoriel(n - k);
        return answer;
    }

    public static double combinations(int k, int n) {
        double answer = factoriel(n) / (factoriel(n - k) * factoriel(k));
        return answer;
    }

    public static double probability(double goodOutcome, double allOutcome) {
        return goodOutcome / allOutcome;
    }

    public static double sumOfFirstNElementsArithmethicSeries(double a1, double an, int n) {
        return ((a1 + an) / 2) * n;
    }

    public static double sumOfFirstNElementsArithmethicSeriesOption2(double a1, double d, int n) {
        return (((2 * a1) + ((n - 1) * d)) / 2) * n;
    }

    public static double sumOfFirstNElementsGeometricSeries(double a1, double q, int n) {
        return a1 * ((Math.pow(q, n) - 1) / (q - 1));
    }

    //a^2 = b^2 + c^2 - 2*b*c*cos(alpha);
    public static double cosineTheorem(double b, double c, double alpha) {
        double result =
                Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - (2 * b * c * Math.cos(alpha)));
        return result;
    }

    // 2*R = a/sin(alpha)
    public static double sineTheorem(double a, double alpha) {
        return a / Math.sin(alpha);
    }

    public static double formulaForMedian(double a, double b, double c) {
        double result =
                Math.sqrt(0.25 * (2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2)));
        return result;
    }

    public static double triangleArea(double c, double hc) {
        return (c * hc) / 2;
    }

    public static double triangleArea(double a, double b, int gama) {
        return (a * b * Math.sin(gama)) / 2;
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double triangleArea(double a, double b, double c, double R){
        return ((a*b*c) / (4*R));
    }

    public static double trapezoidArea(double a, double b, double h)
    {
        return ((a+b)/2)*h;
    }

    public static double paralelogramArea(double a, double ha){
        return a*ha;
    }

    public static double paralelogramArea(double a, double b, double alpha)
    {
        return a*b*Math.sin(alpha);
    }


}
