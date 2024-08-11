import java.util.*;

public class DFS {
    private static void dfs(Map<Character, List<Character>> graph, char start, Set<Character> visited) {
        visited.add(start);
        System.out.print(start + " ");

        List<Character> neighbors = graph.get(start);
        if (neighbors != null) {
            for (char neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    dfs(graph, neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the graph represented as an adjacency list
        Map<Character, List<Character>> graph = new HashMap<>();

        System.out.print("Enter the number of vertices in the graph (alphabetic characters only): ");
        int vertices = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Initialize adjacency lists for each vertex
        for (char c = 'A'; c < 'A' + vertices; c++) {
            graph.put(c, new ArrayList<>());
        }

        // Add edges
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the edges (source destination):");
        for (int i = 0; i < edges; i++) {
            String edge = scanner.nextLine();
            char source = edge.charAt(0);
            char destination = edge.charAt(2);
            graph.get(source).add(destination);
            // For undirected graphs, you can add the reverse edge too
            // graph.get(destination).add(source);
        }

        System.out.print("Enter the starting vertex for DFS (alphabetic character only): ");
        char startVertex = scanner.next().charAt(0);

        scanner.close();

        // Perform DFS traversal
        Set<Character> visited = new HashSet<>();
        System.out.println("DFS traversal starting from vertex " + startVertex + ":");
        dfs(graph, startVertex, visited);
    }
}
