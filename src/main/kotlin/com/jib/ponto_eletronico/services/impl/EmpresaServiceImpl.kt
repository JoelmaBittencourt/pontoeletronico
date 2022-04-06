package com.wmazoni.pontointeligente.services.impl

import com.jib.ponto_eletronico.EntityModel.Empresa
import com.wmazoni.pontointeligente.repositories.EmpresaRepository
import com.wmazoni.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun findByCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

    override fun insert(empresa: Empresa) = empresaRepository.save(empresa)
}