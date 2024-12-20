package MainLesson.Lesson22;


import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1 ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(2333);
        list.add(55);
        list.add(4,122);

        System.out.println(list.get(2));
        System.out.println("--------------");

        System.out.println("--------------");

        for (Integer number : list) {
            System.out.println(number);

        }

        System.out.println("---------------------------------------------------------------");

        //2 LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(56);
        linkedList.add(0);
        linkedList.add(23);
        linkedList.add(435);
        linkedList.add(4,22);

        System.out.println(linkedList.get(2));
        System.out.println("--------------");

        System.out.println("--------------");

        for (Integer number : linkedList) {
            System.out.println(number);

        }
        System.out.println("---------------------------------------------------------------");

//        2 Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(34);
        stack.push(98);
        stack.push(1);
        stack.push(99);

        System.out.println("--------------");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("--------------");
        for (Integer number : stack) {
            System.out.println(number);
        }
        System.out.println("---------------------------------------------------------------");

//       3 Queue
        Queue<Integer> priorityQueue = new PriorityQueue<>();// ascending order
        priorityQueue.add(15);
        priorityQueue.add(9);
        priorityQueue.add(12);
        priorityQueue.add(6767);
        priorityQueue.add(99);
        System.out.println("--------------");
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        System.out.println("--------------");
        for (Integer number : priorityQueue) {
            System.out.println(number);
        }
        System.out.println("---------------------------------------------------------------");

//        4 Dequeue
        Deque<Integer> dequeue = new ArrayDeque<>();// can add first or last element
        dequeue.add(11);
        dequeue.add(367);
        dequeue.add(0);
        dequeue.add(21);
        dequeue.add(11);
        dequeue.addFirst(55);
        dequeue.addLast(88);

        System.out.println(dequeue.peek());
        dequeue.poll();
        System.out.println(dequeue.peek());
        System.out.println("--------------");
        for (Integer number : dequeue) {
            System.out.println(number);
        }
        System.out.println("---------------------------------------------------------------");

//        5 Set: HashSet
        Set<String> set = new HashSet<>();
        set.add("Natasha");
        set.add("Tony");
        set.add("Wanda");
        set.add("Bucky");
        set.add("Peter");
        set.add("Wanda");
        set.add(null);
        set.add("Agatha");

        System.out.println("--------------");
        for (String name : set) {
            System.out.println(name);
        }
        System.out.println("---------------------------------------------------------------");

//        5 LinkedHashSet
        Set<String> linkedSet = new LinkedHashSet<>();//insertion order
        linkedSet.add("Elena");
        linkedSet.add("Tony");
        linkedSet.add("Wanda");
        linkedSet.add("Bucky");
        linkedSet.add("Peter");
        linkedSet.add("Wanda");
        linkedSet.add(null);
        linkedSet.add("Agatha");

        System.out.println("--------------");
        for (String name : linkedSet) {
            System.out.println(name);
        }
        System.out.println("---------------------------------------------------------------");

//       6 TreeSet
        Set<String> tree = new TreeSet<>();// cannot be null// ascending order
        tree.add("Yekaterina");
        tree.add("Putin");
        tree.add("Stalin");
        tree.add("KIm nem ne");
        tree.add("Roosevelt");

        System.out.println("--------------");
        for (String name : tree) {
            System.out.println(name);
        }
    }
}
