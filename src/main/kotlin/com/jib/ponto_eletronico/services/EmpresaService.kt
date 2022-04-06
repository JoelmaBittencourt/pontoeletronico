package com.wmazoni.pontointeligente.services

import com.jib.ponto_eletronico.EntityModel.Empresa

interface EmpresaService {
    fun findByCnpj(cnpj: String): Empresa?
    fun insert(empresa: Empresa): Empresa
}