package Assigment2.assig2;

import java.util.LinkedList;
import java.util.Stack;

public class CustomList {
	public static Object size;
	public static Object count;

	public static void main(String[] args) {
		String checkBalancedExpr1 = checkBalancedParentesis("a*(b+c)-(d*e)");
		System.out.println("a*(b+c)-(d*e) : " + checkBalancedExpr1);
		String checkBalancedExpr2 = checkBalancedParentesis("(a*(b-c)*{d+e}");
		System.out.println("(a*(b-c)*{d+e} : " + checkBalancedExpr2);
	}

	public static String checkBalancedParentesis(String expr) {
		if (expr.isEmpty())
			return "Balanced";

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char current = expr.charAt(i);
			if (current == '{' || current == '(' || current == '[') {
				stack.push(current);
			}
			if (current == '}' || current == ')' || current == ']') {
				if (stack.isEmpty())
					return "Not Balanced";
				char last = stack.peek();
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return "Not Balanced";
			}
		}
		return stack.isEmpty() ? "Balanced" : "Not Balanced";
	}

	public static Object find(LinkedList<Integer> list, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void insert(LinkedList<Integer> list, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void delete(LinkedList<Integer> list, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void displayList(LinkedList<Integer> list) {
		// TODO Auto-generated method stub
		
	}

	public static Object sizeOfList(LinkedList<Integer> list) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object isEmpty(LinkedList<Integer> linkedList) {
		// TODO Auto-generated method stub
		return null;
	}

}
