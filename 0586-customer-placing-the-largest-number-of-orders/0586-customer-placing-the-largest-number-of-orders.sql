# Write your MySQL query statement below

SELECT customer_number
FROM orders
GROUP BY customer_number
ORDER BY count(*) DESC limit 1;