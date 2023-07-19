package com.example.zooostore.api.operations.base;

public interface OperationProcessor <R extends OperationResult, I extends OperationInput>{
    R process(I input);
}
