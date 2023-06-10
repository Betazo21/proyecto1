package mx.com.banxico.services.service;

import mx.com.banxico.commons.to.UserTO;
import mx.com.banxico.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatalogosServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.catalogosService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
