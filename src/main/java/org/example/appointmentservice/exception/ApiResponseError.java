package org.example.appointmentservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ApiResponseError {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
}
