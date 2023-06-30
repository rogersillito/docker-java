package com.mkyong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/example")
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExampleController {

    final Random rand = new Random();

    private Integer getN() {
        return this.rand.nextInt(5000);
    }

    @GetMapping
    public ResponseEntity<ExampleDto[]> get() {
        ExampleDto[] dtos = Stream.of(getN(), getN(), getN()).map(n -> new ExampleDto(n, n.toString())).toArray(ExampleDto[]::new);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}

