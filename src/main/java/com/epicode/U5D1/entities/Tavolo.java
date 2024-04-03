package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private String stato; // "LIBERO" o "OCCUPATO"
}
