package com.rcasia;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class StandaloneTestIT {
    
    @Test
    void contextLoads(ApplicationContext ctx){
        assertThat(ctx).isNotNull();
    }
}
