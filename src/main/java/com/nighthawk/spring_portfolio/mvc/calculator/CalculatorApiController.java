package com.nighthawk.spring_portfolio.mvc.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorApiController {

    @GetMapping("{expression}")
    public ResponseEntity<String> getExpression(@PathVariable String expression) throws JsonMappingException, JsonProcessingException {
      // test Object
      Calculator test = new Calculator(expression);
  
      return ResponseEntity.ok(test.toString());  // JSON response, see ExceptionHandlerAdvice for throws
    }

}