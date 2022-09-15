package fr.m2i.projetbank.repository;

import fr.m2i.projetbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    int sumTransaction();

}
