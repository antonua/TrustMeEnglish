package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.model.EnWord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.io.IOException;

@Mapper
public interface CardMapper {

    CardDTO toDTO(Card card);
    Card toEntity(CardDTO cardDTO) throws IOException;
}
