package customlist;
import java.util.Arrays;

public class Collection_List<List1> 
{
    private int size = 0;
    private static final int CAPACITTY = 10;
    private Object items[ ];
    public Collection_List() 
    {
        items = new Object[CAPACITTY];
    }
    public void add(List1 l)
    {
        if (size == items.length)
        {
            CheckCapacity();
        }
        items[size++] = l;
    }

    @SuppressWarnings("unchecked")
	public List1 get(int i)
    {
        if (i >= size || i < 0) 
        {
            throw new IndexOutOfBoundsException("Position " + i + ", Size " + i);
        }
        return (List1) items[i];
    }
    @SuppressWarnings("unchecked")
	public List1 remove(int i) 
    {
        if (i >= size || i < 0)
        {
            throw new IndexOutOfBoundsException("Position " + i + ", Size " + i);
        }
        Object item = items[i];
        int no_of_elements = items.length - ( i + 1 ) ;
        System.arraycopy( items, i + 1, items, i, no_of_elements ) ;
        size--;
        return (List1) item;
    }
    public int size() {
        return size;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(items[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void CheckCapacity() {
        int newSize = items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }
}