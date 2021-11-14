package org.owpk.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class SpelExample {

    @Value("#{ systemProperties['os.arch'] }")
    private String defaultLocale;

    public void printDefaultSystemArch() {
        System.out.println(defaultLocale);
    }

    public void parseExpression() {
        var spelConfig = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE, this.getClass().getClassLoader());
        var parser = new SpelExpressionParser(spelConfig);
//        var expr = parser.parseExpression("payload");
//        var msg = new MyMessage();
//        msg.name = "Aboba";
//        var payload = expr.getValue(msg);
//        System.out.println(payload);
    }

    private static class MyMessage {
        String name;

        public String toString() {
            return name;
        }
    }
}
