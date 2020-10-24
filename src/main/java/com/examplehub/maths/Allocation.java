package com.examplehub.maths;

import java.util.ArrayList;
import java.util.List;

public class Allocation {
  public static List<String> allocation(int numberOfBytes, int partitions) {

    List<String> allocations = new ArrayList<>();
    int bytesPerPartition = numberOfBytes / partitions;
    for (int i = 0; i < partitions; ++i) {
      int startBytes = i * bytesPerPartition + 1;
      int endBytes = i == partitions - 1 ? numberOfBytes : (i + 1) * bytesPerPartition;
      allocations.add(startBytes + "-" + endBytes);
    }
    return allocations;
  }
}
