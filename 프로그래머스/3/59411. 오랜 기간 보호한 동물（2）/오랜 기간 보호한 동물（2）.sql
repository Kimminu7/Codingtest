-- 코드를 입력하세요
select 
    ao.ANIMAL_ID,
    ao.NAME
from ANIMAL_INS as ai
join ANIMAL_OUTS as ao on ai.ANIMAL_ID = ao.ANIMAL_ID
order by ao.DATETIME-ai.DATETIME desc
limit 2;