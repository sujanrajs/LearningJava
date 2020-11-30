package JavaFoundationPrograms;

public class Counter {
    int count=0;

    Counter(){
        count++;
    }

    private void showCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Counter().showCount();
        new Counter().showCount();
        new Counter().showCount();
    }
}
