package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.dto.ImageDTO;
import com.trustmeenglish.core.mappers.EnWordMapper;
import com.trustmeenglish.core.mappers.ImageMapper;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.Image;
import com.trustmeenglish.core.services.EnWordService;
import com.trustmeenglish.core.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/images/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id) throws IOException {
        Image image = imageService.getImage(id);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.OK);
    }

    @PostMapping("/images")
    public ResponseEntity<?> saveImage(@RequestParam("file") MultipartFile file) throws IOException{
        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.CREATED);

    }

}
