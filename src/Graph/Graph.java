package Graph;
import java.util.*;
public class Graph {
    public Map<Integer,Set<Integer>> edges=new TreeMap<>();

    public void addNode(int u){
        if(!edges.containsKey(u)){
            edges.put(u,new TreeSet<Integer>());
        }
    }

    public void removeNode(int u){
        if(edges.containsKey(u)){
            for(int v:edges.get(u)){
                edges.get(v).remove(u);
            }
            edges.remove(u);
        }
    }
    public void addEdge(int u,int v){
        addNode(u);
        addNode(v);
        edges.get(u).add(v);
        edges.get(v).add(u);
    }

    public void removeEdge(int u,int v){
        edges.get(u).remove(v);
        edges.get(v).remove(u);

    }
}
