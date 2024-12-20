# Write your MySQL query statement below
-- select * from Users 
-- where regexp_like(mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode.com');#wrong

select * from Users 
where regexp_like(mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$');

-- select * from Users 
-- where mail regexp '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$';

#$ denotes end of string