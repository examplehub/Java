package com.examplehub.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AllocationTest {

  @Test
  void testAllocation() {
    assertEquals(
        "[1-4161, 4162-8322, 8323-12483, 12484-16647]", Allocation.allocation(16647, 4).toString());

    assertEquals(
        "[1-16666, 16667-33332, 33333-49998, 49999-66664, 66665-83330, 83331-100000]",
        Allocation.allocation(100000, 6).toString());
  }
}
