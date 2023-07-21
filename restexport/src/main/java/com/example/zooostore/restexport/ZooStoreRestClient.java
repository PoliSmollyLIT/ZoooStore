package com.example.zooostore.restexport;

import com.example.zooostore.api.operations.item.get.GetItemRequest;
import com.example.zooostore.api.operations.item.get.GetItemResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestClient {
    @RequestLine("GET /getItem/{itemRequest}")
    GetItemResponse getItemById(@PathVariable UUID itemRequest);
}
