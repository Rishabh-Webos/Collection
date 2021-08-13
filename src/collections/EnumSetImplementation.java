package collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetImplementation {
  enum Num {
    One,
    Two,
    Three,
    Four,
    Five;
  }

  public static void main(String[] args) {
    Set<Num> enumSet = EnumSet.allOf(Num.class);
    Iterator<Num> iterator = enumSet.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
    // Set<Num> setOfEnum = EnumSet.of(Num.One, Num.Three);
    System.out.println(enumSet);
    enumSet = EnumSet.noneOf(Num.class);
    System.out.println(enumSet);
  }
}
