package lb5;
public class BstToQueueClient {
    public static void main(String[] args) {
        BST<Date, String> bst = new BST<>();
        MinPQueue<Date> pq = new MinPQueue<>();
        People generator = new People();
        int MAX = 500;
        Date minDate = null;

        // generate random data to bst
        // save min date to future checking
        for (int i = 0; i < MAX; i++) {
            Date date = new Date();
            String person = generator.generatePerson();
            if (minDate == null)
                minDate = date;
            else if (minDate.compareTo(date) < 0)
                minDate = date;
            bst.put(date, person);
        }

        bst.convertToQueue(pq);

        System.out.println("****************");
        System.out.println("Saved Min date: " + minDate);
        System.out.println("Min key -> value in BST: " + bst.min() + " -> " + bst.getMin());
        System.out.println("Min date in Queue: " + pq.min());
    }
}
