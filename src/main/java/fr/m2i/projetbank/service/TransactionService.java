package fr.m2i.projetbank.service;

import fr.m2i.projetbank.model.Debit;
import fr.m2i.projetbank.model.Salary;
import fr.m2i.projetbank.model.Transaction;
import fr.m2i.projetbank.repository.DebitRepository;
import fr.m2i.projetbank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    public TransactionRepository tr;

    @Autowired
    public DebitRepository dr;

    public List<Transaction> getTransaction() {
        return tr.findAll();
    }

    public void addSalary() {
        Salary salary = new Salary();
        Transaction transaction = new Transaction("salaire", salary.getAmount());
        tr.save(transaction);
    }

    public int solde() {
        return tr.sumTransaction();
    }

    public void removeDebit() {
        List<Debit> list = dr.findAll();
        list.forEach((debit) -> {
            Transaction transaction = new Transaction(debit.getTitle(), -debit.getAmount());
            tr.save(transaction);

            if(!debit.getRegular()) {
                dr.deleteById(debit.getId());
            }
        });
    }

}
