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
@Entity(name = "series")
public class Series {

    @Id
    private long id;

    @Column(name = "vendor_id")
    private long vendorId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
