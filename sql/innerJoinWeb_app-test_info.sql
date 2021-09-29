select test_info.id as testN, account.name as acc_name, test_info.date, test.name as test_name, test_info.is_passed from web_app.test_info 
	inner join web_app.test on web_app.test_info.test_id = web_app.test.id
    inner join web_app.account on web_app.test_info.acc_id = web_app.account.id;