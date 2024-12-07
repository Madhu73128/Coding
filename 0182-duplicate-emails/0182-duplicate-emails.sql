# Write your MySQL query statement below


select email as Email from Person
group by email having count(email)>1;#where not working bcoz aggregation funcs+having


/*select email as Email from Person
group by email having count(distinct id)>1;#where not working bcoz aggregation funcs+having*/