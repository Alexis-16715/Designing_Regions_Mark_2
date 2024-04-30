package grafo_model;

import java.util.ArrayList;

public class Vertex {

    private String data;

    private ArrayList<Edge> edges;


    public Vertex(String data){
        this.data = data;
        this.edges = new ArrayList<Edge>();

    }


    public void addEdge(Vertex dest, Integer weight){
        this.edges.add(new Edge(this, dest, weight));
        // this.edges.add(new Edge(dest, this,weight));
    }

    public void removeEdge(Vertex dest){
        edges.removeIf(edge -> edge.getDest().equals(dest));
    }

    public String getData() {
        return data;
    }


}
