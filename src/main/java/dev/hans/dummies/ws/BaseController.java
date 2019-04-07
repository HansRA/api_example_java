package dev.hans.dummies.ws;

import dev.hans.dummies.dao.BaseDAO;
import dev.hans.dummies.dto.request.BaseRq;
import dev.hans.dummies.dto.response.BaseRs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:9001", maxAge = 3600)
@RestController
@RequestMapping("/base")
@Api(tags = "/base",
    value = "Sample Controller for beginners",
    produces = MediaType.ALL_VALUE,
    consumes = MediaType.ALL_VALUE
)
public class BaseController {

  private Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

  @Autowired
  BaseDAO baseDAO;
  BaseRs response = new BaseRs();

  @ApiOperation(value = "Example of method type get")
  @RequestMapping(value = "/get", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseRs getMessageGet(@RequestParam("word") String word) throws Exception {
    response.setResult(word);
    LOGGER.info(word);
    return response;
  }

  @ApiOperation(value = "Example of method type post")
  @RequestMapping(value = "/post", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseRs getMessagePost(@RequestBody BaseRq request) throws Exception {
    baseDAO.getResult(request);
    LOGGER.info(baseDAO.getResult(request).getResult());
    return response;
  }

}
