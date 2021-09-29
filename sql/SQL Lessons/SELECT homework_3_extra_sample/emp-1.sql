/* 1. Выбрать среднюю зарплату по отделам.
В задании не указано - на сегодняшний день или за всю историю.
Выбран первый вариант, для чего отфильтровываются только работающих в отделе на сегодняшний день
сотрудников (поле to_date в dept_emp равно 9999-01-01) и зарплаты, действующие на сегодняшний день
(поле to_date в salaries равно 9999-01-01).
На свежезагруженной неотредактированной базе получаются такие цифры:
Sales	88852.9695
Marketing	80058.8488
Finance	78559.9370
Research	67913.3750
Production	67843.3020
Development	67657.9196
Customer Service	67285.2302
Quality Management	65441.9934
Human Resources	63921.8998
*/
SELECT dept_name, AVG(salary) AS avg_salary
FROM departments
LEFT JOIN dept_emp
ON departments.dept_no=dept_emp.dept_no
LEFT JOIN employees
ON dept_emp.emp_no=employees.emp_no
LEFT JOIN salaries
ON employees.emp_no=salaries.emp_no
WHERE dept_emp.to_date='9999-01-01'
  AND salaries.to_date='9999-01-01'
GROUP BY dept_name
ORDER BY avg_salary DESC;