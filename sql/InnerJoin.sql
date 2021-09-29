use shop;
SELECT * FROM product;
select * from category where id = 1 or id = 3 or id = 2;
select * from category where id >= 1 and id <=3;
select * from category where id IN (1, 2, 3);

select * from product 
	inner join category on product.category_id = category.id;
    
select product.id, price, name from product  
	inner join category on product.category_id = category.id; 
    
select * from category  
	 inner join product on product.category_id = category.id;
     

select * from product  
	inner join category on product.category_id = category.id
    where discount <= 5;
    -- where price < 10000;
    
    
select * from product  
	inner join category on product.category_id = category.id 
    inner join brand on brand.id = product.brand_id
    inner join product_type on product_type.id = product.product_type_id;
    
select product.id, brand.type as brand_name, type.type as type_name, category.name as category_name, product.price from product  
	inner join category on product.category_id = category.id 
    inner join brand on brand.id = product.brand_id
    inner join type on type.id = product.type_id;

select * from category
    left join product on product.category_id = category.id
    where product.id is null;

select type.type as type_type, category.name as category_name, brand.type as brand_type, product.id as product_id from brand
    left join product on product.brand_id = brand.id
    left join category on category.id = product.category_id
    left join type on type.id = product.type_id;
    
    