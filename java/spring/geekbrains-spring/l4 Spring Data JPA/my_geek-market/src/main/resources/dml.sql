-- Имена всех товаров из всех корзин для пользователя Bob
select products.title from orders
    left join products on product_id = products.id
    left join customers on customer_id = customers.id
where customers.name = 'Bob';