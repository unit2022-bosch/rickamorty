package oompa.lompas.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Period;

@Entity
@Getter
@Setter
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int capacity;

    @Column
    private int routeId;

    @Column
    private Period departurePeriod;

    @Column
    private int nextMovementId;

    @Column
    private int status;
}
