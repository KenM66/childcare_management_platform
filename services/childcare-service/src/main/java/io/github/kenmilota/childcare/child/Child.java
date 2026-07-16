package io.github.kenmilota.childcare.child;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Child {

    @Id
    @GeneratedValue
    private UUID id;

    private String displayId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;






}