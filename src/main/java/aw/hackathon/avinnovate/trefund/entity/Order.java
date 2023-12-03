package aw.hackathon.avinnovate.trefund.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "order")
public class Order {
    @Id
    private long id;

    @Column(name = "order_number")
    private String order_number;

    @Column(name = "client_id")
    private long client_id;

    @Column(name = "event_id")
    private long event_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total_paid")
    private BigDecimal total_paid;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;
}
