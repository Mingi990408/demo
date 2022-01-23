package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MemberService {

    private static final Logger logger = LogManager.getLogger(MemberService.class);

    public void function() {
        logger.info("INFO SUCCESS");
        logger.debug("DEBUG SUCCESS");
        logger.error("ERROR SUCCESS");
    }
}