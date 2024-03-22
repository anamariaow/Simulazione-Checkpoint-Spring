package com.example.Studentisimulazionecheckpoint3.repository;

import com.example.Studentisimulazionecheckpoint3.entity.Studenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentiRepository extends JpaRepository<Studenti, Long> {
}
