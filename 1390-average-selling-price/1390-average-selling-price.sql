# Write your MySQL query statement below


/*select p.product_id,ifnull(round(sum(u.units*p.price)/sum(u.units),2),0) 
as average_price from Prices p
left join UnitsSold u on p.product_id=u.product_id
and u.purchase_date between p.start_date and p.end_date #is between wrong#where not working
group by p.product_id;*/


select p.product_id,ifnull(round(sum(u.units*p.price)/sum(u.units),2),0) 
as average_price from Prices p
left join UnitsSold u on p.product_id=u.product_id
and u.purchase_date>=p.start_date and u.purchase_date<=p.end_date #where not working
group by p.product_id;