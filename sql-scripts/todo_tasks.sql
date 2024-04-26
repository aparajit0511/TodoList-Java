CREATE DATABASE IF NOT EXISTS `todo_tasks`;
USE `todo_tasks`;

DROP TABLE IF EXISTS `todos`;

CREATE TABLE `todos`(
	`id` int NOT NULL AUTO_INCREMENT,
	`task_name` varchar(45) DEFAULT NULL,
	`description` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `todos` VALUES
	(1,'brush teeth','brush teeth and take a shower'),
	(2,'laundry','do your laundry');