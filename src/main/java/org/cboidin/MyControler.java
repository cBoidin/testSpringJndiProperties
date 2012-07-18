package org.cboidin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyControler implements Controller {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${url}")
    private String urlProperty;

    @Value("${login}")
    private String loginProperty;

    @Value("${password}")
    private String passwordProperty;

    @Value("${optional:default value}")
    private String optionalProperty;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.info("urlProperty      = '" + urlProperty      + "'");
        logger.info("loginProperty    = '" + loginProperty    + "'");
        logger.info("passwordProperty = '" + passwordProperty + "'");
        logger.info("optionalProperty = '" + optionalProperty + "'");

        final Map<String, String> params = new HashMap<String, String>();
        params.put("urlProperty"     , urlProperty     );
        params.put("loginProperty"   , loginProperty   );
        params.put("passwordProperty", passwordProperty);
        params.put("optionalProperty", optionalProperty);

        return new ModelAndView("jsp/hello.jsp", params);
    }
}