package com.theupliftproject.dailyshop.logic.dto.advice;

import com.theupliftproject.dailyshop.logic.dto.exception.NoItemsExistsException;
import com.theupliftproject.dailyshop.web.InventoryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestControllerAdvice
public class NoItemsExistAdvice {
    public static final Logger LOGGER = LoggerFactory.getLogger(NoItemsExistAdvice.class);

    @ExceptionHandler(NoItemsExistsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HashMap<String, String> handleNoItemsExistException(NoItemsExistsException exception){
        LOGGER.info("handleNoItemsExistException : " + exception.getMessage());
        HashMap<String, String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        response.put("error", exception.getClass().getSimpleName());
        return response;
    }
}
