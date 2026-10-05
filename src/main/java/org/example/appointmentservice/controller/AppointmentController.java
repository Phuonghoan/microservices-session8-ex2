package org.example.appointmentservice.controller;

import org.example.appointmentservice.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    private final DoctorService doctorService;

    public AppointmentController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctor/{doctorId}")
    public ResponseEntity<?> getDoctor(
            @PathVariable Long doctorId
    ) {
        return doctorService.getDoctor(doctorId);
    }
}