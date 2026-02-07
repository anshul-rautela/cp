import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int to;
    int weight;
    Node(int to,int weight){
        this.to= to;
        this.weight = weight;
    }
}
class Graph{
    int n;
    ArrayList<ArrayList<Node>>adj = new ArrayList<>();
    Graph(int n){
        for(int i =0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int src, int dest,int weight){
        adj.get(src).add(new Node(dest, weight));
        adj.get(dest).add(new Node(src, weight));
    }
}


public class dfs {

    public static void dfsAlgo(Graph g, int src,int vis[]){
        vis[src]=1;
        System.out.print(src+" ");
        for(int i =0;i<g.adj.get(src).size();i++){
            int dest = g.adj.get(src).get(i).to;            
            if(0==vis[dest]){
                dfsAlgo(g, dest, vis);
            }
        }
    }

    public static void main(String[] args) {

        //Graph details
        //  n = 5;
        //  src = 0;

        //  0-1-2  d 
        //  1-0-5  d
        //  2-0-4  d 
        //  3-5     d
        //  5-3-1
        int n =5;
        Graph g = new Graph(n);
        g.addEdge(0,1, 10);
        g.addEdge(0,2, 50);
        
        g.addEdge(1,5, 20);
        g.addEdge(4,2, 100);
        
        g.addEdge(3,5, 150);


        int src = 0;
        int vis[] = new int[n+1];
        // System.out.println("");
        dfsAlgo(g,src,vis);


    }


}
