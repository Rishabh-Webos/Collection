package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    operationOnStack operation = new operationOnStack();
    while (true) {
      operation.printData(
          "Enter 1 for insert\n2 for display\n3 for delete data\n4 for"
              + "to get the top most element\n5 for searching the data\n6 for"
              + " to check whether stack is empty or not\n7 for exit");
      int choice = scanner.nextInt();
      int value;
      switch (choice) {
        case 1:
          operation.printData("Enter the element");
          value = scanner.nextInt();
          operation.insertDataInStack(stack, value);
          break;
        case 2:
          operation.displayDataOfStack(stack);
          break;
        case 3:
          operation.deleteDataFromStack(stack);
          break;
        case 4:
          operation.toGetTheTopMostElementInStack(stack);
          break;
        case 5:
          operation.printData("Enter the element");
          value = scanner.nextInt();
          operation.searchDataInStack(stack, value);
          break;
        case 6:
          operation.toCheckWhetherStackIsEmpty(stack);
          break;
        case 7:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnStack {
  public void printData(Object data) {
    System.out.println(data.toString());
  }

  public void insertDataInStack(Stack<Integer> stack, Integer value) {
    stack.push(value);
  }

  public void deleteDataFromStack(Stack<Integer> stack) {
    System.out.println("Deleted:" + stack.pop());
  }

  public void toCheckWhetherStackIsEmpty(Stack<Integer> stack) {
    System.out.println("Stack is empty:" + stack.empty());
  }

  public void searchDataInStack(Stack<Integer> stack, Integer value) {
    System.out.println("Searched:" + stack.search(value));
  }
  // it written the top most element
  public void toGetTheTopMostElementInStack(Stack<Integer> stack) {
    System.out.println("Last element" + stack.peek());
  }

  public void displayDataOfStack(Stack<Integer> stack) {
    Iterator<Integer> iterator = stack.iterator();
    System.out.println("Elements");
    while (iterator.hasNext()) System.out.println(iterator.next());
  }
}
