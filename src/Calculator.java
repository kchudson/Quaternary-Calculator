public class Calculator {

    public Calculator() {

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.splitInput("12-32");
    }

    public void splitInput(String input) {
        int num1;
        int num2;
        String operator;

        int plusEnd = input.indexOf('+');
        int subtractEnd = input.indexOf('-');
        int multiplyEnd = input.indexOf('*');
        int divideEnd = input.indexOf('/');

        if (plusEnd != -1) {
            num1 = Integer.parseInt(input.substring(0, plusEnd));
            operator = "+";
            num2 = Integer.parseInt(input.substring(plusEnd+1));
        }
        else if (subtractEnd != -1) {
            num1 = Integer.parseInt(input.substring(0, subtractEnd));
            operator = "-";
            num2 = Integer.parseInt(input.substring(subtractEnd+1));
        }
        else if (multiplyEnd != -1) {
            num1 = Integer.parseInt(input.substring(0, multiplyEnd));
            operator = "*";
            num2 = Integer.parseInt(input.substring(multiplyEnd+1));
        }
        else {
            num1 = Integer.parseInt(input.substring(0, divideEnd));
            operator = "/";
            num2 = Integer.parseInt(input.substring(divideEnd+1));
        }

        operate(num1, operator, num2);
    }

    public void operate(int num1, String operator, int num2) {
        int result = 0 ;
        switch(operator){
            case "+" :
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;

    }

    public void quatToDeci(String num){
        int result = 0;
        for (int i = 0; i < num.length(); i++){
            result += Character.getNumericValue(num.charAt(i)) * Math.pow(4,num.length()-i-1);
        }
        System.out.println(result);
    }
}
