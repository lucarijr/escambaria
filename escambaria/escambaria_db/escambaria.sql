delimiter $$

CREATE DATABASE `escambaria` /*!40100 DEFAULT CHARACTER SET utf8 */$$

delimiter $$

CREATE TABLE `item` (
  `idItem` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `url_type` varchar(255) DEFAULT NULL,
  `idTag` int(11) NOT NULL,
  PRIMARY KEY (`idItem`),
  KEY `fk_item_Tag_idx` (`idTag`),
  CONSTRAINT `fk_item_Tag` FOREIGN KEY (`idTag`) REFERENCES `tag` (`idTag`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `tag` (
  `idTag` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idTag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

