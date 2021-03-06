-- MySQL Script generated by MySQL Workbench
-- Fri Jun 12 20:15:50 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema lesson1
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lesson1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lesson1` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `lesson1` ;

-- -----------------------------------------------------
-- Table `lesson1`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lesson1`.`country` (
  `id` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table `lesson1`.`region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lesson1`.`region` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `region_name` VARCHAR(45) NULL DEFAULT NULL,
  `country_id` TINYINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `country_id_fk_idx` (`country_id` ASC) VISIBLE,
  CONSTRAINT `country_id_fk`
    FOREIGN KEY (`country_id`)
    REFERENCES `lesson1`.`country` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table `lesson1`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lesson1`.`area` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `area_name` VARCHAR(45) NOT NULL,
  `region_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `region_id_fk_idx` (`region_id` ASC) VISIBLE,
  CONSTRAINT `region_id_fk`
    FOREIGN KEY (`region_id`)
    REFERENCES `lesson1`.`region` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table `lesson1`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lesson1`.`city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `city_name` VARCHAR(45) NOT NULL,
  `area_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `city_name_UNIQUE` (`city_name` ASC) VISIBLE,
  INDEX `area_id_fk_idx` (`area_id` ASC) VISIBLE,
  CONSTRAINT `area_id_fk`
    FOREIGN KEY (`area_id`)
    REFERENCES `lesson1`.`area` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

--Select query
SELECT * FROM lesson1.city 
inner join lesson1.area on city.area_id
inner join lesson1.region on area.region_id
inner join lesson1.country on region.country_id;