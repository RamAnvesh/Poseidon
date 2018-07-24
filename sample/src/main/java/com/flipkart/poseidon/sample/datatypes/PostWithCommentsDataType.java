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

package com.flipkart.poseidon.sample.datatypes;

import flipkart.lego.api.entities.DataType;

import java.util.List;

public class PostWithCommentsDataType implements DataType {
    private PostDataType post;
    private List<CommentDataType> comments;

    public PostDataType getPost() {
        return post;
    }

    public void setPost(PostDataType post) {
        this.post = post;
    }

    public List<CommentDataType> getComments() {
        return comments;
    }

    public void setComments(List<CommentDataType> comments) {
        this.comments = comments;
    }
}
