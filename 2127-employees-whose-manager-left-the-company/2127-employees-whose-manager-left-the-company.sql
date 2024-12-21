# Write your MySQL query statement below
with cte as 
(select employee_id,manager_id from Employees where salary<30000)

select employee_id from cte where manager_id
not in(select employee_id from Employees)
order by employee_id;

-- select a.employee_id from Employees a
--  join Employees b on a.employee_id=b.manager_id
-- where b.salary<30000 and b.employee_id is null;