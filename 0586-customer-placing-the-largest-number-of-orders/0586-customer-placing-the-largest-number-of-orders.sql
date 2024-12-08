# Write your MySQL query statement below


with cte as 
(select customer_number,count(order_number) as ordernumber from Orders 
group by customer_number)

select customer_number from cte 
where ordernumber=(select max(ordernumber) from cte)




-- select customer_number,count(order_number) as ordernumber from Orders
-- group by customer_number
-- order by ordernumber desc
-- limit 1;


-- select customer_number from Orders
-- -- group by customer_number
-- order by count(order_number) desc
-- limit 1;