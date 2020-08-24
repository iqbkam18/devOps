package dev.exercise.devopsexercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevopsExerciseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldBeTrue(){
        assertEquals(1,1);
    }

}
