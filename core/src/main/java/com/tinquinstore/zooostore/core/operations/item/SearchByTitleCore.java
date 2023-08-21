package com.tinquinstore.zooostore.core.operations.item;

import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleOperation;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleRequest;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleResponse;
import com.tinquinstore.zooostore.api.operations.item.searchbytitle.SearchByTitleSingleItem;
import com.tinquinstore.zooostore.persistance.models.Item;
import com.tinquinstore.zooostore.persistance.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class SearchByTitleCore implements SearchByTitleOperation {
    private final ItemRepository itemRepository;
    @Value("${pagination}")
    private Integer pagination;
    @Override
    public SearchByTitleResponse process(SearchByTitleRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), pagination);
        String regex = request.getTitleRegex().toLowerCase();
        Page<Item> itemPage = itemRepository.findAllByRegexTitle(regex, pageable);
        List<SearchByTitleSingleItem> itemsFromPage = itemPage.getContent().stream()
                .map(item-> SearchByTitleSingleItem.builder()
                        .id(item.getId())
                        .title(item.getTitle())
                        .description(item.getDescription())
                        .vendorId(item.getVendor().getId())
                        .tagIds(item.getTags().stream().map(tag -> tag.getId()).collect(Collectors.toSet()))
                        .multimediaIds(item.getMultimedia().stream().map(multimedia -> multimedia.getId()).collect(Collectors.toSet()))
                        .build()).toList();
        return SearchByTitleResponse.builder().items(itemsFromPage).build();
    }
}
