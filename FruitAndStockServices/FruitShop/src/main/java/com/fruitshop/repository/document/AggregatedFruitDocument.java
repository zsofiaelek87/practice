package com.fruitshop.repository.document;

import com.fruitshop.service.model.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection="FruitHistory")
public class AggregatedFruitDocument {

    @Id
    private UUID id;
    private String fruitId;
    private String name;
    private Currency currency;
    private BigDecimal price;
    private List<String> availableAt;
    private Instant createdAt = Instant.now();

    public AggregatedFruitDocument(UUID id, String fruitId, String name, Currency currency, BigDecimal price, List<String> availableAt, Instant createdAt) {
        this.id = id;
        this.fruitId = fruitId;
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.availableAt = availableAt;
        this.createdAt = createdAt;
    }

    public AggregatedFruitDocument() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFruitId() {
        return fruitId;
    }

    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(List<String> availableAt) {
        this.availableAt = availableAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AggregatedFruitDocument that = (AggregatedFruitDocument) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AggregatedFruitDocument{" +
                "id='" + id + '\'' +
                ", fruitId='" + fruitId + '\'' +
                ", name='" + name + '\'' +
                ", currency=" + currency +
                ", price=" + price +
                ", availableAt=" + availableAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
