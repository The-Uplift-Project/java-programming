package com.theupliftproject.dailyshop.logic.dto.advice;

import com.theupliftproject.dailyshop.logic.dto.exception.NoItemsExistsException;
import com.theupliftproject.dailyshop.web.InventoryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NoItemsExistAdvice {
    public static final Logger LOGGER = LoggerFactory.getLogger(NoItemsExistAdvice.class);

    @ResponseBody
    @ExceptionHandler(NoItemsExistsException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    String handleNoItemsExistException(NoItemsExistsException exception){

        LOGGER.info("handleNoItemsExistException : " + exception.getMessage());
       return exception.getMessage();
    }
}
