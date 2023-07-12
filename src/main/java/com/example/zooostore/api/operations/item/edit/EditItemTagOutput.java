package com.example.zooostore.api.operations.item.edit;

import com.example.zooostore.data.models.Item;
import lombok.*;

import java.util.Set;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditItemTagOutput {
    private Long id;
    private String title;
}
