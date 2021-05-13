package com.flipkart.poseidon.serviceclients;

import com.flipkart.phantom.task.spi.TaskResult;
import com.flipkart.poseidon.serviceclients.batch.ResponseMerger;

import java.util.concurrent.Future;

public class FutureTaskResultToDomainObjectPromiseWrapper<DomainObject> extends AbstractFutureTaskResultToDomainObjectPromiseWrapper<Future<TaskResult>, DomainObject> {

    public FutureTaskResultToDomainObjectPromiseWrapper(Future<TaskResult> future) {
        super(future);
    }

    public FutureTaskResultToDomainObjectPromiseWrapper(Future<TaskResult> future, boolean throwOriginalException) {
        super(future, throwOriginalException);
    }

    public FutureTaskResultToDomainObjectPromiseWrapper(ResponseMerger<DomainObject> responseMerger) {
        super(responseMerger);
    }

    public FutureTaskResultToDomainObjectPromiseWrapper(ResponseMerger<DomainObject> responseMerger, boolean throwOriginalException) {
        super(responseMerger, throwOriginalException);
    }
}
