package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

  private static final int NUMBER_CARE_PLANS = 234;

  public static void main(String[] args) {
    CareCoordinatorsBalancer ccBalancer = new CareCoordinatorsBalancer();

    ccBalancer.getCareCoordinators();

    for (int i = 0; i < NUMBER_CARE_PLANS; i++) {
      ccBalancer.assignCareCoordinator();
    }

    ccBalancer.printCareCoordinators();
  }
}