package com.theupliftproject.dailyshop.logic.dto.exception;

public class NoItemsExistsException extends RuntimeException {
    private static final String EXCEPTION_MESSAGE = "Currently no items exist in the inventory..";

    public NoItemsExistsException() {
        super(EXCEPTION_MESSAGE);
    }
}
