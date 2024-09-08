package com.sistema.pedidos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NonNull
    private int clienteId;
    @NonNull
    private String estado;
    @NonNull
    private int total;





}
