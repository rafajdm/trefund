package aw.hackathon.avinnovate.trefund.entity;
// add lombok data noargscontructor allargscontructor builder and entity

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
@Entity(name = "waiting_list")
public class WaitingList {

    @Id
    private long id;

    @Column(name = "client_id")
    private long client_id;

    @Column(name = "event_id")
    private long event_id;

    @Column(name = "status")
    private String status;
}
