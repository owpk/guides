use shop;

insert into order_products (order_id, product_id, `count`) values (2, 3, 2);
insert into order_products (order_id, product_id, `count`) values (2, 4, 3);


SELECT * FROM shop.`order`;





SELECT sum(price * `count`) as total_price from `order` 
	inner join order_products on order_products.order_id = `order`.id
    inner join product on product.id = order_products.product_id
    where `order`.id = 2;
    
    
    
SELECT `order`.user_name, sum(price * `count`) as total_price  from `order` 
	inner join order_products on order_products.order_id = `order`.id
    inner join product on product.id = order_products.product_id
    group by `order`.user_name;
    
SELECT `order`.user_name, max(price), sum(`count`)  from `order` 
	inner join order_products on order_products.order_id = `order`.id
    inner join product on product.id = order_products.product_id
    group by `order`.user_name;

--мой пример--
select sum(price * count) as total_sum, count, `order`.id as order_id, product_id, brand.type as brand_name, `order`.user_name, price from `order_products`
    inner join product on product.id = order_products.product_id
    inner join `order` on `order`.id = order_products.order_id
    inner join brand on brand.id = product.brand_id
    group by order_products.product_id;
    
   
