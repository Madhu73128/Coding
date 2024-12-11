# Write your MySQL query statement below
-- with cte as(select actor_id,director_id from ActorDirector 
-- group by actor_id having count(director_id)>=3)
-- select actor_id,director_id from cte;//not working why??

select actor_id,director_id from ActorDirector 
group by actor_id,director_id having count(timestamp)>=3;