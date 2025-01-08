# Write your MySQL query statement below

select s.user_id,ifnull(round(sum(c.action='confirmed')/count(*),2),0) as confirmation_rate
from Signups s
left join Confirmations c on s.user_id=c.user_id
group by user_id;

-- https://www.youtube.com/watch?v=j7z9FIYfn9s&list=PLtfxzVLWb-B93ewzBITsarfxNxJD4XJHd&index=17