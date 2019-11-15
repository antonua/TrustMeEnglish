package com.trustmeenglish.core.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "images")
@EqualsAndHashCode(of ={"id"})
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private Long size;
    @Lob
    private byte[] bytes;
}
