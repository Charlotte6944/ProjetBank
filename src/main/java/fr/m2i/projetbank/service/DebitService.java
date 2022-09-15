package fr.m2i.projetbank.service;

import fr.m2i.projetbank.model.Debit;
import fr.m2i.projetbank.repository.DebitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitService {

    @Autowired
    public DebitRepository dr;

    public List<Debit> getDebit() {
        return dr.findAll();
    }

    public void deleteDebit(Long debitId) {
        dr.deleteById(debitId);
    }

    public void addDebit(Debit debit) {
        dr.save(debit);
    }

}
