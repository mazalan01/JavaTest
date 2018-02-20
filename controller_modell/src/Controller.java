import java.util.*;

public class Controller {
    private ArrayList<Button> buttons;

    public Controller() {
        buttons = new ArrayList<>();
    }

    public void addButton(Button b) {
        buttons.add(b);
    }

    public void pressAll() {
        for (Button b : buttons) {
            b.setState(true);
        }
    }

    public void releasesAll() {
        for (Button b : buttons) {
            b.setState(false);
        }
    }

    public int getNumOfPressedBtns() {
        int ret = 0;
        for (Button b : buttons) {
            if (b.getState()) ret++;
        }
        return ret;
    }
}
