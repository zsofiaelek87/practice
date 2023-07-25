package com.fruitshop.repository;

import com.fruitshop.repository.document.AggregatedFruitDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitHistoryRepository extends MongoRepository<AggregatedFruitDocument, String> {
}
