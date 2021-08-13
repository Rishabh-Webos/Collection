package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapImplementation {
  public static void main(String[] args) {
    TreeMap<Integer, String> treeMap = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);
    operationOnTreeMapImplementation operation = new operationOnTreeMapImplementation();
    while (true) {
      System.out.println(
          "Enter 1 for insert \n2 for traverse the data\n3 for update the data"
              + "\n4 for remove the element\n5 for clear Data\n6 for getting the first key\n7 for exit");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter key");
          int key = scanner.nextInt();
          System.out.println("Enter value");
          String value = scanner.next();
          operation.insertInTreeMap(treeMap, Integer.valueOf(key), value);
          break;
        case 2:
          operation.traverse(treeMap);
          break;
        case 3:
          System.out.println("Enter key");
          key = scanner.nextInt();
          System.out.println("Enter value");
          value = scanner.next();
          operation.updateTheValueInTreeMap(treeMap, Integer.valueOf(key), value);
          break;
        case 4:
          System.out.println("Enter key");
          key = scanner.nextInt();
          operation.removeElementInTreeMap(treeMap, Integer.valueOf(key));
          break;
        case 5:
          operation.clearDataInTreeMap(treeMap);
          break;
        case 6:
          operation.getTheFirstKeyInTreeMap(treeMap);
          break;
        case 7:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnTreeMapImplementation {
  public void insertInTreeMap(TreeMap<Integer, String> treeMap, Integer i, String val) {
    treeMap.put(i, val);
  }

  public void traverse(TreeMap<Integer, String> treeMap) {
    for (Map.Entry<Integer, String> map : treeMap.entrySet())
      System.out.println(map.getKey() + " " + map.getValue());
  }

  public void updateTheValueInTreeMap(TreeMap<Integer, String> treeMap, Integer key, String value) {
    treeMap.put(key, value);
  }

  public void removeElementInTreeMap(TreeMap<Integer, String> treeMap, Integer key) {
    treeMap.remove(key);
  }

  public void clearDataInTreeMap(TreeMap<Integer, String> treeMap) {
    treeMap.clear();
  }

  public void getTheFirstKeyInTreeMap(TreeMap<Integer, String> treeMap) {
    System.out.println(treeMap.firstKey());
  }

  public void subKey(TreeMap<Integer, String> treeMap, Integer Start, Integer End) {
    System.out.println(treeMap.subMap(Start, End));
  }
}
