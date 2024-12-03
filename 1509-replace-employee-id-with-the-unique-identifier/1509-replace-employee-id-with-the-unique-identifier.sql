# Write your MySQL query statement below
select es.name,eu.unique_id from Employees es
left join EmployeeUNI eu on es.id=eu.id;