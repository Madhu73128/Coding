# Write your MySQL query statement below
select p.project_id,
        round(sum(e.experience_years)/count(p.employee_id),2) as average_years
        #avg(e.experience_years) can be placed in place of sum(e.experience_years)/count(p.employee_id)
from Project p 
inner join Employee e on p.employee_id=e.employee_id #left join also works
group by p.project_id;