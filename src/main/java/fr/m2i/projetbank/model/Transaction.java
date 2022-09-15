package fr.m2i.projetbank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries(
        @NamedQuery(name="Transaction.sumTransaction", query="SELECT sum(t.amount) FROM Transaction t")
)
public class Transaction {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private int amount;

    @Column(name="title")
    private String title;

    public Transaction(String title, int amount) {
        this.amount = amount;
        this.title = title;
    }

}
