package fr.m2i.projetbank.api;

import fr.m2i.projetbank.service.SalaryService;
import fr.m2i.projetbank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apiCompte {

    @Autowired
    private SalaryService ss;

    @Autowired
    private TransactionService ts;

    @GetMapping("/addSalary")
    public String addSalary() {
        ts.addSalary();
        return "Salaire ajouté";
    }

    @GetMapping("/removeCredit")
    public String removeCredit() {
        System.out.println("crédit enlevé");
        ts.removeDebit();
        return "Crédit enlevé";
    }

}
