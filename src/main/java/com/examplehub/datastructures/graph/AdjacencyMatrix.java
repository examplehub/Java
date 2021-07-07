package com.examplehub.datastructures.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

public class AdjacencyMatrix<E> {
  private final E[] vertex;
  private final int[][] adj;
  private final boolean[] visited;
  int numOfVertex;
  private final StringJoiner dfsPath = new StringJoiner("->");
  public AdjacencyMatrix(E[] vertex) {
    this.vertex = vertex;
    this.numOfVertex = vertex.length;
    this.adj = new int[numOfVertex][numOfVertex];
    this.visited = new boolean[numOfVertex];
  }

  public AdjacencyMatrix(E[] vertex, int[][] adj) {
    this.vertex = vertex;
    this.adj = adj;
    this.numOfVertex = vertex.length;
    this.visited = new boolean[numOfVertex];
  }

  public void addEdge(int i, int j) {
    adj[i][j] = adj[j][i] = 1;
  }

  public void deepFirstSearch(int start) {
    dfsPath.add(vertex[start].toString());
    visited[start] = true;
    for (int i = 0; i < numOfVertex; ++i) {
      if (adj[start][i] == 1 && !visited[i]) {
        deepFirstSearch(i);
      }
    }
  }

  public int getVertexDegree(E v) {
    int row = -1;
    for (int i = 0; i < numOfVertex; i++) {
      if (vertex[i].equals(v)) {
        row = i;
      }
    }
    int sum = 0;
    for (int i = 0; i < numOfVertex; ++i) {
      sum += adj[row][i];
    }
    return sum;
  }

  public String dfsPath() {
    if (dfsPath.length() == 0) {
      deepFirstSearch(0);
    }
    return dfsPath.toString();
  }

  List<String> findAllPath(E startVertex, E endVertex) {
    int start = -1;
    int end = -1;
    for (int i = 0; i < numOfVertex; ++i) {
      if (startVertex == vertex[i]) {
        start = i;
      }
      if (endVertex == vertex[i]) {
        end = i;
      }
    }
    return (start == -1 || end == -1) ? null : findAllPath(start, end);
  }

  private List<String> findAllPath(int start, int end) {
    List<String> allPath = new ArrayList<>();
    Stack<E> stack = new Stack<>();
    boolean[] visited = new boolean[vertex.length];
    doFindAllPath(allPath, stack, visited, start, end);
    return allPath;
  }

  void doFindAllPath(List<String> allPath, Stack<E> stack, boolean[] visited, int start, int end) {
    stack.push(vertex[start]);
    visited[start] = true;
    if (start == end) {
      StringJoiner joiner = new StringJoiner("->");
      for (E item : stack) {
        joiner.add(item.toString());
      }
      allPath.add(joiner.toString());
      stack.pop();
      visited[start] = false;
      return;
    }

    for (int i = 0; i < numOfVertex; ++i) {
      if (adj[start][i] == 1 && !visited[i]) {
        doFindAllPath(allPath, stack, visited, i, end);
      }
    }
    stack.pop();
    visited[start] = false;
  }
}
