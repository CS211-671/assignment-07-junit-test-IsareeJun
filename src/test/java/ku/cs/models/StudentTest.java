package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610451257","Front");
    }

    @Test
    @DisplayName("เทสเพิ่มคะแนน")
    void testAddScore(){
        //Student s1 = new Student("6610451257","Front");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("เทสเกรด")
    void testCalculateGrade(){
        //Student s = new Student("6610451257", "Front");
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }

    @Test
    @DisplayName("เทส getName")
    void testGetName(){
        //Student s = new Student("6610451257", "Front");
        assertEquals("Front", s1.getName());
    }

    @Test
    @DisplayName("เทส getScore")
    void testGetScore(){
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
    }

    @Test
    @DisplayName("เทสเปลี่ยนชื่อ")
    void testChangeName(){
        s1.changeName("fif");
        assertEquals("fif", s1.getName());
    }

    @Test
    @DisplayName("เทส getId")
    void testGetId(){
        assertEquals("6610451257", s1.getId());
    }

    @Test
    @DisplayName("เทส isId")
    void testIsId(){
        assertTrue(s1.isId(s1.getId()));
    }
}