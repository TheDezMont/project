package ru.tinkoff.edu.java.scrapper.dary_prirody;

import jakarta.validation.constraints.NotNull;



public record ApiErrorResponse(@NotNull String description,
                               @NotNull String code,
                               @NotNull String exceptionName,
                               @NotNull String exceptionMessage,
                               @NotNull String[] stacktrace) {
}
