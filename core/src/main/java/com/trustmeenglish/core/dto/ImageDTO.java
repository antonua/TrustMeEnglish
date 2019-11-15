package com.trustmeenglish.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ImageDTO {
    private Long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private long size;
    private byte[] bytes;

}
