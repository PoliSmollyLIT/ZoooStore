package com.example.zooostore.api.operations.item.get;

import com.example.zooostore.api.operations.base.OperationResult;
import com.example.zooostore.api.operations.item.edit.EditItemMultimediaOutput;
import com.example.zooostore.api.operations.item.edit.EditItemTagOutput;
import com.example.zooostore.api.operations.item.edit.EditItemVendorOutput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetItemResponse implements OperationResult {
        @NotBlank
        private UUID id;
        @NotBlank
        private String title;
        @NotBlank
        private String description;
        @NotBlank
        private EditItemVendorOutput vendor;
        private Set<EditItemMultimediaOutput> multimedia;
        private Set<EditItemTagOutput> tags;
        @NotBlank
        private boolean archive;
}

