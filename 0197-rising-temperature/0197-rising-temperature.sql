# Write your MySQL query statement below
SELECT  id 
FROM    weather w
WHERE   temperature > 
(
    SELECT  temperature
    FROM    weather
    WHERE   recordDate = DATE_SUB(w.recordDate, INTERVAL 1 DAY)
);
