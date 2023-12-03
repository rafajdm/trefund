package aw.hackathon.avinnovate.trefund.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "sitting_section")
public class SittingSection {

    @Id
    private long id;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "availability")
    private int availability;

    @Column(name = "refund_availability")
    private int refundAvailability;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "event_id")
    private long eventId;
}
