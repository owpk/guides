CREATE SCHEMA `shop` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `shop`.`category` (
  `id` INT NOT NULL,
  `name` VARCHAR(128) NOT NULL,
  `discount` TINYINT NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `shop`.`type` (
  `id` INT NOT NULL,
  `type` VARCHAR(128) NOT NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `shop`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `brand_id` INT NOT NULL,
  `type_id` INT NOT NULL,
  `category_id` INT NOT NULL,
  `price` DECIMAL(10) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;
  
ALTER TABLE `shop`.`category` 
ADD COLUMN `alias_name` VARCHAR(45) NULL AFTER `discount`;

DROP TABLE `shop`.`category`;

