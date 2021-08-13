package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListImplementation {
  public static void main(String[] args) {
    operationOnArrayList operation = new operationOnArrayList();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    while (true) {
      operation.printData(
          "Enter 1 for insert element \n2 for display Element\n3 for get element using index"
              + "\n4 for removing element using index\n5 for removing element using value\n6 for checking element whether element using index"
              + "\n7 for clear data from arrayList\n8 for for getting size of arraylist\n9 for soritng arraylist ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          operation.printData("Enter Value");
          int value = scanner.nextInt();
          operation.insertInArrayList(arrayList, value);
          break;
        case 2:
          operation.traverse(arrayList);
          break;
        case 3:
          operation.printData("Enter Element");
          value = scanner.nextInt();
          operation.get(arrayList, value);
          break;
        case 4:
          operation.printData("Enter the index");
          value = scanner.nextInt();
          operation.remove(arrayList, value);
          break;
        case 5:
          operation.printData("enter the element");
          value = scanner.nextInt();
          operation.remove_by_element(arrayList, value);
          break;
        case 6:
          operation.printData("Enter the element");
          value = scanner.nextInt();
          operation.contains(arrayList, value);
          break;
        case 7:
          operation.clearDataInArrayList(arrayList);
          break;
        case 8:
          operation.size(arrayList);
          break;
        case 9:
          operation.sort(arrayList);
          break;
        case 10:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnArrayList {
  public void insertInArrayList(ArrayList<Integer> arrayList, Integer value) {
    arrayList.add(value);
  }

  public void printData(Object data) {
    System.out.println(data.toString());
  }
  // This method is used to extend an ArrayList
  public void extendArrayList(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
    arrayList.addAll(arrayList1);
  }

  public void clearDataInArrayList(ArrayList<Integer> arrayList) {
    arrayList.clear();
  }
  // This method is used get an element at a particular index
  public void get(ArrayList<Integer> arrayList, Integer value) {
    printData(arrayList.get(value));
  }

  public boolean isEmpty(ArrayList<Integer> arrayList) {
    return arrayList.isEmpty();
  }

  public void traverse(ArrayList<Integer> arrayList) {
    Iterator<Integer> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      printData(iterator.next());
    }
  }
  // This method check whether the element is present or not
  public boolean contains(ArrayList<Integer> arrayList, Integer value) {
    return arrayList.contains(value);
  }
  // This method remove the element by giving the specific element
  public void remove_by_element(ArrayList<Integer> arrayList, Integer value) {
    arrayList.remove(value);
  }
  // This method remove the element at given index
  public void remove(ArrayList<Integer> arrayList, int value) {
    arrayList.remove(value);
  }
  // This method remove all the elements present in another collection
  public void remove_all(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
    arrayList.removeAll(arrayList1);
    printData("Removed Succesfully");
  }

  public void updateTheElementOfArrayList(
      ArrayList<Integer> arrayList, Integer index, Integer value) {
    arrayList.set(index, value);
  }

  public void size(ArrayList<Integer> arrayList) {
    printData("Size of ArrayList" + arrayList.size());
  }

  public void retainall(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
    arrayList.retainAll(arrayList1);
  }

  public void sort(ArrayList<Integer> arrayList) {
    Collections.sort(arrayList, Collections.reverseOrder());
    printData(arrayList);
  }
}
