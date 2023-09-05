import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp()
    {
        p1 = new Person("000001", "Yutong", "Chen", "Mr", 2003);
        p2 = new Person("000002", "Grace", "Hostelley", "Mrs", 2003);
        p3 = new Person("000003", "Jake", "Frazier", "Mr", 1995);
        p4 = new Person("000004", "Max", "Arraje", "Mr", 2002);
        p5 = new Person("000005", "Joe", "Burrow", "Mr", 1996);
        p6 = new Person("000006", "Yuchen", "Chen", "Mr", 1999);


    }
    @Test
    void setFirstName() {
        p1.setFirstName("Grace");
        assertEquals("Grace", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Hostelley");
        assertEquals("Hostelley", p1.getLastName());
    }

    @Test
    void setID() {
        p1.setID("00002");
        assertEquals("00002", p1.getID());
    }

    @Test
    void setTitle() {
        p1.setTitle("Mrs");
        assertEquals("Mrs", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(2003);
        assertEquals(2003,p1.getYOB());
    }
}