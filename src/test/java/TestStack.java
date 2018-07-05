import org.junit.Assert;
import org.junit.Test;

public class TestStack {
    @Test
    public void TestInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(3);
        stack.push(8);
        stack.push(4);
        stack.push(7);
        int size = stack.size();
        Assert.assertEquals(4,size);
        stack.pop();
        stack.pop();
        stack.pop();
        int size2 = stack.size();
        Assert.assertEquals(1,size2);
    }

    @Test
    public void TestEmpty() {
        MyGenericStack myGenericStack = new MyGenericStack();

        Assert.assertEquals(true, myGenericStack.isEmpty());
    }
    @Test
    public void TestNotEmpty() {
        MyGenericStack myGenericStack = new MyGenericStack();
        myGenericStack.push(3);
        myGenericStack.push(8);
        myGenericStack.push(4);

        Assert.assertEquals(false, myGenericStack.isEmpty());
    }
}
