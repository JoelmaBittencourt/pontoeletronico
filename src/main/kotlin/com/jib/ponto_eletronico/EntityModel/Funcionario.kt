package com.jib.ponto_eletronico.EntityModel

import com.wmazoni.pontointeligente.enums.PerfilEnum
import javax.persistence.Id


data class Funcionario (

    val nome: String,
    val email: String,
    val senha: String,
    val cpf: String,
    val perfil: PerfilEnum,
    val empresaId: String,
    val valorHora: Double? = 0.0,
    val qtdHorasTrabalhoDia: Float? = 0.0f,
    val qtdHorasAlmoco: Float? = 0.0f,

    @Id
    val  id :  String
    )
