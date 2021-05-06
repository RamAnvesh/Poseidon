package com.flipkart.poseidon.serviceclients;

/**
 * Created by shrey.garg on 28/05/17.
 */
public class ServiceDebug {
    private final ServiceExecuteProperties properties;
    private final AbstractFutureTaskResultToDomainObjectPromiseWrapper responsePromise;

    public ServiceDebug(ServiceExecuteProperties properties, AbstractFutureTaskResultToDomainObjectPromiseWrapper responsePromise) {
        this.properties = properties;
        this.responsePromise = responsePromise;
    }

    public ServiceExecuteProperties getProperties() {
        return properties;
    }

    public AbstractFutureTaskResultToDomainObjectPromiseWrapper getResponsePromise() {
        return responsePromise;
    }
}
