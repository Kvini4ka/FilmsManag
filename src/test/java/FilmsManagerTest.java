import org.example.FilmsManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FilmsManagerTest {
    @Test

    public void testAllFilms() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");


        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneFilms() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");


        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void testFindFilms() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");


        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindFilmsunderLimits() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IIII");


        String[] actual = manager.findLast();
        String[] expected = {"Movie IIII", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindFilmsLimits() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IIII");
        manager.add("Movie IIIII");


        String[] actual = manager.findLast();
        String[] expected = {"Movie IIIII", "Movie IIII", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindFilmsOverLimits() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IIII");
        manager.add("Movie IIIII");
        manager.add("Movie IIIIII");


        String[] actual = manager.findLast();
        String[] expected = {"Movie IIIIII", "Movie IIIII", "Movie IIII", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }


}
