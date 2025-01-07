# Write your MySQL query statement below
-- with cte as (select distinct salary, DENSE_RANK() over(order by salary desc) as 'rank' 
-- from Employee)
-- select max(salary) as SecondHighestSalary 
-- from cte 
-- where rank=2;



-- SELECT  MAX(SALARY) AS SecondHighestSalary 
-- FROM EMPLOYEE 
-- WHERE SALARY <>(SELECT MAX(SALARY) FROM EMPLOYEE);


SELECT(SELECT DISTINCT
    Salary 
FROM
    Employee
ORDER BY Salary DESC
LIMIT 1 OFFSET 1)AS SecondHighestSalary;


-- SELECT
--     IFNULL(
--       (SELECT DISTINCT Salary
--        FROM Employee
--        ORDER BY Salary DESC
--         LIMIT 1 OFFSET 1),
--     NULL) AS SecondHighestSalary;