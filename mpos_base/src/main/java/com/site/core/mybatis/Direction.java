package com.site.core.mybatis;


/**
 * 字段排序方向。
 * @author site
 *
 */
public enum Direction {
    ASC, DESC;
    
    
    public static Direction fromString(String value) {
        try {
            return Direction.valueOf(value.toUpperCase());
        } catch (Exception e) {
            return ASC;
        }
    }
}

