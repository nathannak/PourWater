public class Main {

    public static void main(String[] args) {

        // V -> number of drops
        // K -> index to dop at
        int[] arr = pourWater(new int[]{2,1,1,2,1,2,2},4,3);

        for(int i : arr)
            System.out.print(" -> "+i);

    }

    public static int[] pourWater(int[] heights, int V, int K) {

        for(int i = 0; i < V; i++) {
            int cur = K;
            // Move left
            while(cur > 0 && heights[cur] >= heights[cur - 1]) {
                cur--;
            }
            // Move right
            while(cur < heights.length - 1 && heights[cur] >= heights[cur + 1]) {
                cur++;
            }
            // Move left to K
            while(cur > K && heights[cur] == heights[cur - 1]) {
                cur--;
            }
            heights[cur]++;
        }

        return heights;

    }

}
