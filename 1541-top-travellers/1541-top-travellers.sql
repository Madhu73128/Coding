# Write your MySQL query statement below
with cte as 
    (
        select user_id,
        sum(distance)as travelled_distance 
        from Rides 
        group by user_id
    )
select u.name,
    ifnull(c.travelled_distance,0) as travelled_distance
    from Users u
    left join cte c on u.id=c.user_id 
    order by travelled_distance desc,name asc;


-- select u.name,sum(r.distance) as travelled_distance from Users u
-- inner join Rides r on u.id=r.user_id order by travelled_distance desc,name asc;