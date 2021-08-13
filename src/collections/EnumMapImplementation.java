package collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapImplementation {
  enum Num {
    one,
    two,
    three;
  }

  public static void main(String[] args) {
    EnumMap<Num, Integer> enumMap = new EnumMap<>(Num.class);
    enumMap.put(Num.one, 1);
    enumMap.put(Num.two, 2);
    enumMap.put(Num.three, 3);
    for (Map.Entry<Num, Integer> a : enumMap.entrySet())
      System.out.println(a.getKey() + " " + a.getValue());
  }
}
