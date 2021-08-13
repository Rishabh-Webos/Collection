package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapImplementation {
  public static void main(String[] args) {
    OperationOnMap operation = new OperationOnMap();
    Scanner scanner = new Scanner(System.in);
    Map<Integer, String> map = new HashMap<Integer, String>();
    while (true) {
      System.out.println(
          "Enter 1 for InsertData \n2 for Travse through Map\n3 for UpdateData\n4 for remove "
              + "Data using key\n5 for clear data\n6 for check key contains or not\n7 for get all the key value pair"
              + "\n8 for check map data are equal\n9 for to get all the values\n10 for check wheter map is empty"
              + "\n11 for getting all the key\n12 for getting the size\n13 for exit");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter key");
          int key = scanner.nextInt();
          System.out.println("Enter value");
          String value = scanner.next();
          operation.insertDataInMap(map, Integer.valueOf(key), value);
          break;
        case 2:
          operation.traverseThroughMap(map);
          break;
        case 3:
          System.out.println("Enter key");
          key = scanner.nextInt();
          System.out.println("Enter value");
          value = scanner.next();
          operation.updateDataInMap(map, Integer.valueOf(key), value);
          break;
        case 4:
          System.out.println("Enter key");
          key = scanner.nextInt();
          operation.removeDataFromMap(map, Integer.valueOf(key));
          break;
        case 5:
          operation.clearDataFromMap(map);
          break;
        case 6:
          System.out.println("Enter Key");
          key = scanner.nextInt();
          System.out.println(operation.isKeyContainsInMap(map, Integer.valueOf(key)));
          break;
        case 7:
          operation.getTheKeyValuePair(map);
          break;
        case 8:
          Map<Integer, String> map1 = new HashMap<>();
          map1.put(Integer.valueOf(1), "xyz");
          map1.put(Integer.valueOf(2), "xyzabx");
          map1.put(Integer.valueOf(3), "xyzjkl");
          System.out.println(operation.checkMapDataIsEqual(map1, map));
          break;
        case 9:
          operation.toGetAllTheValue(map);
          break;
        case 10:
          System.out.println(operation.isEmpty(map));
          break;
        case 11:
          operation.toGetAllTheKey(map);
          break;
        case 12:
          System.out.println(operation.toGetTheSizeOfMap(map));
          break;
        case 13:
          scanner.close();
          System.exit(1);
      }
    }
  }
}

class OperationOnMap {
  public void insertDataInMap(Map<Integer, String> m, Integer i, String s) {
    m.put(i, s);
  }

  public void traverseThroughMap(Map<Integer, String> m) {
    for (Map.Entry<Integer, String> a : m.entrySet())
      System.out.println(a.getKey() + ":" + a.getValue());
  }

  public void updateDataInMap(Map<Integer, String> m, Integer i, String s) {
    m.put(i, s);
  }

  public void removeDataFromMap(Map<Integer, String> m, Integer i) {
    m.remove(i);
  }

  public void clearDataFromMap(Map<Integer, String> m) {
    m.clear();
  }
  // It check whether the key is present or not
  public boolean isKeyContainsInMap(Map<Integer, String> m, Integer k) {
    boolean key = m.containsKey(k);
    return key;
  }
  // this method gives the key and value pair
  public void getTheKeyValuePair(Map<Integer, String> m) {
    System.out.println(m.entrySet());
  }

  public boolean checkMapDataIsEqual(Map<Integer, String> m, Map<Integer, String> m1) {
    boolean b = m.equals(m1);
    return b;
  }
  // This method gives the value of key
  public void toGeTheKeyValueInMap(Map<Integer, String> m, Integer k) {
    System.out.println(m.get(k));
  }

  public boolean isEmpty(Map<Integer, String> m) {
    boolean b = m.isEmpty();
    return b;
  }
  // This method gives all the key present in the map
  public void toGetAllTheKey(Map<Integer, String> m) {
    System.out.println(m.keySet());
  }

  public int toGetTheSizeOfMap(Map<Integer, String> m) {
    int i = m.size();
    return i;
  }
  // This method give all the value present in the map
  public void toGetAllTheValue(Map<Integer, String> m) {
    System.out.println(m.values());
  }
}
