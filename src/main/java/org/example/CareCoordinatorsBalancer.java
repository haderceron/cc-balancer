package org.example;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.IntStream;

public class CareCoordinatorsBalancer {
  private static final int NUMBER_CARE_COORDINATORS = 10;

  private TreeSet<CareCoordinator> set =
      new TreeSet<>(Comparator.comparing(CareCoordinator::getHash));

  public void getCareCoordinators() {
    IntStream.range(0, NUMBER_CARE_COORDINATORS)
        .mapToObj(i -> new CareCoordinator(UUID.randomUUID().toString(), 0))
        .forEach(set::add);
  }

  public void assignCareCoordinator() {
    CareCoordinator ccTemp = set.pollFirst();
    if (ccTemp != null) { // Handle potential empty set
      ccTemp.setCount(ccTemp.getCount() + 1);
      set.add(ccTemp);
    }
  }

  public void printCareCoordinators() {
    set.forEach(System.out::println);
  }

}
