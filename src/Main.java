public class Main {
    public static void main(String[]args){
        Queue myQueue = new Queue(1);

        myQueue.enqueue(2);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());



        //    myQueue.printQueue();

//        myQueue.getLast();
//        myQueue.getLength();

    }
}
