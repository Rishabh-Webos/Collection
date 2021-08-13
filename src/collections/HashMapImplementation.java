package collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapImplementation {
  public static void main(String[] args) {
    operationOnHashMap operation = new operationOnHashMap();
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      operation.printData(
          "enter 1 for insert Data\n2 for clear data \n3 for copy the data of hashmap\n4 for check wheter key is present or not"
              + "\n5 for check wheter map is empty or not\n6 for getting all key\n7 for remove element from hashset\n8 for getting all value pair from hashset\n9 for exit");
      int choice = scanner.nextInt();
      int key;
      switch (choice) {
        case 1:
          operation.printData("Enter key");
          key = scanner.nextInt();
          operation.printData("Enter value");
          String value = scanner.next();
          operation.insertDatainHashMap(hashmap, Integer.valueOf(key), value);
          break;
        case 2:
          operation.clearDataOfHashMap(hashmap);
          break;
        case 3:
          operation.copyOfHashMap(hashmap);
          break;
        case 4:
          operation.printData("Enter Key");
          key = scanner.nextInt();
          operation.checkWhetherKeyIsPresentOrNot(hashmap, Integer.valueOf(key));
          break;
        case 5:
          operation.checkWhetherHashMapIsEmpty(hashmap);
          break;
        case 6:
          operation.getAllKeyOfHashMap(hashmap);
          break;
        case 7:
          operation.printData("Enter key");
          key = scanner.nextInt();
          operation.romoveElementFromHashSet(hashmap, Integer.valueOf(key));
          break;
        case 8:
          operation.getAllValueOfHashSet(hashmap);
          break;
        case 9:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnHashMap {
  public void printData(Object data) {
    System.out.println(data.toString());
  }

  public void insertDatainHashMap(HashMap<Integer, String> hashmap, Integer key, String value) {
    hashmap.put(key, value);
  }

  public void copyOfHashMap(HashMap<Integer, String> hashmap) {
    printData(hashmap.clone());
  }

  public void clearDataOfHashMap(HashMap<Integer, String> hashmap) {
    hashmap.clear();
  }

  public void checkWhetherKeyIsPresentOrNot(HashMap<Integer, String> hashmap, Integer Key) {
    printData(hashmap.containsKey(Key));
  }

  public void checkwhetherValueExistsOrNot(HashMap<Integer, String> hashmap, String value) {
    printData(hashmap.containsValue(value));
  }

  public void getAllKeyOfHashMap(HashMap<Integer, String> hashmap) {
    printData(hashmap.keySet());
  }

  public void getAllValueOfHashSet(HashMap<Integer, String> hashmap) {
    printData(hashmap.values());
  }

  public void checkWhetherHashMapIsEmpty(HashMap<Integer, String> hashmap) {
    printData(hashmap.isEmpty());
  }

  public void romoveElementFromHashSet(HashMap<Integer, String> hashmap, Integer Key) {
    hashmap.remove(Key);
  }
}
