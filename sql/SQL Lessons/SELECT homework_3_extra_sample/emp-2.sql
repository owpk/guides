/* 2. Выбрать максимальную зарплату у сотрудника.

1-й вариант интерпретации задания.
Найти максимальную зарплату по каждому из сотрудников (в т.ч. уже не работающих) за всё время работы.
Должность проставляется последняя на текущий момент, т.к. точного соответствия между изменением должности
и изменением зарплаты в базе нет.
*/

SELECT employees.emp_no, title, CONCAT_WS(' ', first_name, last_name) AS full_name, MAX(salary) AS max_salary
FROM employees
LEFT JOIN titles
ON employees.emp_no=titles.emp_no
LEFT JOIN salaries
ON employees.emp_no=salaries.emp_no
WHERE titles.to_date = (
		SELECT MAX(to_date) FROM titles WHERE titles.emp_no = employees.emp_no
        )
GROUP BY employees.emp_no, title, full_name;

/* 2-й вариант интерпретации задания.
Найти максимальную зарплату какого-то конкретного сотрудника (тут для примера сотрудник id 12498).
Ограничение, чтобы сотрудник работал по сей день, я в этом варианте не ставил, поэтому должность приходится
искать не текущую, а последнюю по дате to_date.
*/
SELECT employees.emp_no, title, CONCAT_WS(' ', first_name, last_name) AS full_name, MAX(salary)
FROM employees
LEFT JOIN titles
ON employees.emp_no = titles.emp_no
LEFT JOIN salaries
ON employees.emp_no = salaries.emp_no
WHERE employees.emp_no = 12498
	AND titles.to_date = (SELECT MAX(to_date) FROM titles WHERE titles.emp_no = employees.emp_no)
GROUP BY employees.emp_no, title, full_name;

/* 3-й вариант интерпретации задания. 
Найти действительного сотрудника с действительной максимальной зарплатой.
Т.к. мы ищем только действительных (работающих в настоящее время) сотрудников, то и должности их
ищем только действительные, поэтому можем обойтись обычным join titles, без вложенного подзапроса.
*/

SELECT employees.emp_no, title, CONCAT_WS(' ', first_name, last_name) AS full_name, salary
FROM employees
LEFT JOIN titles
ON employees.emp_no = titles.emp_no
LEFT JOIN salaries
ON employees.emp_no = salaries.emp_no
WHERE salary=
	(SELECT MAX(salary) FROM salaries
		WHERE to_date = '9999-01-01')
	AND salaries.to_date = '9999-01-01'
	AND titles.to_date = '9999-01-01';

