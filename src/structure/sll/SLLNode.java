package structure.sll;

import java.io.Serializable;

public class SLLNode implements Serializable {

    protected Object element;
    protected SLLNode next;

    public SLLNode(Object element) {
        // Constructor
        this.element = element;
    }

}
