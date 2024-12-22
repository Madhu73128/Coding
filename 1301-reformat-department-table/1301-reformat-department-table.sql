# Write your MySQL query statement below
select id,
max(case when month='Jan' then revenue else null end) as Jan_revenue,
max(case when month='Feb' then revenue else null end) as Feb_revenue,
max(case when month='Mar' then revenue else null end) as Mar_revenue,
max(case when month='Apr' then revenue else null end) as Apr_revenue,
max(case when month='May' then revenue else null end) as May_revenue,
max(case when month='Jun' then revenue else null end) as Jun_revenue,
max(case when month='Jul' then revenue else null end) as Jul_revenue,
max(case when month='Aug' then revenue else null end) as Aug_revenue,
max(case when month='Sep' then revenue else null end) as Sep_revenue,
max(case when month='Oct' then revenue else null end) as Oct_revenue,
max(case when month='Nov' then revenue else null end) as Nov_revenue,
max(case when month='Dec' then revenue else null end) as Dec_revenue
from Department 
group by id;