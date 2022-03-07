package in.keepgrowing.springboottypesafeuserroles.example.adapters.driving.api.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ExampleControllerPaths.EXAMPLE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Example")
public class ExampleController {

    @GetMapping
    @Operation(summary = "Example endpoint")
    public ResponseEntity<Void> get() {
        return ResponseEntity.ok().build();
    }
}
