# Write your MySQL query statement below
SELECT      s.student_id, s.student_name, su.subject_name, COUNT(e.subject_name) as attended_exams
FROM        students s
JOIN        subjects su
LEFT JOIN   examinations e
ON          s.student_id = e.student_id AND su.subject_name = e.subject_name
GROUP BY    s.student_id, su.subject_name
ORDER BY    s.student_id, su.subject_name;