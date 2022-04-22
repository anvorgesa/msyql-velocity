package mysqlvelocity;

import com.velocitypowered.api.plugin.Plugin;

@Plugin(
    id = "mysql-connector-java",
    authors = { "mysql" },
    version = "8.0.28"
)
public class MySQLVelocity {
    public MySQLVelocity() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {}
    }
}
