import java.util.Arrays;

public class NearbyElements {

    static int[][] multi = new int[][]{
            {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}
    };

    /*
     * Complete the 'nearby' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. INTEGER x 2. INTEGER y 3. INTEGER range
     */
    public static void main(String[] args) {
        nearby(1, 3, 5);

    }

    public static int[] nearby(int x, int y, int range) {
        if (range <= multi[x].length && y <= multi[x].length) {
            if ((multi[x].length - y) <= range && y <= range) {
                int indexOfNearbyElem = 0;
                int maxIndex = multi[x].length;
                int minIndex = 0;
                int lenNearbyElem = multi[x].length - 1;
                int[] nearbyElements = new int[lenNearbyElem];
                for (int i = minIndex; i < y; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                for (int i = y + 1; i < maxIndex; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                System.out.println(Arrays.toString(nearbyElements));
            }else if((multi[x].length - y) <= range && y >= range){
                int indexOfNearbyElem = 0;
                int maxIndex = multi[x].length;
                int minIndex = y - range;
                int lenNearbyElem = maxIndex - minIndex - 1 ;
                int[] nearbyElements = new int[lenNearbyElem];
                for (int i = minIndex; i < y; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                for (int i = y + 1; i < maxIndex; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                System.out.println(Arrays.toString(nearbyElements));
            }else if((multi[x].length - y) >= range && (y <= range)){
                int indexOfNearbyElem = 0;
                int maxIndex = y + range;
                int minIndex = 0;
                int lenNearbyElem = maxIndex - minIndex;
                int[] nearbyElements = new int[lenNearbyElem];
                for (int i = minIndex; i < y; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                for (int i = y + 1; i <= maxIndex; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    System.out.println(multi[x][i]);
                    indexOfNearbyElem++;
                }
                System.out.println(Arrays.toString(nearbyElements));
            }else if(((multi[x].length - y) >= range) && (y >= range)){
                int indexOfNearbyElem = 0;
                int maxIndex = y + range;
                int minIndex = y - range;
                int lenNearbyElem = maxIndex - minIndex;
                int[] nearbyElements = new int[lenNearbyElem];
                for (int i = minIndex; i < y ; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                for (int i = y + 1; i <= maxIndex; i++) {
                    nearbyElements[indexOfNearbyElem] = multi[x][i];
                    indexOfNearbyElem++;
                }
                System.out.println(Arrays.toString(nearbyElements));
            }
        }else{
            System.out.println("Error!! The length of the array is [" + multi[x].length + "]. The RANGE ["+ range+"] or INDEX ["+ y +"] must be less than or equal to length!!!");
        }
        int[] results = new int[0]; //you should replace '0' with something else.
        return results;
    }
}




