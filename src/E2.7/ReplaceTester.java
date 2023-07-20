public class ReplaceTester {
    public static void main(String[] args) {
        String state = "mississippi";
        state = state.replace("i","!").replace("s","$");
        System.out.println("Expected String: m!$$!$$!pp!");
        System.out.println("Actual string: "+state);
    }
}
