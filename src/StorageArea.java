import java.util.Stack;

public class StorageArea {
    private Stack<Box> stack;

    public StorageArea() {
        this.stack = new Stack<>();
    }

    public void push(Box box) {
        stack.push(box);
    }

    public Box pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public int getStoredBoxesCount() {
        return stack.size();
    }
}
