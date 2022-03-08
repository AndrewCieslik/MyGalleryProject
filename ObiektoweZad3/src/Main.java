public class Main {
    public static void main(String[] args){
        Rational number1 = new Rational(1,2);
        Rational number2 = new Rational(1,3);

        Rational number3 = number1.add(number2);
        Rational number4 = number1.mul(number2);
        Rational number5 = number1.div(number2);
        Rational number6 = number1.sub(number2);



        System.out.println(number3.getNumerator());
        System.out.println(number3.getDenominator());
        System.out.println(number4.getNumerator());
        System.out.println(number5.getNumerator() + " "  + number5.getDenominator());
        System.out.println(number6.getNumerator() + " "  + number6.getDenominator());
        System.out.println(number1.equals(number2));
        System.out.println(number1.compareTo(number2));
        System.out.println(number3.toString());


    }
}
