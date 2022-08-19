package com.abhisheksingh.dsa;
//Takes N^2 array accesses to process sequence of N union commands on N objects
//Quadratic algorithms do not scale
// Quick find defect Union is too expensive

public class QuickFind {

    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);
        quickFind.union(3,4);
        System.out.println("Are they connected ?" + quickFind.connected(3,4));
    }
    private final int[] id;

    public QuickFind(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }

        }
    }
}
