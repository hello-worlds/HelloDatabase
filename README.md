# HelloDatabase
eclipse sample java code for databases

## Tools and Methods
* Maven
* JDBC
* DAO (Data Access Object)
* MySQL

## MySQL DDL
```js
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
```

## MySQL DML
```js
INSERT INTO `users` (`id`, `name`, `email`, `password`) VALUES
(1, 'admin', 'admin@admin.com', 'admin'),
(2, 'user', 'user@user.com', 'user');
```