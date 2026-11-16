package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Logger{
    private final String name;
    private Level level = Level.DEBUG;

    private static final Map<String, Logger> LOGGERS = new HashMap<>();
    // мап - интерфейс, который хранит ключ для значения (ключ => значение)


    private Logger(String name){
        this.name = name;
    }

    public static Logger getLogger(String name){
        if (!LOGGERS.containsKey(name)) {
            LOGGERS.put(name, new Logger(name));
        }
        return LOGGERS.get(name);
    }

    public String getName(){
        return name;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }

        public void debug(String message) {
        log(Level.DEBUG, message);
    }
 
    public void debug(String template, Object... args) {
        log(Level.DEBUG, template, args);
    }
 
    public void info(String message) {
        log(Level.INFO, message);
    }
 
    public void info(String template, Object... args) {
        log(Level.INFO, template, args);
    }
 
    public void warning(String message) {
        log(Level.WARNING, message);
    }
 
    public void warning(String template, Object... args) {
        log(Level.WARNING, template, args);
    }
 
    public void error(String message) {
        log(Level.ERROR, message);
    }
 
    public void error(String template, Object... args) {
        log(Level.ERROR, template, args);
    }

    public void log(Level level, String message){
        if (level.ordinal() < this.level.ordinal()) {
            return;
        }
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        System.out.println("[" + level + "] " + date + " " + name + " - " + message);
    }

    public void log(Level level, String template, Object... args){
        log(level, String.format(template, args));
    }
}