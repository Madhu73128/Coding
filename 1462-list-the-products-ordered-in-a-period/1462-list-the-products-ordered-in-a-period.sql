# Write your MySQL query statement below
-- with cte as(select product_id,sum(unit) as unit from Orders 
-- where order_date between '2020-02-01' and '2020-02-28' group by product_id)

-- select p.product_name,c.unit 
-- from Products p
-- inner join cte c on 
-- p.product_id=c.product_id where unit>=100;#Getting as wrong

with cte as(select product_id,sum(unit) as feb_unit from Orders 
where year(order_date)='2020' and month(order_date)=2 group by product_id)

select p.product_name,c.feb_unit as unit 
from Products p
left join cte c on 
p.product_id=c.product_id 
where feb_unit>=100;