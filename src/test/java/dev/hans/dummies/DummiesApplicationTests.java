package dev.hans.dummies;

import dev.hans.dummies.dao.BaseDAO;
import dev.hans.dummies.dto.request.BaseRq;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummiesApplicationTests {

  @Autowired
  BaseDAO baseDAO;
  BaseRq baseRq=new BaseRq();
  @Test
  public void contextLoads() {
    baseRq.setWord("Message");
    baseDAO.getResult(baseRq);
  }

}
