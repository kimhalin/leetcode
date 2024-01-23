# Write your MySQL query statement below
SELECT m.name
FROM employee as e
INNER JOIN employee as m
ON e.managerId=m.id
GROUP BY e.managerId
having count(e.id) >= 5;