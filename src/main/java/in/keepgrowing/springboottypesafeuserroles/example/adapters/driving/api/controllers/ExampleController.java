package in.keepgrowing.springboottypesafeuserroles.example.adapters.driving.api.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ExampleControllerPaths.EXAMPLE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class ExampleController {

    @GetMapping
    public ResponseEntity<Void> get() {
        return ResponseEntity.ok().build();
    }
}
