# Write your MySQL query statement below
select customer_id,count(*) as count_no_trans from Visits
where visit_id not in(select visit_id from Transactions) group by customer_id;
-- customer_id 30 doesnt make any transactions for 1 time
-- customer_id 96 doesnt make any transactions for 1 time
-- customer_id 54 doesnt make any transactions for 2 times