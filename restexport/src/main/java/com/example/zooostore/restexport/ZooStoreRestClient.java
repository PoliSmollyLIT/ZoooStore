package com.example.zooostore.restexport;

import com.example.zooostore.api.operations.item.archive.ArchiveItemResponse;
import com.example.zooostore.api.operations.item.create.CreateItemRequest;
import com.example.zooostore.api.operations.item.create.CreateItemResponse;
import com.example.zooostore.api.operations.item.edit.EditItemRequest;
import com.example.zooostore.api.operations.item.edit.EditItemResponse;
import com.example.zooostore.api.operations.item.get.GetItemRequest;
import com.example.zooostore.api.operations.item.get.GetItemResponse;
import com.example.zooostore.api.operations.item.getall.GetAllItemsRequest;
import com.example.zooostore.api.operations.item.getall.GetAllItemsResponse;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaRequest;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaResponse;
import com.example.zooostore.api.operations.tag.create.CreateTagRequest;
import com.example.zooostore.api.operations.tag.create.CreateTagResponse;
import com.example.zooostore.api.operations.tag.delete.DeleteTagResponse;
import com.example.zooostore.api.operations.tag.edit.EditTagRequest;
import com.example.zooostore.api.operations.tag.edit.EditTagResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Headers({"Accept: application/json", "Content-Type: application/json"})
public interface ZooStoreRestClient {
    @RequestLine("GET /zoostore/item/{id}")
    GetItemResponse getItemById(@Param String id);

    @RequestLine("POST /zoostore/item")
    CreateItemResponse createItem(CreateItemRequest itemToCreate);

    @RequestLine("PUT /zoostore/item")
    EditItemResponse editItem(EditItemRequest itemRequest);

    @RequestLine("PUT /zoostore/item/{id}")
    ArchiveItemResponse archiveItem(@Param String id);

    @RequestLine("POST /zoostore/multimedia")
    CreateMultimediaResponse createMultimedia(CreateMultimediaRequest multimediaRequest);

    @RequestLine("POST /zoostore/tag")
    CreateTagResponse createTag(CreateTagRequest tagRequest);

    @RequestLine("PUT /zoostore/tag")
    EditTagResponse editTag(EditTagRequest tagRequest);

    @RequestLine("DELETE /zoostore/tag/{id}")
    DeleteTagResponse deleteTag(@Param Long id);

    @RequestLine("GET /zoostore/item/all/{input}/{page}")
    GetAllItemsResponse getAllItemsByTag(@Param(value = "input") String input, @Param(value = "page") Integer page);
}
