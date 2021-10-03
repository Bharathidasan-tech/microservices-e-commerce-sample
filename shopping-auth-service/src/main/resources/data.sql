INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('web', '{bcrypt}$2a$10$7/mdIez3yiUL//uDzMXPYeGn/0kO1TqVA/qzWGTqvyidN4jlBlveu', 'http://localhost:9090/code', 'READ,WRITE', '3600', '10000', 'microservice', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO PERMISSION (NAME) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT INTO role (role_name) VALUES
		('ROLE_admin'),('ROLE_editor'),('ROLE_operator');

 INSERT INTO PERMISSION_ROLE (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read Editor */
     (3,2),  /* update Editor */
     (2,3);  /* read operator */


 insert into user (id, username,password, email, enabled, account_Non_Expired, credentials_Non_Expired, account_Non_Locked) VALUES ('1', 'admin','{bcrypt}$2a$10$Wab7d4gCp6IzSEKxRk29RuBGtz3HZfQSS2lJsaEVJsTw2h2XUDowO', 'bharathida@gmail.com', true, true, true, true);
 insert into  user (id, username,password, email, enabled, account_Non_Expired, credentials_Non_Expired, account_Non_Locked) VALUES ('2', 'bharathi', '{bcrypt}$2a$10$gKnMgHu9WYpr5A6gTkgCSeelni7VWd.IJBv4Eq.ur5Up4tbbcjRsi','bharathida1@gmail.com', true, true, true, true);
 insert into  user (id, username,password, email, enabled, account_Non_Expired, credentials_Non_Expired, account_Non_Locked) VALUES ('3', 'user', '{bcrypt}$2a$10$cr.3XigVVfvg5pNxd.tNa.UPp2uiWg8aCEvgf1Z.ANKPJ3zpLwOsa','bharathida2@gmail.com', true, true, true, true);
 /*
 passowrds:
 admin - admin
 bharathi - bharathi
 user - user
 */


INSERT INTO ROLE_USER (ROLE_ID, USER_ID)
    VALUES 
    (1, 1), /* admin-admin */
    (2, 2), /* bharathi-editor */ 
    (3, 3); /* user-operatorr */ 