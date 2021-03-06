package collections;

import exceptions.MyOwnOutOfIndexException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ��� on 22.03.2016.
 */
public class CustomLinkedListTest {
    @Test
    public void newInstanceShouldBeEmpty() {
        CustomLinkedList list = new CustomLinkedList();

        Assert.assertEquals(0, list.size());
    }

    @Test
    public void sizeShouldBeChangedOnAddingElements() {
        CustomLinkedList list = new CustomLinkedList();
        list.add(new Object());
        list.add(new Object());

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getElementOnItsIndexShouldReturnAppropriateValue(){
        CustomLinkedList list = new CustomLinkedList();

        Object element = new Object();

        list.add(element);
        list.add(element);

        Assert.assertEquals(element, list.get(0));
        Assert.assertEquals(element, list.get(1));

        try {
            list.get(2);
            Assert.fail();
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
