public class stringReplaceRunner {
    public static void main(String[] args) {
        stringReplace ob1 = new stringReplace();
        System.out.println(ob1.replaceI().length());
        System.out.println(ob1.replaceSS(ob1.replaceI()).length());
    }
}
