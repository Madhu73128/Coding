# Write your MySQL query statement below
select name from Customer where referee_id is null or not referee_id=2;


-- select name from customer
-- where referee_id != 2 or referee_id is null;

-- select name from customer
-- where referee_id <> 2 or referee_id is null