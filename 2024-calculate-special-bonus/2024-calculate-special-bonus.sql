# Write your MySQL query statement below
select employee_id,
    case when
    employee_id%2!=0 and substring(name,1,1)!='M' then #substring(name,1,1)(works),left(name,1,1)(not working)
    salary else 
    0 end 
    as bonus 
from Employees
order by employee_id;

-- SELECT employee_id, IF(mod(employee_id, 2) = 1 and SUBSTR(name, 1, 1) != 'M', salary, 0) AS bonus
-- FROM Employees
-- ORDER BY employee_id