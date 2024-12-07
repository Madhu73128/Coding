# Write your MySQL query statement below

-- select name as Customers from Customers 
-- where id not in(select customerId from Orders);
 

-- select name as Customers from Customers
-- where name not in 
-- (select c.name from Customers c
-- inner join Orders o on c.id=o.customerId);


select c.name as Customers from Customers c
left join Orders o on c.id=o.customerId 
where o.id is null; 