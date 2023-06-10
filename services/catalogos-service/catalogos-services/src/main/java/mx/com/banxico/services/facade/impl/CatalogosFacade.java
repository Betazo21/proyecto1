package mx.com.banxico.services.facade.impl;

import mx.com.banxico.commons.to.UserTO;
import mx.com.banxico.services.facade.ICatalogosFacade;
import mx.com.banxico.services.service.ICatalogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CatalogosFacade implements ICatalogosFacade {

    @Autowired
    private ICatalogosService catalogosService;

    public List<UserTO> getAllUsers() {
        return this.catalogosService.getUsers();
    }
}
