package fr.m2i.projetbank.service;

import fr.m2i.projetbank.model.Salary;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@AllArgsConstructor
public class SalaryService {

    public Salary salary;

    public SalaryService() {
        this.salary = new Salary();
    }

}
