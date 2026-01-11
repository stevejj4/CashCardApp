package com.example.cashcard.Controller;

import com.example.cashcard.CashCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // marks this class as the rest controller
@RequestMapping("/cashcards") // defining the base URL
public class CashCardController {

    @GetMapping("/{requestedId}") // remove this code to implement separation of concern
    public ResponseEntity<CashCard> findById(@PathVariable long requestedId) {
        // @PathVariable -- to grab values from the URL
        if (requestedId == 99L) {
            CashCard cashCard = new CashCard(99L, 123.45);
            return ResponseEntity.ok(cashCard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}