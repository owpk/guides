use shop;

SELECT * FROM product;
SELECT count(*) FROM product where product.price < 10000;
SELECT sum(price) as total_price, min(price) as min_price, max(price) as max_price FROM product;

SELECT sum(price * order_products.count) FROM product
left join order_products on order_products.product_id = product.id
left join shop.order on shop.order.id = order_products.order_id
where order_id = 1;