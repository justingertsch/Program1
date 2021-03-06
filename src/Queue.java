import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by Justin Gertsch on 9/15/14.
 */
public class Queue
{
    private List<Object> list = null;

    Queue(List<Object> imp)
    {
        this.list = imp;
    }

    public void add(Object item)
    {
        this.list.add(item);
    }
    public Object get()
    {
        return this.list.get(0);
    }

    public void remove()
    {
        this.list.remove(0);
    }

    public int size()
    {
        return this.list.size();
    }

    public void clear()
    {
        this.list.clear();
    }

    public void changeImpl(List<Object> newImpl)
    {
        newImpl.clear();
        newImpl.addAll(this.list);
        this.list = newImpl;
    }

    public static void displayAndEmptyQueue(Queue impl)
    {
        int j = impl.size();
        for(int i = 0; i < j; i++)
        {
            System.out.print(impl.get()+" ");
            impl.remove();
        }
        System.out.println();

    }


    public static void main(String[] args)
    {
        // Do ints
        Queue q = new Queue(new ArrayList());
        q.add(1);
        q.add(2);
        LinkedList alist = new LinkedList();
        alist.add(3);
        q.changeImpl(alist);
        q.add(4);
        q.add(5);
        displayAndEmptyQueue(q);

        // Do strings

        Queue q2 = new Queue(new ArrayList());
        q2.add("1");
        q2.add("2");
        LinkedList alist2 = new LinkedList();
        alist2.add("3");
        q2.changeImpl(alist2);
        q2.add("4");
        q2.add("5");
        displayAndEmptyQueue(q2);
    }
}
