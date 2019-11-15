package com.trustmeenglish.core.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards")
@EqualsAndHashCode(of ={"id"})
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private EnWord enWord;
    @ManyToOne
    private RuWord ruWord;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;
    private Long rating;
}
