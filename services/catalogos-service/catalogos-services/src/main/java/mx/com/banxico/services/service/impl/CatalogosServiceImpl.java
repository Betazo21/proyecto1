package mx.com.banxico.services.service.impl;

import mx.com.banxico.commons.to.UserTO;
import mx.com.banxico.model.UserDO;
import mx.com.banxico.persistence.UserDAO;
import mx.com.banxico.services.service.ICatalogosService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class CatalogosServiceImpl implements ICatalogosService {

    static final Logger LOG = LogManager.getLogger(CatalogosServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserTO> getUsers() {

        LOG.info("Consultando usuarios");
        List<UserDO> usersDO = this.userDAO.findByLastName("Rodriguez");

        Type userDAOType = new TypeToken<List<UserDO>>() {}.getType();
        List<UserTO> usersTO = this.modelMapper.map(usersDO, userDAOType);
        LOG.info("Se retornan {} elementos", usersTO.size());

        return usersTO;
    }
}
