package net.SACCO.MIS.Saccoappdb.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "expenses")
public class expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "Vendors", nullable = false)
    private String vendor;
    @Column(name = "Expenses")
    private String expense;
    @Column(name = "Reference_NO")
    private long refNo;
    @Column(name = "Amount")
    private long amount;

}
