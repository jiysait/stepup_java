package structure.sll;

import java.io.Serializable;

/**
 *
 * @author Jongil Yoon
 *
 */
public class SLL implements List, Serializable {
//    private static final long serialVersionUID = -724162139517834265L;
    // attributes
    private SLLNode head;
    private int size;

    @Override
    public void append(Object data)
    {
        SLLNode newNode = new SLLNode(data);
        if (isEmpty())
        {
            head = newNode;
            // size++;
        } else
        {
            SLLNode lastNode = getNodeAt();
            lastNode.next = newNode;
            // size++;
        }
        size++;
    }

    private SLLNode getNodeAt()
    {
        if (isEmpty())
        {
            return null;
        }
        SLLNode lastNode = head;
        while (lastNode.next != null)
        {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    @Override
    public void add(Object data)
    {
        append(data);
    }

    @Override
    public void add(Object data, int index) throws IndexOutOfBoundsException
    {
        // if index is negative or greater than size
        // throw IndexOutOfBoundsException
        // if index == size
        // append
        // else if index == 0
        // prepend
        // else
        // create a new node using the data
        // get the previous node (the node at index - 1)
        // new node's next should point to previous's next
        // previous node's next should point to new node
        // increament size

        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }

        if (index == size)
        {
            append(data);
        } else if (index == 0)
        {
            prepend(data);
        } else
        {
            SLLNode newNode = new SLLNode(data);
            newNode.next = getNodeAt(index - 1).next;
            getNodeAt(index - 1).next = newNode;
            size++;
        }
    }

    @Override
    public void prepend(Object data)
    {
        // add to beginning
        if (isEmpty())
        {
            append(data);
        } else
        {
            SLLNode newNode = new SLLNode(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    @Override
    public void set(Object data, int index) throws IndexOutOfBoundsException
    {
        // replace item at a certain index
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }

        if (size == 0)
        {
            if (index == 0)
            {
                add(data);
            }
        } else
        {
            SLLNode newNode = new SLLNode(data);
            newNode.next = getNodeAt(index).next;
            if (index == 0)
            {
                head = newNode;
            }
            else
            {
                getNodeAt(index - 1).next = newNode;
            }
            // size++;
        }
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }

        SLLNode node = getNodeAt(index);
        return node.element;
    }

    private SLLNode getNodeAt(int index) throws IndexOutOfBoundsException
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        SLLNode node = head;
        int counter = 0;
        while (counter != index)
        {
            node = node.next;
            counter++;
        }

        return node;
    }

    @Override
    public int indexOf(Object data)
    {
        SLLNode node = head;
        int count = 0;
        while (count < size)
        {
            if (data == node.element)
            {
                return count;
            }
            node = node.next;
            count++;
        }

        return -1;
    }

    @Override
    public boolean contains(Object data)
    {
        if (!isEmpty())
        {
            SLLNode node = head;
            int count = 0;
            while (count < size)
            {
                if (data == node.element)
                {
                    return true;
                }
                node = node.next;
                count++;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return head == null;
    }

    @Override
    public void clear()
    {
        head = null;
        size = 0;
    }

    @Override
    public void removeAt(int index) throws IndexOutOfBoundsException
    {
        // if index < 0 or index >= size
        // throw IndexOutOfBoundsException
        // if size == 1
        // clear the list
        // else
        // if index == 0
        // head point to head's next (head.next)
        // else
        // get the previous node (node at index - 1)
        // previous node's next to point to previous node's next next
        // decrement size
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (size == 1)
        {
            clear();
        } else
        {
            if (index == 0)
            {
                head = getNodeAt(index).next;
            } else
            {
                getNodeAt(index - 1).next = getNodeAt(index - 1).next.next;
            }
            size--;
        }
    }

}
