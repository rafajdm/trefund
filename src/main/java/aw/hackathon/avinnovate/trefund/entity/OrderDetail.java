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
@Entity(name = "order_detail")
public class OrderDetail {
    @Id
    private long id;

    @Column(name = "order_id")
    private long order_id;

    @Column(name = "order_detail_id")
    private long order_detail_id;

    @Column(name = "sitting_section_id")
    private long sitting_section_id;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "total_price")
    private BigDecimal total_price;
}
