package com.nighthawk.spring_portfolio.mvc.lightboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.*;

@RestController
@RequestMapping("/api/lightboard")
public class LightBoardApiController {

    @GetMapping("/")
    public ResponseEntity<String> LightBoard() throws JsonMappingException, JsonProcessingException {
      // test Object
      LightBoard test = new LightBoard(5,5);
  
      return ResponseEntity.ok(test.toString());  // JSON response, see ExceptionHandlerAdvice for throws
    }

}