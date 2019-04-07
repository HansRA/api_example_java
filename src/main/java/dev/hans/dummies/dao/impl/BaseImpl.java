package dev.hans.dummies.dao.impl;

import dev.hans.dummies.dao.BaseDAO;
import dev.hans.dummies.dto.request.BaseRq;
import dev.hans.dummies.dto.response.BaseRs;
import org.springframework.stereotype.Repository;

@Repository("BaseDAO")
public class BaseImpl implements BaseDAO {

  @Override
  public BaseRs getResult(BaseRq request) {
    BaseRs response = new BaseRs();
    if ((request.getWord()).length() > 2) {
      response.setResult(request.getWord());
    } else {
      response.setResult("ERROR");
    }
    return response;
  }
}
