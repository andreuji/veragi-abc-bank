package br.com.accesstage.veragi.platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veragi-banco-abc/v1")
@RequiredArgsConstructor
public class VeragiBancoABCIntegrationController {

    @GetMapping("/purchases/{id}")
    public ResponseEntity purchases() {
        return null;
    }

    @GetMapping("/purchases/{id}/status")
    public ResponseEntity purchasesStatus() {
        return null;
    }

    @PostMapping("/purchases/{id}")
    public ResponseEntity purchasesCreate() {
        return null;
    }

    @PostMapping("/purchases/{id}/validate")
    public ResponseEntity purchasesValidate() {
        return null;
    }

    @PostMapping("/purchases/{id}/approve")
    public ResponseEntity purchasesApprove() {
        return null;
    }

    @PostMapping("/purchases/{id}/reject")
    public ResponseEntity purchasesReject() {
        return null;
    }
}
