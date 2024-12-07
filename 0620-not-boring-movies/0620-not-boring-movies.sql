# Write your MySQL query statement below

/*select * from Cinema 
where id%2!=0 and description!='boring' 
order by rating desc;*/



select * from Cinema 
where id%2<>0 and description<>'boring' #<> ===== != in SQL
order by rating desc;