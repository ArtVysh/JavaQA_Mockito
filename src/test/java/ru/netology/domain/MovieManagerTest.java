package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testShouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldAddThreeMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель \"Белград\"");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\""};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastFiveMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель \"Белград\"");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");

        String[] actual = manager.findLast();
        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\"", "Вперёд"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastFourMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель \"Белград\"");
        manager.addMovie("Джентельмены");

        String[] actual = manager.findLast();
        String[] expected = {"Джентельмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindLastSixMovies() {
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель \"Белград\"");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");

        String[] actual = manager.findLast();
        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShouldFindEmptyArray() {
        MovieManager manager = new MovieManager();
        manager.addMovie(null);

        String[] actual = manager.findAll();
        String[] expected = {null};

        Assertions.assertArrayEquals(expected, actual);
    }
}
