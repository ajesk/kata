package io.acode.other;

import java.util.Arrays;
import java.util.Stack;

public class MathTree {


    void parseExpression(String expression) {
        Arrays.stream(expression.split("")).forEach(character -> {

        });
    }

    private abstract class Node {
        abstract int eval();
    }

    private class NumberNode extends Node {
        private int val;

        @Override
        int eval() {
            return val;
        }
    }

    private abstract class OperatorNode extends Node {
        Node left;
        Node right;
    }

    private class AdditionNode extends OperatorNode {
        @Override
        int eval() {
            return left.eval() + right.eval();
        }
    }

    private class SubtractionNode extends OperatorNode {
        @Override
        int eval() {
            return left.eval() - right.eval();
        }
    }
}
