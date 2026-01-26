package com.annotations.usecacheresult;

import java.lang.annotation.*;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class CacheDemo {

    static HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int square(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = n * n;
        cache.put(n, result);
        return result;
    }
}
