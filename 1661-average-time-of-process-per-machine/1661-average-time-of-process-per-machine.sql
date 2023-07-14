# Write your MySQL query statement below
SELECT    a.machine_id, CAST(SUM(b.timestamp - a.timestamp) / COUNT(*) AS DECIMAL(10,3) ) as processing_time
FROM      activity a
LEFT JOIN activity b ON a.process_id = b.process_id AND a.machine_id = b.machine_id
WHERE     a.activity_type = 'start' AND b.activity_type = 'end'
GROUP BY  machine_id;