package com.trustmeenglish.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private EnWordDTO enWord;
    private RuWordDTO ruWord;
    private ImageDTO image;
    private Long rating;

}
