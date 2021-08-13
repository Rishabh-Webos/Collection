package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetImplementation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    OperationOnTreeSet operation = new OperationOnTreeSet();
    TreeSet<Integer> treeset = new TreeSet<>();
    while (true) {
      operation.printData(
          "Enter 1 for insert\n2 for traverse through treeset\n3 for traverse through reverse order"
              + "\n4 for closet value\n5 for getting max and min value"
              + "\n6 for clear data of treeset\n7 for check value exist or not\n8 for check treeset is empty"
              + "\n9 for remove element\n10 for getting the size of tree set\n11 for genrating subset of given set"
              + "\n12 for exitcase ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          operation.printData("Enter value");
          int value = scanner.nextInt();
          operation.insertInTreeSet(treeset, Integer.valueOf(value));
          break;
        case 2:
          operation.traverseThroughTreeSet(treeset);
          break;
        case 3:
          operation.reverseOrder(treeset);
          break;
        case 4:
          operation.printData("Enter value");
          value = scanner.nextInt();
          operation.closetValueInTreeSet(treeset, Integer.valueOf(value));
          break;
        case 5:
          operation.maxAndMinValue(treeset);
          break;
        case 6:
          operation.clearTreeSet(treeset);
          break;
        case 7:
          operation.printData("Enter value");
          value = scanner.nextInt();
          operation.containsValueinTreeSet(treeset, Integer.valueOf(value));
          break;
        case 8:
          operation.isEmpty(treeset);
          break;
        case 9:
          operation.printData("Enter value");
          value = scanner.nextInt();
          operation.removeElementFromTreeSet(treeset, Integer.valueOf(value));
          break;
        case 10:
          operation.sizeOfTreeSet(treeset);
          break;
        case 11:
          operation.printData("Enter starting range");
          int start = scanner.nextInt();
          operation.printData("Enter Ending range");
          int ending = scanner.nextInt();
          operation.subsetOfTreeSetInGivenRange(
              treeset, Integer.valueOf(start), Integer.valueOf(ending));
          break;
        case 12:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class OperationOnTreeSet {
  public void insertInTreeSet(TreeSet<Integer> treeSet, Integer value) {
    treeSet.add(value);
  }

  public void printData(Object data) {
    System.out.println(data.toString());
  }

  public void itemIterator(Iterator<Integer> iterator) {
    while (iterator.hasNext()) {
      printData(iterator.next());
    }
  }

  public void traverseThroughTreeSet(TreeSet<Integer> treeSet) {
    Iterator<Integer> iterator = treeSet.iterator();
    itemIterator(iterator);
  }
  // it will return the greatest or equal element to the specified element
  public void closetValueInTreeSet(TreeSet<Integer> treeSet, Integer value) {
    printData("Closest value:" + treeSet.ceiling(value));
  }
  // for traversing in descending order
  public void reverseOrder(TreeSet<Integer> treeSet) {
    Iterator<Integer> iterator = treeSet.descendingIterator();
    itemIterator(iterator);
  }
  // For Getting the highest and lowest value
  public void maxAndMinValue(TreeSet<Integer> treeSet) {
    printData("Lowest value:" + treeSet.pollFirst() + "\n" + "Highest value:" + treeSet.pollLast());
  }

  public void clearTreeSet(TreeSet<Integer> treeSet) {
    treeSet.clear();
  }

  public void containsValueinTreeSet(TreeSet<Integer> treeSet, Integer value) {
    printData(treeSet.contains(value));
  }

  public void isSubsetOfGivenTreeSet(TreeSet<Integer> treeSet, TreeSet<Integer> treeSet1) {
    printData(treeSet.containsAll(treeSet1));
  }

  public void isEmpty(TreeSet<Integer> treeSet) {
    printData("TreeSet Is empty:" + treeSet.isEmpty());
  }

  public void removeElementFromTreeSet(TreeSet<Integer> treeSet, Integer value) {
    treeSet.remove(value);
  }
  // it will remove all the element present in the another tree set
  public void removeSimilarElementFromTheGivenTreeSet(
      TreeSet<Integer> treeSet, TreeSet<Integer> treeSet1) {
    printData(treeSet.removeAll(treeSet1));
  }

  public void sizeOfTreeSet(TreeSet<Integer> treeSet) {
    printData("Size:" + treeSet.size());
  }

  public void subsetOfTreeSetInGivenRange(TreeSet<Integer> treeSet, Integer start, Integer end) {
    traverseThroughTreeSet((TreeSet<Integer>) treeSet.subSet(start, end));
  }
}
