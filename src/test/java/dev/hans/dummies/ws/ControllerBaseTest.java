package dev.hans.dummies.ws;

import dev.hans.dummies.dao.BaseDAO;
import dev.hans.dummies.dto.request.BaseRq;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerBaseTest {

  @Autowired
  BaseDAO baseDAO;
  BaseController baseController=new BaseController();

  @Test
  public void methodMessageGet() throws Exception {
    baseController.getMessageGet("Message");
  }

}
