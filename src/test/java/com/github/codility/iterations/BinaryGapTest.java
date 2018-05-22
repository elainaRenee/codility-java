package com.github.codility.iterations;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class BinaryGapTest {

    private final List<Object[]> data = Arrays.asList(new Object[][]{
            {1041, 5},
            {32, 0}
    });


    @TestFactory
    Stream<DynamicTest> binaryGap() {
        return data.stream().map(data -> {
                    final int num = (int) data[0];
                    final int result = (int) data[1];
                    return dynamicTest(num + " -> " + result,
                            () -> assertTrue(BinaryGap.solution(num) == result));
                }
        );
    }
}
