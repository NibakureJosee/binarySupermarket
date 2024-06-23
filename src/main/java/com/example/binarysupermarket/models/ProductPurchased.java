package com.example.binarysupermarket.models;

import com.example.binarysupermarket.audits.TimestampAudit;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "product_purchased")

public class ProductPurchased extends TimestampAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming MySQL or similar
    private UUID id;

    @OneToOne
    @JoinColumn(name = "quantity_id")
    private ProductQuantity productQuantity;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @Column(name = "total")
    private Double total;

    public ProductPurchased(ProductQuantity productQuantity, User customer) {
        this.productQuantity = productQuantity;
        this.customer = customer;
    }
}
