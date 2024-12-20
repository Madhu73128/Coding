# Write your MySQL query statement below

with cte as
(select product_id from Sales where sale_date <'2019-01-01' or sale_date>'2019-03-31')

-- can use <> instead of between
-- -- select p.product_id,p.product_name from Product p
-- -- where product_id not in (select product_id from cte)#both are not working due to edge cases

select distinct s.product_id,p.product_name from Sales s #not working without distinct due to dups
left join Product p on s.product_id=p.product_id 
where s.product_id not in (select product_id from cte);