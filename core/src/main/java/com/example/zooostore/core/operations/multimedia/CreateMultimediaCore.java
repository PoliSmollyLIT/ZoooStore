package com.example.zooostore.core.operations.multimedia;

import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaOperation;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaRequest;
import com.example.zooostore.api.operations.multimedia.create.CreateMultimediaResponse;
import com.example.zooostore.persistance.models.Item;
import com.example.zooostore.persistance.models.Multimedia;
import com.example.zooostore.persistance.repositories.ItemRepository;
import com.example.zooostore.persistance.repositories.MultimediaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateMultimediaCore implements CreateMultimediaOperation {
    private final MultimediaRepository multimediaRepository;
    private final ItemRepository itemRepository;
    @Override
    public CreateMultimediaResponse process(CreateMultimediaRequest multimedia) {
        Item item = itemRepository.findItemById(multimedia.getItem()).orElseThrow(()-> new EntityNotFoundException("Item with this id does not exist"));
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
