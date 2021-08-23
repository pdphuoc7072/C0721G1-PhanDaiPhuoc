package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class SolutionTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = null;
        queue.rear = null;
        Solution solution = new Solution();
        solution.enQueue(queue, 14);
        solution.enQueue(queue, 22);
        solution.enQueue(queue, -6);
        solution.displayQueue(queue);
        solution.deQueue(queue);
        solution.displayQueue(queue);
        solution.deQueue(queue);
        solution.displayQueue(queue);
        solution.enQueue(queue, 9);
        solution.displayQueue(queue);
        solution.enQueue(queue, 20);
        solution.displayQueue(queue);

    }

}
