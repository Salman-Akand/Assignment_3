import java.awt.*;

public class ConstructRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5,5,9,8);
        Rectangle rec2 = new Rectangle(9,9,12,10);
        System.out.println("Rec1's width is: "+rec1.getWidth()+" and Rec1's height is: " +rec1.getHeight());
        System.out.println("Rec2's width is: "+rec2.getWidth()+" and Rec2's height is: " +rec2.getHeight());
    }
}
