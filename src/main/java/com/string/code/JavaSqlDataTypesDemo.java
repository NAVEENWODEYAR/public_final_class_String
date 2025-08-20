package com.string.code;

import java.sql.*;

/**
 * @author Naveen K Wodeyar
 * @date 20-Aug-2025
 */

public class JavaSqlDataTypesDemo {
    public static void main(String[] args) {
        // Java SQL data types vs Java data types
        System.out.printf("%-20s%-25s%-25s%n", "SQL Type", "Java SQL Type (java.sql.Types)", "Typical Java Type");
        System.out.println("--------------------------------------------------------------------------------------");

        // Show mappings between SQL data types and Java data types
        showType("INTEGER", Types.INTEGER, "int / Integer");
        showType("VARCHAR", Types.VARCHAR, "String");
        showType("CHAR", Types.CHAR, "String");
        showType("BOOLEAN", Types.BOOLEAN, "boolean / Boolean");
        showType("DECIMAL", Types.DECIMAL, "BigDecimal");
        showType("DOUBLE", Types.DOUBLE, "double / Double");
        showType("FLOAT", Types.FLOAT, "float / Float");
        showType("DATE", Types.DATE, "java.sql.Date / java.time.LocalDate");
        showType("TIME", Types.TIME, "java.sql.Time / java.time.LocalTime");
        showType("TIMESTAMP", Types.TIMESTAMP, "java.sql.Timestamp / java.time.LocalDateTime");
        showType("BLOB", Types.BLOB, "byte[] / Blob");
        showType("CLOB", Types.CLOB, "String / Clob");
    }

    public static void showType(String sqlTypeName, int sqlTypeCode, String javaEquivalent) {
        System.out.printf("%-20s%-25s%-25s%n", sqlTypeName, "Types." + getSqlTypeName(sqlTypeCode), javaEquivalent);
    }

    // Optional: Get the name of the SQL type from java.sql.Types code (reverse lookup)
    public static String getSqlTypeName(int sqlTypeCode) {
        for (java.lang.reflect.Field field : Types.class.getFields()) {
            try {
                if (field.getInt(null) == sqlTypeCode) {
                    return field.getName();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return "UNKNOWN";
    }
}
