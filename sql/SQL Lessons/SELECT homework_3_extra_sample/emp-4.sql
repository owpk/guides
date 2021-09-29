/* 4. Посчитать количество сотрудников во всех отделах.

      Учитываем только действительных (работающих на сегодняшний день) сотрудников. */

/* Вариант 1. Простой. */
SELECT dept_name, COUNT(emp_no)
FROM dept_emp
JOIN departments
ON departments.dept_no = dept_emp.dept_no
WHERE to_date='9999-01-01'
GROUP BY dept_name
ORDER BY dept_name;


/* Вариант 2. Запрос с RIGHT JOIN, чтобы найти все отделы, даже такие, в которых нет сотрудников.
   В изначальной базе таких отделов нет, так что вывод совпадёт с первым вариантом, но если,
   к примеру, выполнить запрос
   DELETE FROM dept_emp WHERE dept_no='d009'
   то такой отдел появится - d009, Customer service, плюс, появится почти 15000 сотрудников, которым
   никакой отдел не назначен (ловим их во второй части UNION).
   */
SELECT dept_name, COUNT(emp_no)
FROM dept_emp
RIGHT JOIN departments
ON departments.dept_no = dept_emp.dept_no
WHERE to_date='9999-01-01' OR to_date IS NULL
GROUP BY dept_name

UNION

SELECT 'без отдела', COUNT(employees.emp_no)
FROM employees
LEFT JOIN dept_emp
ON employees.emp_no = dept_emp.emp_no
WHERE dept_emp.emp_no IS NULL;
