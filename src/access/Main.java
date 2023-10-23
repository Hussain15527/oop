package access;

public class Main {
    public static void main(String[] args) {
        A a = new A(12, "hell");
        System.out.println(a.getArr());
        a.setArr(3, 10);
        
        System.out.println(a.getArr());
        System.out.println(a.a);
    }
}
