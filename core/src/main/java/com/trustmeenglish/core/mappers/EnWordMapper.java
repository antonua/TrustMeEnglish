package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnWordMapper {
    EnWordDTO toDTO(EnWord enWord);
}
