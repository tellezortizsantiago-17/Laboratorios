package com.example.petmach_tab.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petmach_tab.model.RequestStatus;
import com.example.petmach_tab.model.SupportRequest;

public interface SupportRequestRepository
    extends JpaRepository<SupportRequest, Long> {

    List<SupportRequest> findByPet_IdOrderByIdDesc(Long petId);

    Optional<SupportRequest> findByIdAndPet_Id(Long id, Long petId);

    boolean existsByPet_Id(Long petId);

    boolean existsByPet_IdAndStatus(Long petId, RequestStatus status);
}