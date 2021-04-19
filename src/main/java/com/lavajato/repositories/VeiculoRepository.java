package com.lavajato.repositories;

import com.lavajato.models.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel, Integer> {

    @Override
    VeiculoModel save (VeiculoModel veiculo);

    @Override
    Optional<VeiculoModel> findById (Integer id);
}
