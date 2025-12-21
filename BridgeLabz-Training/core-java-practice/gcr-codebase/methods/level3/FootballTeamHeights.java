public class FootballTeamHeights {

    // Generate random heights for players
    public int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    // Find sum of heights
    public int sumHeights(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // Find mean height
    public double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    // Find shortest height
    public int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            min = Math.min(min, heights[i]);
        }
        return min;
    }

    // Find tallest height
    public int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeamHeights team = new FootballTeamHeights();
        int[] heights = team.generateRandomHeights(11);

        // Display player heights
        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Display mean, shortest, and tallest heights
        System.out.println("Mean Height: " + team.meanHeight(heights));
        System.out.println("Shortest Height: " + team.shortestHeight(heights));
        System.out.println("Tallest Height: " + team.tallestHeight(heights));
    }
}
