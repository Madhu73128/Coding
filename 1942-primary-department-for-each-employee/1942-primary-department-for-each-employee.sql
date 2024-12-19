# Write your MySQL query statement below

-- select 
--     employee_id,
--     case    
--     when count(department_id)=1 then department_id
--     when count(department_id)>1 then sum((primary_flag='Y')*department_id)
--     end as department_id
-- from Employee
-- group by employee_id;


select distinct employee_id,first_value(department_id) 
over(partition by employee_id order by primary_flag asc) as department_id 
from Employee;