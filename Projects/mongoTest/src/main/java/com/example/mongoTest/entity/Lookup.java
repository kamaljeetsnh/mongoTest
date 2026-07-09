package com.example.mongoTest.entity;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class Lookup<K, V> implements Function<K, Optional<V>> {

    private final Map<K, V> map;

    public Lookup(final Map<K, V> map) {
        this.map = Objects.requireNonNull(map);
    }

    @Override
    public Optional<V> apply(final K k) {
        Objects.requireNonNull(k);
        return Optional.ofNullable(map.get(k));
    }
}
