package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashsetImplementation {
  public static void main(String[] args) {
    operationOnHashSet operation = new operationOnHashSet();
    HashSet<Integer> hashset = new HashSet<Integer>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      operation.printData(
          "Enter 1 for insert \n2 for display\n3 for copy the element"
              + "\n4 for getting the size of hashset\n5 for removing the element from hashset"
              + "\n6 for clearing data from hashset\n7 for checking whether hashset is empty"
              + "\n8 for exit");
      int choice = scanner.nextInt();
      int value;
      switch (choice) {
        case 1:
          operation.printData("enter the element");
          value = scanner.nextInt();
          operation.insertElementInHashSet(hashset, value);
          break;
        case 2:
          operation.traverseThroughHashSet(hashset);
          break;
        case 3:
          operation.copyOfHashSet(hashset);
          break;
        case 4:
          operation.getTheSizeOfHashSet(hashset);
          break;
        case 5:
          operation.printData("Enter the element");
          value = scanner.nextInt();
          operation.removeElementFromHashSet(hashset, value);
          break;
        case 6:
          operation.clearDataFromHashSet(hashset);
          break;
        case 7:
          operation.toCheckHashSetIsEmpty(hashset);
          break;
        case 8:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnHashSet {
  public void printData(Object data) {
    System.out.println(data.toString());
  }

  public void insertElementInHashSet(HashSet<Integer> hashSet, Integer value) {
    hashSet.add(value);
  }

  public void clearDataFromHashSet(HashSet<Integer> hashset) {
    hashset.clear();
  }
  // It is used to create a copy of hashset
  public void copyOfHashSet(HashSet<Integer> hashSet) {
    System.out.println("Clone set" + hashSet);
  }

  public void toCheckWheterValueContains(HashSet<Integer> hashSet, Integer value) {
    System.out.println(hashSet.contains(value));
  }

  public void toCheckHashSetIsEmpty(HashSet<Integer> hashset) {
    System.out.println("Set is empty:" + hashset.isEmpty());
  }

  public void traverseThroughHashSet(HashSet<Integer> hashset) {
    Iterator<Integer> iterator = hashset.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }

  public void removeElementFromHashSet(HashSet<Integer> hashset, Integer value) {
    hashset.remove(value);
    System.out.println("Removed");
  }

  public void getTheSizeOfHashSet(HashSet<Integer> hashset) {
    System.out.println(hashset.size());
  }
}
