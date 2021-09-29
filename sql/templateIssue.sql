select * from pg_stat_activity where datname = 'template1';
select pg_terminate_backend(pid) from pg_stat_activity where datname = 'template1';