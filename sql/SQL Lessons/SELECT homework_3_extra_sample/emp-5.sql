/* 5. Найти количество сотрудников в отделах и посмотреть, сколько всего денег получает отдел.

   Учитываются только ныне работающих в отделе сотрудников и только их актуальные зарплаты.
 */

SELECT dept_name, COUNT(employees.emp_no), SUM(salary), SUM(salary) / COUNT(employees.emp_no) AS average
FROM departments
JOIN dept_emp
ON departments.dept_no = dept_emp.dept_no
JOIN employees
ON dept_emp.emp_no = employees.emp_no
JOIN salaries
ON employees.emp_no = salaries.emp_no
WHERE dept_emp.to_date = '9999-01-01'
  AND salaries.to_date = '9999-01-01'
GROUP BY departments.dept_name
ORDER BY departments.dept_name;
