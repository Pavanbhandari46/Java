import java.util.Scanner;
public class BellmanFord
{
private int d[];
private int n;
public static final int MAX_VALUE = 999;
public BellmanFord(int n)
{
this.n = n;
d = new int[n + 1];
}
public void BellmanFordEvaluation(int s, int adj[][])
{
for (int node = 1; node <= n; node++)
{
d[node] = MAX_VALUE;
}
d[s] = 0;
for (int node = 1; node <= n - 1; node++)
{
for (int snode = 1; snode <= n; snode++)
{
for (int dest= 1; dest<= n; dest++)
{
if (adj[snode][dest] != MAX_VALUE)
{
if (d[dest] > d[snode] 
+ adj[snode][dest])
d[dest] =d[snode]
+ adj[snode][dest];
}
}
}
}
for (int snode = 1; snode <= n; snode++)
{
for (int dest= 1; dest<= n; dest++)
{
if (adj[snode][dest] != MAX_VALUE)
{
if (d[dest] >d[snode]
+ adj[snode][dest])
System.out.println("The Graph contains negative egde cycle");
}
}
}
for (int v = 1; v <= n; v++)
{
System.out.println("distance of source  " + s + " to "

+ v + " is " +d[v]);
}
}
public static void main(String[] arg)
{
int n = 0;
int s;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of vertices");
n = scanner.nextInt();
int adj[][] = new int[n + 1][n + 1];
System.out.println("Enter the adjacency matrix");
for (int snode = 1; snode <= n; snode++)
{
for (int dest= 1; dest<= n; dest++)
{
adj[snode][dest] = scanner.nextInt();
if (snode == dest)
{
adj[snode][dest] = 0;
continue;
}
if (adj[snode][dest] == 0)
{
adj[snode][dest] = MAX_VALUE;

}
}
}
System.out.println("Enter the source vextex");
s = scanner.nextInt();
BellmanFord bellmanford = new BellmanFord(n);
bellmanford.BellmanFordEvaluation(s, adj);
scanner.close();    
}
}