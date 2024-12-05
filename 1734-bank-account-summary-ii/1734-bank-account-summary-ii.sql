# Write your MySQL query statement below
Select U.name,sum(T.amount) as balance from Users U , Transactions T 
where U.account = T.account group by U.account having balance > 10000;