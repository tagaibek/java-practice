package acmp.problem_queue;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QueueElement {
    public static void main(String[] args) throws IOException {
        int q = AdylUtils.readInt();
        Scanner scanner = new Scanner(System.in);
        List<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= q - 1; i++) {
            int x = scanner.nextInt();
            if (x == 1) { //enqueue
                int a = scanner.nextInt();
                queue.add(a);
            }
            if (x == 2) { //dequeue
                queue.remove(0);
            }
            if (x == 3) { //print
                System.out.println(queue.get(0));
            }
        }
    }
}
