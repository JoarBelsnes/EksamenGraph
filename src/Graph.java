import java.util.*;

//inspirert av kode fra: https://www.softwaretestinghelp.com/java-graph-tutorial/
public class Graph {
    List<List<Island>> adj_list = new ArrayList<>();
    public Graph(List<Edge> edges){

        // adjacency list minne allokering
        for (int i = 0; i < edges.size(); i++)
            adj_list.add(i, new ArrayList<>());


        // Legger til de forskjellige broer til grafen
        for (Edge e : edges)
        {
            // Allokerer hver øy sine broer inn i adjacency listen
            adj_list.get(e.src).add(new Island(e.dest, e.weight));
        }

    }
}
