package in.orcas.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    private static final Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping("/testlog")
    public String testLog() {
        logger.info("Info message logged");
        logger.debug("Debug message logged");
        logger.error("Error message logged");

        // Returning JSP page (Spring will resolve to /WEB-INF/views/test.jsp)
        return "test";
    }
}
