/*
 * Copyright 2018 Flipkart Internet, pvt ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.poseidon.internal;

import com.flipkart.poseidon.legoset.ContextInducedBlock;

import java.util.concurrent.Callable;

public class ContextInducedCallable extends ContextInducedBlock implements Callable {
    private final CallableBlock callableBlock;

    ContextInducedCallable(CallableBlock callableBlock) {
        super(callableBlock);
        this.callableBlock = callableBlock;
    }

    @Override
    public Object call() throws Exception {
        try {
            initAllContext(null);
            Object result = callableBlock.call();
            success = true;
            return result;
        } finally {
            shutdownAllContext();
        }
    }
}
