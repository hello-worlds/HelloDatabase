# HelloDatabase
eclipse sample java code for databases

## Tools and Methods
* Maven
* JDBC
* DAO (Data Access Object)
* Factory
* MySQL

## MySQL Connection
File Connection Location
```java
com.richasdy.HelloDatabase.Util.ConnectionFactory
com.richasdy.HelloDatabase.DAO.MySQLDAOFactory
```

Sample Connection Configuration
```java
public static final String URL = "jdbc:mysql://localhost/hellojava";
public static final String USER = "root";
public static final String PASSWORD = "";
public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
```


## MySQL DDL
```sql
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
```

## MySQL DML
```sql
INSERT INTO `users` (`id`, `name`, `email`, `password`) VALUES
(1, 'admin', 'admin@admin.com', 'admin'),
(2, 'user', 'user@user.com', 'user');
```