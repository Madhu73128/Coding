# Write your MySQL query statement below
/*select current.id as Id from Weather current
inner join Weather previous on current.recordDate=1+previous.recordDate 
and current.temperature>previous.temperature;*/

select current.id as Id from Weather current,Weather previous where date_sub(current.recordDate,interval 1 day)=previous.recordDate and current.temperature>previous.temperature;