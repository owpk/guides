ALTER TABLE `shop`.`product` 
ADD INDEX `fk_brand_product_idx` (`brand_id` ASC) VISIBLE;
;
ALTER TABLE `shop`.`product` 
ADD CONSTRAINT `fk_brand_product`
  FOREIGN KEY (`brand_id`)
  REFERENCES `shop`.`brand` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


  -- каскадное удаление--
  ALTER TABLE `shop`.`product` 
DROP FOREIGN KEY `fk_brand_product`;
ALTER TABLE `shop`.`product` 
ADD CONSTRAINT `fk_brand_product`
  FOREIGN KEY (`brand_id`)
  REFERENCES `shop`.`brand` (`id`)
  ON DELETE CASCADE;
