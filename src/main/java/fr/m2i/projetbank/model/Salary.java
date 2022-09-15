package fr.m2i.projetbank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Salary {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public Salary() {
        this.amount = 2000;
    }
}
