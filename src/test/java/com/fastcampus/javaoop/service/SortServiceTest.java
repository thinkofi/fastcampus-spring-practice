package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("abc", "trey", "easy"));

        // Test
        assertEquals(List.of("abc", "easy", "trey"), actual);
    }
}