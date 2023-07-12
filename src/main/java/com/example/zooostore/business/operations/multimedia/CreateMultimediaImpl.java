package com.example.zooostore.business.operations.multimedia;

import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaOperation;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaRequest;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaResponse;
import com.example.zooostore.data.models.Item;
import com.example.zooostore.data.models.Multimedia;
import com.example.zooostore.data.repositories.ItemRepository;
import com.example.zooostore.data.repositories.MultimediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateMultimediaImpl implements CreateMultimediaOperation {
    private final MultimediaRepository multimediaRepository;
    private final ItemRepository itemRepository;
    @Override
    public CreateMultimediaResponse createMultimedia(CreateMultimediaRequest multimedia) {
        Item item = itemRepository.findItemById(multimedia.getItem());
        Multimedia multimediaEntity = Multimedia.builder()
                .url(multimedia.getUrl())
                .item(item)
                .build();
        multimediaRepository.save(multimediaEntity);
        CreateMultimediaResponse multimediaResponse = CreateMultimediaResponse.builder()
                .id(multimediaEntity.getId())
                .item(multimediaEntity.getItem().getId())
                .build();
        return multimediaResponse;
    }
}
