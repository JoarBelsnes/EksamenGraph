public class Dijkstra2 {

    public static int[] dijkstrasShortestPath(Graph g, int src)
    {
        //billigst rute blir lagret her
        int[] distance = new int[g.numOfvertices];
        //en array som sier om billigste rute av øya har blitt funne
        boolean[] visited = new boolean[g.numOfvertices];

        //inisialiserer arraysene
        for(int i=0; i<g.numOfvertices; i++)
        {
            //begynner å definere en evig distanse
            distance[i] = Integer.MAX_VALUE;
            //ikke funnet billigste rute for noen av øyene
            visited[i] = false;
        }
        distance[src] = 0;

        for(int i=0; i<g.numOfvertices; i++)
        {
            //velger billigste øy som er sammenkoblet med nåverende
            int closestVertex = getClosestVertex(distance, visited);
            //Visst prisen er evig er det ingen øyer så returnerer den
            return;
            if(closestVertex == Integer.MAX_VALUE)
                return distance;

            visited[closestVertex] = true;
            for(int j=0; j<g.numOfvertices; j++)
            {
                //visst den billigse distansen fra øy j ikke blitt ferdilaget kjør
                if(visited[j] == false)
                {
                    if(g.adjMatrix[closestVertex][j] != 0)
                    {
                        int d = distance[closestVertex] + g.adjMatrix[closestVertex][j];
                        if(d < distance[j])//distance via closestVertex is less than the initial distance
                            distance[j] = d;
                    }
                }
            }
        }
        return distance;
    }
}
