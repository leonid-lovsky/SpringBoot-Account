package account;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class AccountApplicationTests {

    @Test
    void contextLoads() {
        ApplicationModules.of(AccountApplication.class).verify();
    }
}
