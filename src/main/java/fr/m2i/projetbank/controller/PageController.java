package fr.m2i.projetbank.controller;

import fr.m2i.projetbank.model.Debit;
import fr.m2i.projetbank.service.DebitService;
import fr.m2i.projetbank.service.SalaryService;
import fr.m2i.projetbank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageController {

    @Autowired
    public TransactionService ts;

    @Autowired
    public DebitService ds;

    @Autowired
    public SalaryService ss;

    @GetMapping(
            name = "homePage",
            value = "/"
    )
    public String home(Model model) {
        model.addAttribute("transactions", ts.getTransaction());
        model.addAttribute("soldeTransaction", ts.solde());
        model.addAttribute("debits", ds.getDebit());
        model.addAttribute("formDebit", new Debit());
        model.addAttribute("salary", ss.getSalary());
        return "home";
    }

    @GetMapping(
            "/debitAction"
    )
    public RedirectView debitAction(Long debitId) {
        ds.deleteDebit(debitId);
        return new RedirectView("");
    }

    @PostMapping(
            "/addDebit"
    )
    public RedirectView addDebit(@ModelAttribute("formDebit") Debit debit) {
        System.out.println(debit.getRegular() == null);
        if(debit.getRegular() == null) {
            debit.setRegular(false);
        }
        ds.addDebit(debit);
        return new RedirectView("/");
    }
}
