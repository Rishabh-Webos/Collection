package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplementation {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    operationOnLinkedList operation = new operationOnLinkedList();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println(
          "Enter 1 for insert\n2for insert element at index\n3 for extend LinkedList\n4 for extend linkedList at given index"
              + "\n5 for display data\n6 for insert element at first index\n7 for insert element at last linked\n8 for clear the data"
              + "\n9 for get the element at given index\n10 for check the linkedlist contains data"
              + "\n11 for get the first element\n12 for get the last element\n13 for removing the first the first element\n14 for remove element using index"
              + "\n15 for removing element using value\n16 for getting the size of linkedList\n17 for update the value\n18 for exit");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter the value");
          int value = scanner.nextInt();
          operation.insertElementInLinkedList(linkedList, Integer.valueOf(value));
          break;
        case 2:
          System.out.println("Enter the index");
          int index = scanner.nextInt();
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.insertElementAtIndexInLinkedList(
              linkedList, Integer.valueOf(index), Integer.valueOf(value));
          break;
        case 3:
          LinkedList<Integer> linkedList1 = new LinkedList<>();
          for (int row = 0; row < 3; row++) {
            operation.insertElementInLinkedList(linkedList1, Integer.valueOf(row));
          }
          operation.extendLinkedList(linkedList, linkedList1);
          break;
        case 4:
          System.out.println("Enter index");
          index = scanner.nextInt();
          linkedList1 = new LinkedList<>();
          for (int row = 0; row < 3; row++) {
            operation.insertElementInLinkedList(linkedList1, Integer.valueOf(row));
          }

          operation.extendLinkedListAtIndex(linkedList, linkedList1, Integer.valueOf(index));
          break;
        case 5:
          operation.traverseThroughLinkedList(linkedList);
          break;
        case 6:
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.insertElementAtFirstIndex(linkedList, Integer.valueOf(value));
          break;
        case 7:
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.insertElementAtlastInked(linkedList, Integer.valueOf(value));
          break;
        case 8:
          operation.clearTheDataOfLinkedList(linkedList);
          break;
        case 9:
          System.out.println("Enter the index");
          index = scanner.nextInt();
          operation.getTheElementAtTheGivenIndex(linkedList, index);
          break;
        case 10:
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.checkWheterLinkedContainsData(linkedList, Integer.valueOf(value));
          break;
        case 11:
          operation.getfirst(linkedList);
          break;
        case 12:
          operation.getlast(linkedList);
          break;
        case 13:
          operation.removeTheFirstElementInLinkedList(linkedList);
          break;
        case 14:
          System.out.println("Enter the index");
          index = scanner.nextInt();
          operation.removeElementUsingIndex(linkedList, index);
          break;
        case 15:
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.removeElementUsingTheValue(linkedList, Integer.valueOf(value));
          break;
        case 16:
          operation.getTheSizeOfLinkedList(linkedList);
          break;
        case 17:
          System.out.println("Enter the index");
          index = scanner.nextInt();
          System.out.println("Enter the value");
          value = scanner.nextInt();
          operation.updateAtParticularIndex(
              linkedList, Integer.valueOf(index), Integer.valueOf(value));
          break;
        case 18:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnLinkedList {
  public void insertElementInLinkedList(LinkedList<Integer> linkedList, Integer value) {
    linkedList.add(value);
  }

  public void insertElementAtIndexInLinkedList(
      LinkedList<Integer> linkedList, Integer index, Integer value) {
    linkedList.add(index, value);
  }
  // Extend the LinkedList
  public void extendLinkedList(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList1) {
    linkedList.addAll(linkedList1);
  }
  // extend at particular index
  public void extendLinkedListAtIndex(
      LinkedList<Integer> linkedList, LinkedList<Integer> linkedList1, Integer value) {
    linkedList.addAll(value, linkedList1);
  }

  public void traverseThroughLinkedList(LinkedList<Integer> linkedList) {
    Iterator<Integer> itr = linkedList.iterator();
    while (itr.hasNext()) System.out.println(itr.next());
  }

  public void insertElementAtFirstIndex(LinkedList<Integer> linkedList, Integer value) {
    linkedList.addFirst(value);
  }

  public void insertElementAtlastInked(LinkedList<Integer> linkedList, Integer value) {
    linkedList.addLast(value);
  }

  public void clearTheDataOfLinkedList(LinkedList<Integer> linkedList) {
    linkedList.clear();
  }

  public void getTheElementAtTheGivenIndex(LinkedList<Integer> linkedList, int value) {
    System.out.println(linkedList.get(value));
  }

  public void checkWheterLinkedContainsData(LinkedList<Integer> linkedList, Integer value) {
    System.out.println(linkedList.contains(value));
  }
  // It will return the first element
  public void getfirst(LinkedList<Integer> linkedList) {
    System.out.println(linkedList.getFirst());
    ;
  }
  // it will return the last element
  public void getlast(LinkedList<Integer> linkedList) {
    System.out.println(linkedList.getLast());
  }
  // It will retrieve and remove the first element
  public void removeTheFirstElementInLinkedList(LinkedList<Integer> linkedList) {
    System.out.println(linkedList.remove());
  }
  // it will remove at the particular index
  public void removeElementUsingIndex(LinkedList<Integer> linkedList, int value) {
    linkedList.remove(value);
  }

  public void removeElementUsingTheValue(LinkedList<Integer> linkedList, Integer value) {
    linkedList.remove(value);
  }

  public int getTheSizeOfLinkedList(LinkedList<Integer> linkedList) {
    int value = linkedList.size();
    return value;
  }

  public void updateAtParticularIndex(
      LinkedList<Integer> linkedList, Integer index, Integer value) {
    linkedList.set(index, value);
  }
}
