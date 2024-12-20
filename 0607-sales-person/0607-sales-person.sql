# Write your MySQL query statement below
-- select s.name from SalesPerson s
-- left join Orders o on s.sales_id=o.sales_id
-- left join Company c on o.com_id=c.com_id where c.name!='RED' or o.sales_id is null;



with cte as
(select o.sales_id from Orders o left join Company c on o.com_id=c.com_id where c.name='RED')
# c.name like 'RED'
select name from SalesPerson 
where sales_id not in (select sales_id from cte);
