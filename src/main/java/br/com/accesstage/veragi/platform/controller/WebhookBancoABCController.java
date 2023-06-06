package br.com.accesstage.veragi.platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook-banco-abc/v1")
@RequiredArgsConstructor
public class WebhookBancoABCController {

    @PutMapping("/purchases/{id}/created")
    public ResponseEntity purchasesCreated() {
        return null;
    }

    @PutMapping("/purchases/{id}/error")
    public ResponseEntity purchasesError() {
        return null;
    }

    @PutMapping("/purchases/{id}/approved")
    public ResponseEntity purchasesApproved() {
        return null;
    }

    @PutMapping("/purchases/{id}/rejected")
    public ResponseEntity purchasesRejected() {
        return null;
    }

    @PutMapping("/purchases/{id}/disbursed")
    public ResponseEntity purchasesDisbursed() {
        return null;
    }

    @PutMapping("/purchases/{id}/canceled")
    public ResponseEntity purchasesCanceled() {
        return null;
    }

    @PutMapping("/purchases/{id}/liquidated")
    public ResponseEntity purchasesLiquidated() {
        return null;
    }
}
