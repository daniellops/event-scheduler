package com.eventscheduler.domain.model;

import com.eventscheduler.domain.enums.NotificationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Notification {
    private Long id;
    private User recipient;
    private String message;
    private LocalDateTime timestamp;
    private NotificationStatus status;
}
