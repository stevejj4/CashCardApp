package com.example.cashcard.Repository;

import com.example.cashcard.Model.CashCard;
import org.springframework.data.repository.CrudRepository;
// crud repository is an interface supplied by data
public interface CashCardRepository extends CrudRepository <CashCard, Long> {

}
