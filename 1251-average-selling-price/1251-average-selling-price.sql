# Write your MySQL query statement below
SELECT      p.product_id, ROUND(SUM(price*units) / SUM(units), 2) AS average_price
FROM        prices p
LEFT JOIN   unitsSold u
ON          p.product_id = u.product_id
WHERE       u.purchase_date BETWEEN p.start_date and p.end_date
GROUP BY    product_id;