package fr.m2i.projetbank.repository;

import fr.m2i.projetbank.model.Debit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitRepository extends JpaRepository<Debit, Long> {
}
