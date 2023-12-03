package aw.hackathon.avinnovate.trefund.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "client_order")
public class ClientSittingSection {
    @Id
    private long id;

    @Column(name = "client_id")
    private long client_id;

    @Column(name = "order_id")
    private long order_id;
}
