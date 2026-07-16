package io.github.kenmilota.childcare.child;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ChildServiceTest {

    @Mock
    private ChildRepository childRepository;

    private ChildService childService;

    @BeforeEach
    void setUp() {
        childService = new ChildService(childRepository);
    }

    @Test
    void shouldReturnAllChildren() {
        Child child = new Child();
        child.setFirstName("Emma");

        when(childRepository.findAll())
                .thenReturn(List.of(child));

        List<Child> children = childService.getAllChildren();

        assertEquals(1, children.size());
        assertEquals("Emma", children.get(0).getFirstName());
    }

}