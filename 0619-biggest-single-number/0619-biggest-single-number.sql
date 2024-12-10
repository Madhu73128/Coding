# Write your MySQL query statement below

-- with cte as (select num,count(num) as cnt from MyNumbers group by num)

-- select max(num) as num from cte where cnt=1;



with cte as (select num from MyNumbers group by num having count(num)=1)

select case when count(*)>0 then max(num) else null end as num from cte;