import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertValue("1");
        linkedList.insertValue("2");
        linkedList.insertValue("3");
        linkedList.insertValue("4");
        linkedList.insertValue("5");
        linkedList.insertValue("6");

        System.out.println(linkedList);

        while (linkedList.hasNext()){
            System.out.println(linkedList.get());
        }
        

        MyArraylist myArraylist = new MyArraylist();
        myArraylist.add("1");
        myArraylist.add("2");
        myArraylist.add("3");
        myArraylist.add("4");
        System.out.println(myArraylist);
        System.out.println(myArraylist.size());
        myArraylist.printSize();
        myArraylist.add("5");
        System.out.println(myArraylist);
        System.out.println(myArraylist.size());
        myArraylist.printSize();
    }
}
