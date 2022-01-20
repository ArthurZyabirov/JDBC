SELECT product_name FROM orders1 o
JOIN customers c ON o.product_name = c.name
WHERE c.name = :name;