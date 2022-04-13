package oompa.lompas.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class TrainMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column int routeId;

    @Column
    private int fromStation;

    @Column
    private int toStation;

}
