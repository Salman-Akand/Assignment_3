public class UseTrimRunner {
    public static void main(String[] args) {
        String something = "   Object oriented programming ";
        UsingTrim show = new UsingTrim();
        System.out.println(show.useTrim(something));
        System.out.println(show.removeAfterString(something));
    }
}
