package in.keepgrowing.springboottypesafeuserroles.example.adapters.driving.api.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ExampleControllerPaths.EXAMPLE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Example")
public class ExampleController {

    @GetMapping
    @Operation(summary = "Example GET endpoint")
    public ResponseEntity<Void> get() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    @Operation(summary = "Example POST endpoint available only for ROLE_CHIEF_OPERATING_OFFICER")
    @PreAuthorize(value = "hasRole(T(in.keepgrowing.springboottypesafeuserroles.security.domain.model.UserRole)" +
            ".CHIEF_OPERATING_OFFICER.toString())")
    public ResponseEntity<Void> post() {
        return ResponseEntity.ok().build();
    }
}
