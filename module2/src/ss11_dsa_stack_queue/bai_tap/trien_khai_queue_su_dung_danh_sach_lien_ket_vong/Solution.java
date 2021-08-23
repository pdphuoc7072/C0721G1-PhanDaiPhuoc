package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Solution {
    public void enQueue (Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = queue.rear = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }
    public void deQueue (Queue queue) {
        if (queue.front == null) {
            System.out.print("Queue is empty");
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = queue.rear = null;
            System.out.print("Deleted element: " + value + "\n");
        } else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
            System.out.print("Deleted element: " + value + "\n");
        }
    }
    public void displayQueue (Queue queue) {
        Node temp = queue.front;
        System.out.print("Element in Queue: ");
        while (temp.link != queue.front) {
            System.out.print(temp.data + ", ");
            temp = temp.link;
        }
        System.out.print(temp.data + "\n");
    }
}
