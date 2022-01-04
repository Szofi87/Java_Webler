package calculator;

public class Calculator {

    private static final String[] ALLOWED_OPERATORS = {"+", "-", "*", "/", "^"};

    private double operand1 = 0, operand2 = 0, result = 0;
    private String operator = null;

    public double calculate(String expression) throws InvalidSyntaxException {
        // 1. parse input
        // TODO implement
        parse(expression);
        // 2. evaluate based on parsed values
        // TODO implement
        evaluate();
        // 3. clear state
        // TODO implement
        clear();
        // 4. return the result
        // TODO implement
        return result;
    }

        // process expression given as input and assign both operands and the operator
        // throw IllegalArgumentException with the input if it cannot be parsed
        // ans should be handled as the result of the last calculation
        // if there is no previous calculation, ans should cause IllegalStateException
        // example inputs: "4 + 2", "500/ 0.5", "0.1^2", "ans+100", "5.0/ans"
        // don't worry about handling negative numbers in input such as "-1 + 5" or "2 * -2"
        public void parse (String input) throws InvalidSyntaxException {
            // 1. substitute ans
            // TODO implement
            input = input.replace("ans", String.valueOf(result));
            // 2. parse operator
            // TODO implement
            for (String allowedOperator : ALLOWED_OPERATORS) {
                if (input.contains(allowedOperator)) operator = allowedOperator;
            }
            if (operator == null) throw new InvalidSyntaxException(input);
            // 3. parse operands
            // TODO implement
            try {
                operand1 = Double.parseDouble(input.substring(0, input.indexOf(operator)));
                operand2 = Double.parseDouble(input.substring(input.indexOf(operator) + 1));
            } catch (Exception exception) {
                throw new InvalidSyntaxException(input);
            }
        }


        // calculate result based on already parsed operands and operator
        public void evaluate () throws IllegalStateException {
            // 1. throw IllegalStateException if operator is not present
            // TODO implement
            if (operator == null)
                throw new IllegalStateException("No expression has been successfully parsed before evaluation");
            // 2. calculate and assign result
            // TODO implement
            switch (operator) {
                case "+":
                    this.result = operand1 + operand2;
                    break;
                case "-":
                    this.result = operand1 - operand2;
                    break;
                case "*":
                    this.result = operand1 * operand2;
                    break;
                case "/":
                    this.result = operand1 / operand2;
                    break;
                case "^":
                    this.result = Math.pow(operand1, operand2);
                    break;
            }
        }


        // reset calculator state without clearing previous result
        public void clear () {
            // TODO implement
            this.operator = null;
            this.operand1 = 0;
            this.operand2 = 0;
        }

        public double getOperand1 () {
            return operand1;
        }

        public double getOperand2 () {
            return operand2;
        }

        public double getResult () {
            return result;
        }

        public String getOperator () {
            return operator;
        }

    }
