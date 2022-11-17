package com.test.test.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    @Temporal(TemporalType.DATE)
    private Date datederniereModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Produit produit;
}
