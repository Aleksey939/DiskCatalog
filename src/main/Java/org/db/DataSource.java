package org.db;

import java.sql.Connection;

public interface DataSource {
    Connection getConnection();
}
