package io.github.kenmilota.childcare.child;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/children")
public class ChildController {

    private final ChildService childService;

    public ChildController(ChildService childService) {
        this.childService = childService;
    }

    @GetMapping
    public List<Child> getAllChildren() {
        return childService.getAllChildren();
    }

    @GetMapping("/{id}")
    public Child getChildById(@PathVariable UUID id) {
        return childService.getChildById(id);
    }

    @PostMapping
    public Child createChild(@RequestBody Child child) {
        return childService.saveChild(child);
    }
}