package Formulas;
public class CustomFormulas {

    public static String TheAnsIsIntWhenTheParametarIs(String izraz, double startNum, double diff)
    //that method finds the first 3 solution when the equation is int
    //the parametar must be named 'x' in the izraz
    {
        StringBuilder ans = new StringBuilder();
        double a = 0;
        double n = startNum;
        int br = 0;
        String neededPartFromIzraz = izraz.substring(2);
        //   System.out.println(neededPartFromIzraz);
        while (br != 3) {
            a = FindA(neededPartFromIzraz, n);
            if (a == (int) a) {
                ans.append(izraz.charAt(0) + "=" + (int) a + " when x= " + n + "\n");
                br++;
            }
            n -= diff;
        }
        return ans.toString();
    }

    public static String FindX(String izraz, double startNum, double diff)//that method finds when the equation is 0
    //the parametar must be named 'x' in the izraz
    {
        StringBuilder ans = new StringBuilder();
        double a = 0;
        double n = startNum;
        int br = 0;
        String neededPartFromIzraz = izraz.substring(2);
        //   System.out.println(neededPartFromIzraz);
        while (br != 1) {
            a = FindA(neededPartFromIzraz, n);
            if (a == 0) {
                ans.append(izraz.charAt(0) + "=" + (int) a + " when x=" + n + "\n");
                br++;
            }
            n -= diff;
        }
        return ans.toString();
    }

    private static double FindA(String izraz, double n) {
        //double a = 0;
        izraz = izraz.replaceAll("x", Double.toString(n));
       // System.out.println(izraz);
        double a = eval(izraz);
        //System.out.println(a);
        return a;
    }

//The following methods are from:
// https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form


    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}