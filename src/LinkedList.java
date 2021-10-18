
public class LinkedList <T>{

    private Node firstValue;
    private Node current;
    private Node flag;
    private Node que;

    public LinkedList() {}

    public T getQue() {
        return (T) que.getValue();
    }

    public T getFirstValue() {
        return (T) firstValue.getValue();
    }

    public Node get() {
        Node prm = flag;
        flag = current;
        return prm;
    }

    public void deleteQueTail(){
        flag = firstValue;
        current = firstValue;
        while (true){
            if(current.getNext() != que){
                current = current.getNext();
            }else{
                current.setNext(null);
                que = current;
                current = firstValue;
                return;
            }
        }
    }

    public void deleteByValue(T value){
        flag = firstValue;
        current = firstValue;
        Node prev = current;
        if(current.getValue().equals(value)){
            firstValue = current.getNext();
            current.setNext(null);
            current = firstValue;
            return;
        }
        while (true){
            prev = current;
            current = current.getNext();
            if(current.getValue().equals(value)){
                prev.setNext(current.getNext());
                current = firstValue;
                return;
            }
        }
    }

    public void insertValue(T value){
        flag = firstValue;
        while (true){
            if(firstValue == null){
                firstValue = new Node();
                firstValue.setFirst(null);
                firstValue.setNext(null);
                firstValue.setValue(value);
                current = firstValue;
                return;
            }else if(current.getNext() == null){
                Node node = new Node();
                node.setValue(value);
                node.setNext(null);
                current.setNext(node);
                que = node;
                current = firstValue;
                return;
            }else if(firstValue.getNext() !=null){
                current = current.getNext();
            }
        }
    }

    public void insertValueAfter(T byValue, T insert){
        flag = firstValue;
        current = firstValue;
        while (true){
            if(current.getValue().equals(byValue)){
                Node newNode = new Node();
                newNode.setValue(insert);
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                current = firstValue;
                return;
            }else{
                current = current.getNext();
            }
        }
    }

    public boolean hasNext(){
        if(current != null){
            current = current.getNext();
            return true;
        }else if(current == null){
            current = firstValue;
            return false;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                " current=" + firstValue +
                '}';
    }

    private class Node <T>{
        private Node first;
        private T value;
        private Node next;

        public Node() {
        }

        public void setFirst(Node first) {
            this.first = first;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getFirst() {
            return first;
        }

        public T getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
