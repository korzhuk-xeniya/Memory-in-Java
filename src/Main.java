public class Main {
    public static Integer chargeValue(Integer value) {
        value = 22;
        return value;
    }

    public static void main(String[] args) {
        Integer value = 33;
        chargeValue(value);
        System.out.println(value);
        System.out.println(chargeValue(value));
    }
}