import java.util.*;

public class Dijkstra {
    //inspirert av https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/
    //disse klassevariablene refererer til den øyen algoritmen er på
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Island> pq;
    // Mengde øyer
    private int V;
    List<List<Island> > adj;
    public Dijkstra (){
        // V er nåverende øy du er på
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Island>(V, new Island());

    }

    public void dijkstra(List<List<Island> > adj, int src)
    {
        this.adj = adj;
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
        // Legger startsted for hvilke øy du starter reisen fra inn i pq
        pq.add(new Island(src, 0));

        // kostnaden fra startsted til startsted er 0
        dist[src] = 0;

        while (settled.size() != V) {
            //Terminerer sjekking når pq er tom
            if (pq.isEmpty())
                return;

            //sletter øyen med minst distanse fra priority køen
            int u = pq.remove().value;

            //når distansen er funne legger det til i settled
            if (settled.contains(u))

                //fortsett nøkkelord for å hoppe over kjøring av følgene sjekk
                continue;

            settled.add(u);

        }
    }
}
