-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, "%H") "HOUR", COUNT(*) "COUNT"
FROM ANIMAL_OUTS
GROUP BY 1
HAVING HOUR > 8 AND HOUR < 20
ORDER BY HOUR ASC