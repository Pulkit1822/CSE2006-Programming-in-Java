import java.util.*;

public class Main {
    public static int findMinimumClicks(HashMap<Integer, List<Integer>> webPages, int startPage, int endPage) {
        if (startPage == endPage) {
            return 0;
        }
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> distance = new HashMap<>();
        q.add(startPage);
        distance.put(startPage, 0);
        while (!q.isEmpty()) {
            int currentPage = q.poll();
            for (int linkedPage : webPages.get(currentPage)) {
                if (linkedPage == endPage) {
                    return distance.get(currentPage) + 1;
                }
                if (!distance.containsKey(linkedPage)) {
                    distance.put(linkedPage, distance.get(currentPage) + 1);
                    q.add(linkedPage);
                }
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            scanner.nextLine(); 

            HashMap<Integer, List<Integer>> webPages = new HashMap<>();

            for (int i = 1; i <= N; i++) {
                String line = scanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    while (lineScanner.hasNextInt()) {
                        int linkedPage = lineScanner.nextInt();
                        webPages.computeIfAbsent(i, k -> new ArrayList<>()).add(linkedPage);
                    }
                }
            }

            int startPage = scanner.nextInt();
            int endPage = scanner.nextInt();
            int minClicks = findMinimumClicks(webPages, startPage, endPage);
            System.out.println(minClicks);
        }
    }
}
