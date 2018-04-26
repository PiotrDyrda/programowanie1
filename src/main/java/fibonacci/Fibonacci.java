package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private Map<Integer, Integer> seen;

    public Fibonacci() {
        seen = new HashMap<>();
    }

    public Integer get(Integer n) {
        if(seen.containsKey(n)) {
            return seen.get(n);
        }
        if(n <= 2) {
            return 1;
        }
        Integer fib = get(n-1) + get(n-2);
        seen.put(n, fib);
        return fib;
    }
}

