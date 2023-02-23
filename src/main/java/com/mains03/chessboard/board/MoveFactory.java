package com.mains03.chessboard.board;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoveFactory {
    private static MoveFactory instance;

    public static MoveFactory getInstance() {
        if (instance == null) {
            instance = new MoveFactory();
        }

        return instance;
    }

    private final Pattern movePattern;

    private MoveFactory() {
        String pattern = sqaurePattern()
                + sqaurePattern()
                + promotedToPattern();

        movePattern = Pattern.compile(pattern);
    }

    private String sqaurePattern() {
        String[] fileLetter = new String[] {
                "a","b","c","d","e","f","g","h"
        };
        String[] rankNumber = new String[] {
                "1","2","3","4","5","6","7","8"
        };

        String pattern = "[";
        for (String s : fileLetter)
            pattern += s;
        pattern += "][";
        for (String s : rankNumber)
            pattern += s;
        pattern += "]";
        return pattern;
    }

    private String promotedToPattern() {
        return "[qrbn]?";
    }

    public Move createMove(String moveString) {
        Matcher matcher = movePattern.matcher(moveString);
        if (matcher.matches()) {
            return new Move() {};
        } else {
            return null;
        }
    }
}
