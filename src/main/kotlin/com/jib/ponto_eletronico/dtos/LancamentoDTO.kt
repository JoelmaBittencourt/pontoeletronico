package com.wmazoni.pontointeligente.dtos

import javax.validation.constraints.NotEmpty

class LancamentoDTO(
    @get:NotEmpty(message = "Data não pode ser vazia.")
    val data: String? = null,

    @get:NotEmpty(message = "Tipo não pode ser vazio.")
    val tipo: String? = null,

    val descricao: String? = null,
    val localizacao: String? = null,
    val funcionarioId: String? = null,
    var id: String? = null
) {
}