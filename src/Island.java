
//inspirert av kode fra: https://www.softwaretestinghelp.com/java-graph-tutorial/
public class Island {

        int value, cost;
        String name;

        Island(int value, int cost)  {
            this.value = value;
            this.cost = cost;
            //legger til hvert øy navn
            this.name = value + " Island";
        }
    }

