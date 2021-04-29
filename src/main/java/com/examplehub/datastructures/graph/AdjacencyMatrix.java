package com.examplehub.datastructures.graph;

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
}
