import java.util.*;

public class Main {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.addButton(new Button("A", true));
        ctrl.addButton(new Button("B", false));
        ctrl.addButton(new Button("X", false));
        ctrl.addButton(new Button("Y", true));
        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
        ctrl.pressAll();
        System.out.println("Number of pressed buttons, after press all:" + ctrl.getNumOfPressedBtns());
        ctrl.releasesAll();
        System.out.println("Number of pressed buttons, after releaseing all:" + ctrl.getNumOfPressedBtns());
    }
}
