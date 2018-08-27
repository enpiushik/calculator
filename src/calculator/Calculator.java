package calculator;

/**
 * @author Natalja
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);
        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double result = 0;
        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                return "ERROR";
        }
        if (expression.length < 4){
            return String.valueOf(result);
        }
        System.out.println(expression[3]);
        System.out.println(expression[4]);
        double c = Double.parseDouble(expression[4]);
        switch (expression[3]) {
            case "+":
                result = result + c;
                break;
            case "-":
                result = result - c;
                break;
            case "*":
                result = result * c;
                break;
            case "/":
                result = result / c;
                break;
            default:
                return "ERROR";
        }
        switch (expression[1] + expression[3]){
            case "+*":
                result = a + (b * c);
                break;
            case "+/":
                result = a + (b / c);
                break;
            case "-*":
                result = a - (b * c);
                break;
            case "-/":
                result = a - (b / c);
                break;
        }
        return String.valueOf(result);
    }

}
