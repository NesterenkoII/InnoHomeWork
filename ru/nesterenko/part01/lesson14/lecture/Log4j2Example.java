package ru.nesterenko.part01.lesson14.lecture;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2Example {

    private static final Logger log = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        log.info("Hello World!");
        log.error("Моя первая ошибка", new Exception("ERR!"));
        log.debug("ggg");

    }
}
