package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'amount squares,range 1', 110,384,9",
            "'amount squares,range 2', 600,8821,69",
            "'amount squares,range 3', 52,102,1",
            "'amount squares,range 4', 27,130,2"})
    void shouldCalculate(String testName, int from, int before, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateAmountOfSquares(from, before);

        assertEquals(expected, actual);


    }
}