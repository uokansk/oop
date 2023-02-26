package HomeWorkSem3;

public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(22);
        vectorList.add(15);
        vectorList.add(18);
        vectorList.add(25);
        vectorList.add(30);
        for (Integer item : vectorList) {
            System.out.println(item);
        }
        VectorList<String> vectorString = new VectorList<>();
        vectorString.add("first");
        vectorString.add("second");
        for (String item : vectorString) {
            System.out.println(item);
        }
    }
}
