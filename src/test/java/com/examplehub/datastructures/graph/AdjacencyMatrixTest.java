package com.examplehub.datastructures.graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.Collections;

class AdjacencyMatrixTest {
    @Test
    void test() {
        String[] vertex = {"A", "B", "C", "D", "E"};
        int[][] adj = {
                {0, 1, 1, 1, 0},
                {1, 0, 0, 1, 1},
                {1, 0, 0, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 1, 0, 1, 0}
        };
        AdjacencyMatrix<String> adjacencyMatrix = new AdjacencyMatrix<>(vertex, adj);
        assertEquals("A->B->D->C->E", adjacencyMatrix.dfsPath());

        adjacencyMatrix = new AdjacencyMatrix<>(vertex);
        adjacencyMatrix.addEdge(0, 1); /* A - B */
        adjacencyMatrix.addEdge(0, 2); /* A - C */
        adjacencyMatrix.addEdge(0, 3); /* A - D */
        adjacencyMatrix.addEdge(1, 3); /* B - D */
        adjacencyMatrix.addEdge(2, 3); /* C - D */
        adjacencyMatrix.addEdge(1, 4); /* B - E */
        adjacencyMatrix.addEdge(3, 4); /* D - E */
        assertEquals("A->B->D->C->E", adjacencyMatrix.dfsPath());
    }

    @Test
    void testGetVertexDegree() {
        String[] vertex = {"A", "B", "C", "D", "E"};
        AdjacencyMatrix<String> adjacencyMatrix = new AdjacencyMatrix<>(vertex);
        adjacencyMatrix.addEdge(0, 1); /* A - B */
        adjacencyMatrix.addEdge(0, 2); /* A - C */
        adjacencyMatrix.addEdge(0, 3); /* A - D */
        adjacencyMatrix.addEdge(1, 3); /* B - D */
        adjacencyMatrix.addEdge(2, 3); /* C - D */
        adjacencyMatrix.addEdge(1, 4); /* B - E */
        adjacencyMatrix.addEdge(3, 4); /* D - E */
        assertEquals("A->B->D->C->E", adjacencyMatrix.dfsPath());

        assertEquals(3, adjacencyMatrix.getVertexDegree("A"));
        assertEquals(3, adjacencyMatrix.getVertexDegree("B"));
        assertEquals(2, adjacencyMatrix.getVertexDegree("C"));
        assertEquals(4, adjacencyMatrix.getVertexDegree("D"));
        assertEquals(2, adjacencyMatrix.getVertexDegree("E"));
    }

    @Test
    void testFindAllPath() {
        String[] vertex = {"A", "B", "C", "D", "E"};
        AdjacencyMatrix<String> adjacencyMatrix = new AdjacencyMatrix<>(vertex);
        adjacencyMatrix.addEdge(0, 1); /* A - B */
        adjacencyMatrix.addEdge(0, 2); /* A - C */
        adjacencyMatrix.addEdge(0, 3); /* A - D */
        adjacencyMatrix.addEdge(1, 3); /* B - D */
        adjacencyMatrix.addEdge(2, 3); /* C - D */
        adjacencyMatrix.addEdge(1, 4); /* B - E */
        adjacencyMatrix.addEdge(3, 4); /* D - E */
        assertEquals(
              "A->B->D->E, A->B->E, A->C->D->B->E, A->C->D->E, A->D->B->E, A->D->E",
              String.join(", ", adjacencyMatrix.findAllPath("A", "E"))
      );

        assertNull(adjacencyMatrix.findAllPath("A", "F"));

    }
}
