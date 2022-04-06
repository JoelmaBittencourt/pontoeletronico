package com.wmazoni.pontointeligente.repositories

import com.jib.ponto_eletronico.EntityModel.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository: MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa?

}