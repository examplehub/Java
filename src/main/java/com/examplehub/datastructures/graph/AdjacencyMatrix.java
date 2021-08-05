package com.examplehub.datastructures.graph;

import java.util.*;

public class AdjacencyMatrix<E> {
  private final E[] vertex;
  private final int[][] adj;
  int numOfVertex;

  public AdjacencyMatrix(E[] vertex) {
    this.vertex = vertex;
    this.numOfVertex = vertex.length;
    this.adj = new int[numOfVertex][numOfVertex];
  }

  public AdjacencyMatrix(E[] vertex, int[][] adj) {
    this.vertex = vertex;
    this.adj = adj;
    this.numOfVertex = vertex.length;
  }

  public void addEdge(int i, int j) {
    adj[i][j] = adj[j][i] = 1;
  }

  public void removeEdge(int i, int j) {
    adj[i][j] = adj[j][i] = 0;
  }

  public void deepFirstSearch(StringJoiner joiner, int start, boolean[] visited) {
    joiner.add(vertex[start].toString());
    visited[start] = true;
    for (int i = 0; i < numOfVertex; ++i) {
      if (adj[start][i] == 1 && !visited[i]) {
        deepFirstSearch(joiner, i, visited);
      }
    }
  }

  private int getVertexIndex(E v) {
    for (int i = 0; i < numOfVertex; ++i) {
      if (vertex[i].equals(v)) {
        return i;
      }
    }
    return -1;
  }

  public int getVertexDegree(E v) {
    int index = getVertexIndex(v);
    int sum = 0;
    for (int j = 0; j < numOfVertex; ++j) {
      sum += adj[index][j];
    }
    return sum;
  }

  public String dfsPath() {
    StringJoiner joiner = new StringJoiner("->");
    boolean[] visited = new boolean[numOfVertex];
    deepFirstSearch(joiner, 0, visited);
    return joiner.toString();
  }

  public String bfsPath() {
    StringJoiner joiner = new StringJoiner("->");
    boolean visited[] = new boolean[numOfVertex];
    breadthFirstSearch(joiner, 0);
    return joiner.toString();
  }

  private void breadthFirstSearch(StringJoiner joiner, int start) {
    boolean[] visited = new boolean[numOfVertex];
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(start);
    visited[start] = true;
    while (!queue.isEmpty()) {
      int popIndex = queue.poll();
      joiner.add(vertex[popIndex].toString());
      for (int j = 0; j < numOfVertex; ++j) {
        if (adj[popIndex][j] == 1 && !visited[j]) {
          queue.offer(j);
          visited[j] = true;
        }
      }
    }
  }

  List<String> findAllPath(E startVertex, E endVertex) {
    int start = getVertexIndex(startVertex);
    int end = getVertexIndex(endVertex);
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
