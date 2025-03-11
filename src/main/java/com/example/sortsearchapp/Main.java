package com.example.sortsearchapp;

import com.example.CollectionUtils;
import lombok.extern.slf4j.Slf4j;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = CollectionUtils.filter(numbers, n -> n > 3);
        System.out.println(result);
    }
}
