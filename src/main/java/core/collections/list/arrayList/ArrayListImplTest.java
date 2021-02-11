package core.collections.list.arrayList;

public class ArrayListImplTest {

    public static void main(String[] args) {

        ArrayListImpl<String> list = new ArrayListImpl<>();

        list.add("Hello world!0");
        list.add("Hello world!1");
        list.add("Hello world!2");
        list.add("Hello world!3");
        list.add("Hello world!4");
        list.add("Hello world!5");
        list.add("Hello world!6");
        list.add("Hello world!7");
        list.add("Hello world!8");

        list.add(4, "wow");

        System.out.println(
                list.get(0) + ", " + list.get(1) + ", " + list.get(2) + ", " + list.get(3) + ", "
                + list.get(4) + ", " + list.get(5) + ", " + list.get(6) + ", "
                + list.get(7) + ", " + list.get(8));

        list.remove(4);

        System.out.println(
                list.get(0) + ", " + list.get(1) + ", " + list.get(2) + ", " + list.get(3) + ", "
                        + list.get(4) + ", " + list.get(5) + ", " + list.get(6) + ", "
                        + list.get(7));
    }

}
