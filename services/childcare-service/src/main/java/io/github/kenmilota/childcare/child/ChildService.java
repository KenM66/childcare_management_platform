package io.github.kenmilota.childcare.child;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChildService {

    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    public List<Child> getAllChildren() {
        return childRepository.findAll();
    }

    public Child getChildById(UUID id) {
        return childRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Child not found"));
    }

    public Child saveChild(Child child) {
        return childRepository.save(child);
    }
}