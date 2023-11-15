package com.rj.appmgr.server.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

class SnakeUpperCaseStrategy extends PropertyNamingStrategy.PropertyNamingStrategyBase {
    public SnakeUpperCaseStrategy() {
    }

    public String translate(String input) {
        if (input == null) {
            return input;
        } else {
            int length = input.length();
            StringBuilder result = new StringBuilder(length * 2);
            int resultLength = 0;
            boolean wasPrevTranslated = false;

            for (int i = 0; i < length; ++i) {
                char c = input.charAt(i);
                if (i > 0 || c != '_') {
                    if (Character.isUpperCase(c)) {
                        if (!wasPrevTranslated && resultLength > 0 && result.charAt(resultLength - 1) != '_') {
                            result.append('_');
                            ++resultLength;
                        }
                        wasPrevTranslated = true;
                    } else {
                        if (Character.isLowerCase(c)){
                            c = Character.toUpperCase(c);
                        }
                        wasPrevTranslated = false;
                    }

                    result.append(c);
                    ++resultLength;
                }
            }

            return resultLength > 0 ? result.toString() : input;
        }
    }
}