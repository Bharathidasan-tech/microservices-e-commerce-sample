INSERT INTO users(user_id,username,firstName,lastName,email,mobile) VALUES (1,'bharathi','Bharathidasan','Manickam','bhxxxyy@gmail.com',9999000000);
INSERT INTO users(user_id, username,firstName,lastName,email,mobile) VALUES (2, 'bharathi1','Bharathi','John','bhxxjh@gmail.com',9999000001);


INSERT INTO address(address_id,fullName,mobile,pincode,address1,address2,email,city,state,country,landmark,addressType) VALUES (1,'Bharathidasaan',9999000000,456234,'Test 1', 'test 2','stest@gmai.com', 'trst','tamil nadu','India','Near Place','default');
INSERT INTO address(address_id,fullName,mobile,pincode,address1,address2,email,city,state,country,landmark,addressType) VALUES (2,'Bharathidasaan',9999000000,456234,'Test 1', 'test 2','stest@gmai.com', 'trst','tamil nadu','India','Near Place','option');

INSERT INTO user_x_address(user_id, address_id) VALUES ((select user_id from users where user_id=1),
(select address_id from address where address_id=1));
INSERT INTO user_x_address(user_id, address_id) VALUES ((select user_id from users where user_id=1),
(select address_id from address where address_id=1));

commit;
