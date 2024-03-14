import java.util.LinkedList;
 class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("ABC");
        l.add("OEF");
        l.add("GHJ");
        System.out.println(l);
        l.remove("GHJ");
        System.out.println(l);
    }
}
