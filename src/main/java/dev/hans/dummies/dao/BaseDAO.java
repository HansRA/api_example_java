package dev.hans.dummies.dao;

import dev.hans.dummies.dto.request.BaseRq;
import dev.hans.dummies.dto.response.BaseRs;

public interface BaseDAO {

  BaseRs getResult(BaseRq request);

}
