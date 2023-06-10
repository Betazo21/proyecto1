package mx.com.banxico.services.facade;

import mx.com.banxico.commons.to.UserTO;
import mx.com.banxico.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatalogosFacadeTest extends BaseTest {

    @Test
    public void ShouldReturnAllUsers() {

        List<UserTO> users = this.catalogosFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}