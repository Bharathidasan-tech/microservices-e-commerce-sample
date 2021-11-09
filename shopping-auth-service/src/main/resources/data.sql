

INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('web', '{bcrypt}$2a$10$7/mdIez3yiUL//uDzMXPYeGn/0kO1TqVA/qzWGTqvyidN4jlBlveu', 'http://localhost:9090/code', 'READ,WRITE', '3600', '10000', 'microservice', 'authorization_code,password,refresh_token,implicit', '{}');

INSERT INTO permission (id,NAME) VALUES  (1,'create_profile');
INSERT INTO permission (id, NAME) VALUES  (2,'read_profile');
INSERT INTO permission (id, NAME) VALUES  (3, 'update_profile');
INSERT INTO permission (id, NAME) VALUES  (4, 'delete_profile');


INSERT INTO role (id,name) VALUES (1, 'ROLE_admin');
INSERT INTO role (id,name) VALUES (2, 'ROLE_user');
INSERT INTO role (id,name) VALUES (3, 'ROLE_view');

INSERT INTO permission_role (permission_id, role_id) VALUES (1,1); /*create-> admin */
INSERT INTO permission_role (permission_id, role_id) VALUES (2,1); /* read admin */
INSERT INTO permission_role (permission_id, role_id) VALUES (3,1); /* update admin */
INSERT INTO permission_role (permission_id, role_id) VALUES (4,1); /* delete admin */
INSERT INTO permission_role (permission_id, role_id) VALUES (2,2);  /* read user */
INSERT INTO permission_role (permission_id, role_id) VALUES (3,2);  /* update user */
INSERT INTO permission_role (permission_id, role_id) VALUES (2,3);  /* read user */     

insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'admin','{bcrypt}$2a$10$Wab7d4gCp6IzSEKxRk29RuBGtz3HZfQSS2lJsaEVJsTw2h2XUDowO', 'bharathida@gmail.com', true, true, true, true);
insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'bharathi', '{bcrypt}$2a$10$gKnMgHu9WYpr5A6gTkgCSeelni7VWd.IJBv4Eq.ur5Up4tbbcjRsi','bharathida1@gmail.com', true, true, true, true);
insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('3', 'user', '{bcrypt}$2a$10$cr.3XigVVfvg5pNxd.tNa.UPp2uiWg8aCEvgf1Z.ANKPJ3zpLwOsa','bharathida2@gmail.com', true, true, true, true);
 /*
 passowrds:
 admin - admin
 bharathi - bharathi
 user - user
 */


INSERT INTO role_user (role_id, user_id)   VALUES (1, 1); /* admin-admin */
INSERT INTO role_user (role_id, user_id)   VALUES (2, 2); /* bharathi-user */     
INSERT INTO role_user (role_id, user_id)   VALUES (3, 3); /* user-user */ 

commit;