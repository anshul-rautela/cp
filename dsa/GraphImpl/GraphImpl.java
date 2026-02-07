package GraphImpl;
import java.util.ArrayList;

class Edge{
    int to;
    int weight;
    public Edge(int to , int wt){
        this.to = to;
        this.weight= wt;
    }
}


class Graph{
    int n;
    ArrayList<ArrayList<Edge>>adj = new ArrayList<>();
    Graph(int n){
        for(int i =0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
    }
}


public class GraphImpl {

    
    
    public static void main(String[] args) {
        int n =4;
        Graph  g = new Graph(n);
        g.adj.get(3).add(new Edge(1,10));
        g.adj.get(1).add(new Edge(3,10));
    
        g.adj.get(2).add(new Edge(1,20));
        g.adj.get(1).add(new Edge(2,20));
    
        g.adj.get(3).add(new Edge(4,60));
        g.adj.get(4).add(new Edge(3,60));
    
        g.adj.get(3).add(new Edge(4,90));
        g.adj.get(4).add(new Edge(3,90));
    

        for(int i =0;i<n+1;i++){
            System.out.println();
            System.out.print(i+": ");
            for(int j =0;j<g.adj.get(i).size();j++){
                System.out.print(g.adj.get(i).get(j).to+" "+g.adj.get(i).get(j).weight+"  ");
            }
        }




    }



}
