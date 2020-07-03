DROP TABLE IF EXISTS `EMPLOYEE`;
CREATE TABLE `EMPLOYEE` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`firstname` VARCHAR(250) DEFAULT NULL,
	`lastname` VARCHAR(250) DEFAULT NULL,
	`salary` INT(11) DEFAULT NULL,
	`role` VARCHAR(250) DEFAULT NULL
);
INSERT INTO EMPLOYEE(firstname,lastname, salary, role)values('Vincent', 'Vega',1000,'Employee');
INSERT INTO EMPLOYEE(firstname,lastname,salary, role)values('Marsellus', 'Wallace',3000,'Boss');
INSERT INTO EMPLOYEE(firstname,lastname,salary, role)values('Butch', 'Coolidge',0, 'Volunteer');
