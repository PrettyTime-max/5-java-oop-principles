package com.example.task03;


public class TimeUnitUtils {

    public static Seconds toSeconds(Milliseconds source) {
        return new Seconds(source.toSeconds());
    }

    public static Minutes toMinutes(Milliseconds source) {
        return new Minutes(source.toMinutes());
    }

    public static Hours getHours(Milliseconds source) {
        return new Hours(source.getHours());
    }

    public static Milliseconds toMillis(Seconds source) {
        return new Milliseconds(source.toMillis());
    }

    public static Minutes toMinutes(Seconds source) {
        return new Minutes(source.toMinutes());
    }

    public static Hours getHours(Seconds source) {
        return new Hours(source.getHours());
    }

    public static Milliseconds toMillis(Minutes source) {
        return new Milliseconds(source.toMillis());
    }

    public static Seconds toSeconds(Minutes source) {
        return new Seconds(source.toSeconds());
    }

    public static Hours getHours(Minutes source) {
        return new Hours(source.getHours());
    }

    public static Milliseconds toMillis(Hours source) {
        return new Milliseconds(source.toMillis());
    }

    public static Seconds toSeconds(Hours source) {
        return new Seconds(source.toSeconds());
    }

    public static Minutes toMinutes(Hours source) {
        return new Minutes(source.toMinutes());
    }
}
