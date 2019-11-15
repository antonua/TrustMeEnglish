package com.trustmeenglish.core.services;

import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.model.Image;
import com.trustmeenglish.core.repositories.CardRepository;
import com.trustmeenglish.core.repositories.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{


    private final ImageRepository imageRepository;

    @Override
    public Image getImage(Long id) {

        return imageRepository.getById(id);
    }

    @Override
    public Image saveImage(Image image){
        return imageRepository.save(image);
    }
}
