package com.kodilla.patterns2.facade.dao;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.dao.calculator.Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(theOrder, userId) && target(object)")
    public void logEvent(OrderDto theOrder, Long userId, Object object){
        LOGGER.info("Class: " + object.getClass().getName() + ", Order: " + theOrder + ", User calling: " + userId);
    }
    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(theOrder, userId) && target(object)")
    public void logEvent2(OrderDto theOrder, Long userId, Object object){
        LOGGER.info("Order finished correctly.");
    }
}
