package com.lavajato.repositories;

import com.lavajato.models.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {

    @Override
    VeiculoModel save (VeiculoModel veiculo);
}
