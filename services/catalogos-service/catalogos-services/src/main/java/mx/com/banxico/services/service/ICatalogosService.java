package mx.com.banxico.services.service;

import mx.com.banxico.commons.to.UserTO;
import java.util.List;

public interface ICatalogosService {

    List<UserTO> getUsers();
}
