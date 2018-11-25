
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 0, 2, 5, 6, 1, 3, 2, 4, 6, 9, 0};
        
        Histogram hist = new Histogram(data);
        Map<Integer, Integer> histogr = hist.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
}
