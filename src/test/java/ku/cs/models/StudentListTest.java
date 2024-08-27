package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    @DisplayName("Add new student with id and name")
    void testAddNewStudentByIdAndName() {
        studentList.addNewStudent("1111111111","Front");
        studentList.addNewStudent("2222222222","Fern");
        studentList.addNewStudent("3333333333","Shoyu");

        Student student= studentList.findStudentById("1111111111");

        String expected = "1111111111";
        String actual = student.getId();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add new student with name, id and score")
    void testAddNewStudentByNameIdAndScore() {
        studentList.addNewStudent("1111111111","Front",100);
        studentList.addNewStudent("2222222222","Fern",80);
        studentList.addNewStudent("3333333333","Shoyu",60);

        Student student= studentList.findStudentById("1111111111");

        String expected = "1111111111";
        String actual = student.getId();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("เทส findStudentById_NO")
    void testFindStudentByIdNOTEXIST() {
        studentList.addNewStudent("1111111111","Front");
        studentList.addNewStudent("2222222222","Fern");
        studentList.addNewStudent("3333333333","Shoyu");

        Student student = studentList.findStudentById("0000000000");
        assertNull(student);
    }

    @Test
    @DisplayName("เทส findStudentById_YES")
    void testFindStudentByIdEXIST() {
        studentList.addNewStudent("1111111111","Front");
        studentList.addNewStudent("2222222222","Fern");
        studentList.addNewStudent("3333333333","Shoyu");
        Student student = studentList.findStudentById("1111111111");
        assertNotNull(student);
        assertEquals("1111111111", student.getId());
        assertEquals("Front", student.getName());
    }

    @Test
    @DisplayName("เทส giveScore")
    void testGiveScore() {
        studentList.addNewStudent("1111111111","Front");
        studentList.addNewStudent("2222222222","Fern");
        studentList.addNewStudent("3333333333","Shoyu");

        studentList.giveScoreToId("1111111111",100);
        assertEquals(100, studentList.findStudentById("1111111111").getScore());
    }

    @Test
    @DisplayName("เทส viewGrade")
    void testViewGrade() {
        studentList.addNewStudent("1111111111","Front",100);
        studentList.addNewStudent("2222222222","Fern",80);
        studentList.addNewStudent("3333333333","Shoyu",60);
        studentList.viewGradeOfId("1111111111");
        assertEquals("A", studentList.viewGradeOfId("1111111111"));
    }
}
