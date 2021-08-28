package com.examplehub.basics.condition;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SwitchExampleTest {

    @Test
    void test1() {
        int option = 3;
        int result = 0;
        switch (option) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 11;
                break;
            case 3:
                result = 111;
                break;
            case 4:
                result = 1111;
                break;
            default:
                result = -1;
                break;
        }
        assertEquals(111, result);
    }

    @Test
    void testBreak() {
        int option = 3;
        int result = 0;
        switch (option) {
            case 1:
                result = 1;
            case 2:
                result = 11;
            case 3:
                result = 111;
            case 4:
                result = 1111;
                break;
            default:
                result = -1;
        }
        assertEquals(1111, result);
    }

    @Test
    void testString() {
        String language = "java";
        int result = 0;
        switch (language) {
            case "Java":
                result = 0;
                break;
            case "java":
                result = 1;
                break;
            case "go":
                result = 2;
                break;
            case "kotlin":
                result = 3;
                break;
            case "python":
                result = 4;
            default:
                result = -1;
                break;
        }
        assertEquals(1, result);
    }

    @Test
    void testLambda() {
        int option = 3;
        int result = 0;
        switch (option) {
            case 1 -> result = 1;
            case 2 -> result = 2;
            case 3 -> result = 3;
            case 4 -> {
                result = result + 1;
                result = result * 2;
            }
            default -> result = -1;
        }
        assertEquals(3, result);
    }

    @Test
    void testLambda2() {
        int option = 3;
        int result = 0;
        result = switch (option) {
            case 1 ->  1;
            case 2 ->  2;
            case 3, 4 -> 3;
            default ->  -1;
        };
        assertEquals(3, result);
    }

    @Test
    void testYield() {
        String language = "java";
        int result = switch (language) {
            case "kotlin" -> 1;
            case "java" -> {
                /* do something */
                int a = 4;
                int b = 3;
                yield a - b;
            }
            case "cpp", "go" -> 3;
            default ->  {
                int a = 3, b = 4;
                yield a + b;
            }
        };
        assertEquals(1, result);
    }
}
