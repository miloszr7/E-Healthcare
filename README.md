# E-Healthcare
Simple CRUD E-Healthcare web application made with Spring Boot MVC, Data JPA, Thymeleaf, Bootstrap, Hibernate.

# database
```
  CREATE TABLE `doctors` (
  `id` int(11) NOT NULL,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `title` text NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `doctors` (`id`, `first_name`, `last_name`, `title`, `age`) VALUES
(1, 'John', 'Smith', 'Family doctor', 31),
(2, 'Julia', 'Smith', 'Family doctor', 43),
(3, 'Jessica', 'Smith', 'Family doctor', 33),
(4, 'David', 'Smith', 'Family doctor', 34),
(5, 'Blake', 'Smith', 'Family doctor', 43),
(6, 'Michael', 'Montana', 'Family doctor', 56);


CREATE TABLE `patients` (
  `id` int(11) NOT NULL,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `SSN` text NOT NULL,
  `phone_number` text NOT NULL,
  `description` text NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `patients` (`id`, `first_name`, `last_name`, `SSN`, `phone_number`, `description`, `age`) VALUES
(1, 'Michael', 'Apple', '444444444', '555 555 555', 'Problems with...', 56),
(2, 'Jay', 'Apple', '444444444', '555 555 555', 'Problems with...', 33),
(3, 'Jess', 'Apple', '444444444', '555 555 555', 'Problems with...', 12),
(4, 'Michael', 'Smith', '11111111', '777 777 777', 'description', 19);


ALTER TABLE `doctors`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `patients`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `doctors`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;


ALTER TABLE `patients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;
```
