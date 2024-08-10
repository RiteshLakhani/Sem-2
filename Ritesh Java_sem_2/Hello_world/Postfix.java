import java.util.Stack;

class Postfix {
    private static int getInputPrecedence(char symbol) {
        switch (symbol) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            default:
                return 7; // Variables
        }
    }

    private static int getStackPrecedence(char symbol) {
        switch (symbol) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 8; // Variables
        }
    }

    private static int getRankFunction(char symbol) {
        switch (symbol) {
            case '+':
            case '-':
                return -1;
            case '*':
            case '/':
                return -1;
            case '^':
                return -1;
            case '(':
                return 0;
            default:
                return 1;
        }
    }

    private static boolean isValidExpression(char[] infix) {
        int top = 0;
        char[] stack = new char[infix.length];
        stack[top] = '(';
        int rank = 0;
        char next = getNextChar(infix);

        while (next != ' ') {
            while (getStackPrecedence(stack[top]) > getInputPrecedence(next)) {
                char temp = pop(stack, top--);
                System.out.print(temp);
                rank += getRankFunction(temp);
                if (rank < 1) {
                    System.out.println("\nINVALID");
                    return false;
                }
            }

            if (getStackPrecedence(stack[top]) != getInputPrecedence(next)) {
                push(stack, ++top, next);
            } else {
                pop(stack, top--);
            }

            next = getNextChar(infix);
        }

        if (top != 0 || rank != 1) {
            System.out.println("\nINVALID");
            return false;
        }

        System.out.println("\nVALID");
        return true;
    }

    private static char getNextChar(char[] infix) {
        // Assume you have a method to get the next character from the input infix
        // and update the index accordingly
        // For example: char next = infix[index++];
        // Implement this method according to your requirements
        return ' ';
    }

    private static void push(char[] stack, int top, char symbol) {
        stack[top] = symbol;
    }

    private static char pop(char[] stack, int top) {
        char temp = stack[top];
        stack[top] = '\0';
        return temp;
    }

    public static void main(String[] args) {
        char[] infixExpression = "your_infix_expression".toCharArray();
        isValidExpression(infixExpression);
    }
}
