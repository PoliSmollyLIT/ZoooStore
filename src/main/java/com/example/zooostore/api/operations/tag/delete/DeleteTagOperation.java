package com.example.zooostore.api.operations.tag.delete;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public interface DeleteTagOperation {
    HttpStatus deleteTag(DeleteTagRequest id);
}
