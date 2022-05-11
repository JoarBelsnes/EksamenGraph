
//inspirert av kode fra: https://www.softwaretestinghelp.com/java-graph-tutorial/
public class Edge {
    int src, dest, weight;
    Edge(int src, int dest, int weight) {
        //der broen kommer fra
        this.src = src;
        //der broen går
        this.dest = dest;
        //vedlikeholdskostnaden
        this.weight = weight;
    }
}
