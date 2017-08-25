package prog.kiev.ua.homework.Module8.Queue;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("DynamicArrayQueue");
        DynamicArrayQueue<Integer> dynamicArrayQueue =
                new DynamicArrayQueue<>(0,1,2,3,4,5,6,7,8,9);
        dynamicArrayQueue.offer(11);
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.remove());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.poll());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.element());
        System.out.println(dynamicArrayQueue.peek());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.isEmpty());
        System.out.println(dynamicArrayQueue.contains(8));

    }
}
