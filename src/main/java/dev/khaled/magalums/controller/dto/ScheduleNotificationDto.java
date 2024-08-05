package dev.khaled.magalums.controller.dto;

import java.time.LocalDateTime;
import dev.khaled.magalums.entity.Channel;
import dev.khaled.magalums.entity.Notification;
import dev.khaled.magalums.entity.Status;

/**
 * ScheduleNotification
 */
public record ScheduleNotificationDto(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel
) {

    public Notification toNotification() {
        return new Notification(
            dateTime,
            destination,
            message,
            channel.toChannel(),
            Status.Values.PENDING.toStatus()
        );
    }
}
