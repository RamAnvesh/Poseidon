package com.flipkart.poseidon.serviceclients;

import com.flipkart.phantom.task.spi.TaskResult;
import com.flipkart.poseidon.serviceclients.batch.ResponseMerger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CompletableFutureTaskResultToDomainObjectPromiseWrapper<DomainObject> extends AbstractFutureTaskResultToDomainObjectPromiseWrapper<CompletableFuture<TaskResult>, DomainObject> {

    public CompletableFutureTaskResultToDomainObjectPromiseWrapper(CompletableFuture<TaskResult> future) {
        super(future);
    }

    public CompletableFutureTaskResultToDomainObjectPromiseWrapper(CompletableFuture<TaskResult> future, boolean throwOriginalException) {
        super(future, throwOriginalException);
    }

    public CompletableFutureTaskResultToDomainObjectPromiseWrapper(ResponseMerger<DomainObject> responseMerger) {
        super(responseMerger);
    }

    public CompletableFutureTaskResultToDomainObjectPromiseWrapper(ResponseMerger<DomainObject> responseMerger, boolean throwOriginalException) {
        super(responseMerger, throwOriginalException);
    }

    public FutureTaskResultToDomainObjectPromiseWrapper<DomainObject> toFutureTaskResultToDomainObjectPromiseWrapper() {
        FutureTaskResultToDomainObjectPromiseWrapper<DomainObject> result = new FutureTaskResultToDomainObjectPromiseWrapper<>(responseMerger, throwOriginalException);
        result.addFutureForTask(getFutureList());
        return result;
    }

}
