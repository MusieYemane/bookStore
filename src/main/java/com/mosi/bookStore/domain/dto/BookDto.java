package com.mosi.bookStore.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // setter, getter, toString ...
@Builder  // Builder design pattren for creating an object
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;
}
