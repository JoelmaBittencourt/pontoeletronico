package com.jib.ponto_eletronico.EntityModel

import org.springframework.data.annotation.Id
import javax.persistence.Entity


@Entity
data class Empresa (
    val razaoSocial: String,
    val cnpj: String,

    @Id
    val id: String
)