package com.flipkart.poseidon.datasources;

import java.util.concurrent.CompletableFuture;

public interface AsyncDataSource<T> {
    CompletableFuture<T> callAsync();
}
