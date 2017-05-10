import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Madalina on 5/10/2017.
 */
public class StudentTest {
    private Student student;
    @Test
    public void getStudent()  {

         student = new Student("Mada");
        assert student.getStudent().equals( "Mada");

    }

}