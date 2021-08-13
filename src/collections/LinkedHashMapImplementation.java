package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapImplementation {
  public static void main(String[] args) {
    operationOnLinkedHashMapImplementation operation = new operationOnLinkedHashMapImplementation();
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      operation.printData(
          "Enter 1 for insert \n2 for display\n3 for get the value using key"
              + "\n4 for check whether linkedHashMap contains key or not\n5 for check whether linkedHashMap contains value"
              + "\n6 for getting all values\n7 for getting all the key\n8 for clear the data"
              + "\n9 for exit ");
      int choice = scanner.nextInt();
      int key;
      String value;
      switch (choice) {
        case 1:
          operation.printData("Enter key");
          key = scanner.nextInt();
          operation.printData("Enter value");
          value = scanner.next();
          operation.insertDataInLinkedHashMap(linkedHashMap, key, value);
          break;
        case 2:
          operation.traverseThroughLinkedHashMap(linkedHashMap);
          break;
        case 3:
          operation.printData("Enter the key");
          key = scanner.nextInt();
          operation.getTheElementFromLinkedHashMap(linkedHashMap, key);
          break;
        case 4:
          operation.printData("Enter the key");
          key = scanner.nextInt();
          operation.toCheckWhetherLinkedHashMapcontainskey(linkedHashMap, key);
          break;
        case 5:
          operation.printData("Enter the value");
          value = scanner.next();
          operation.toCheckWhetherLinkedHashMapContainsValue(linkedHashMap, value);
          break;
        case 6:
          operation.toGetAllThekeyPresentInLinkedHashMap(linkedHashMap);
          break;
        case 7:
          operation.toGetAllTheValuesPresentInLinkedHashMap(linkedHashMap);
          break;
        case 8:
          operation.clearDataInLinkedHashMap(linkedHashMap);
          break;
        case 9:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class operationOnLinkedHashMapImplementation {
  public void insertDataInLinkedHashMap(
      LinkedHashMap<Integer, String> linkedHashMap, Integer key, String Value) {
    linkedHashMap.put(key, Value);
  }

  public void getTheElementFromLinkedHashMap(
      LinkedHashMap<Integer, String> linkedHashMap, Integer key) {
    System.out.println(linkedHashMap.get(key));
  }

  public void toCheckWhetherLinkedHashMapContainsValue(
      LinkedHashMap<Integer, String> linkedHashMap, String Values) {
    System.out.println(linkedHashMap.containsValue(Values));
  }

  public void toCheckWhetherLinkedHashMapcontainskey(
      LinkedHashMap<Integer, String> linkedHashMap, Integer key) {
    System.out.println(linkedHashMap.containsKey(key));
  }
  // it return all the key value
  public void toGetAllThekeyPresentInLinkedHashMap(LinkedHashMap<Integer, String> linkedHashMap) {
    System.out.println(linkedHashMap.keySet());
  }
  // it return all the value
  public void toGetAllTheValuesPresentInLinkedHashMap(
      LinkedHashMap<Integer, String> linkedHashMap) {
    System.out.println(linkedHashMap.values());
  }

  public void traverseThroughLinkedHashMap(LinkedHashMap<Integer, String> linkedHashMap) {
    for (Map.Entry<Integer, String> m : linkedHashMap.entrySet())
      System.out.println(m.getKey() + " " + m.getValue());
  }

  public void clearDataInLinkedHashMap(LinkedHashMap<Integer, String> linkedHashMap) {
    linkedHashMap.clear();
  }

  public void printData(Object data) {
    System.out.println(data.toString());
  }
}
