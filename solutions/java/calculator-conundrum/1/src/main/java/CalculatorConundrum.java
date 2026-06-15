class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {throw new IllegalArgumentException("Operation cannot be null");}
        if (operation.isEmpty()) {throw new IllegalArgumentException("Operation cannot be empty");}
        if (operation.equals("/") && operand2==0) {
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
        }


        String firstPart = operand1 + " " + operation + " " + operand2;

        int result = switch(operation) {
            case "*" -> operand1 * operand2;
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "/" -> operand1 / operand2;
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            case null -> throw new IllegalArgumentException("Operation cannot be null");
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        };

        return firstPart + " = " + result;
    }
}