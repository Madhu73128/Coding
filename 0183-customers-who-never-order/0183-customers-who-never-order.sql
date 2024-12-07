# Write your MySQL query statement below

-- select name as Customers from Customers 
-- where id not in(select customerId from Orders);
 

-- select name as Customers from Customers   #alais may also be given again
-- where id not in   #dont use name instead of id
-- (select c.name from Customers c
-- inner join Orders o on c.id=o.customerId);


select c.name as Customers from Customers c
left join Orders o on c.id=o.customerId 
where o.id is null; 