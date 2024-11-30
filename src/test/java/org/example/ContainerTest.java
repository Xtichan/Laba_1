package org.example;

        import org.junit.Test;
        import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void testAddAndGet() {
        Container<Integer> container = new Container<>();
        container.add(1);
        container.add(2);
        container.add(3);

        assertEquals(1, container.get(0).intValue());
        assertEquals(2, container.get(1).intValue());
        assertEquals(3, container.get(2).intValue());
    }

    @Test
    public void testRemove() {
        Container<String> container = new Container<>();
        container.add("A");
        container.add("B");
        container.add("C");

        container.remove(1);

        assertEquals(2, container.size());
        assertEquals("A", container.get(0));
        assertEquals("C", container.get(1));
    }
}
