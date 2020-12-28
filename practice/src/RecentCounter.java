import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class RecentCounter {
    LinkedList<Integer> ans = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        ans.addLast(t);
        while (ans.getFirst()<t-3000)
            ans.removeFirst();
        return ans.size()-1;
    }
}
// 1 -> 10 -> 100 -> 1000 -> 2000 -> 3000 -> 4000
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */