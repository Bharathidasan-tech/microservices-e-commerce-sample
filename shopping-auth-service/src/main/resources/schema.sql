
create table oauth_client_details (
  client_id varchar2(255) not null,
  client_secret varchar2(255) not null,
  web_server_redirect_uri varchar2(2048) ,
  scope varchar2(255) ,
  access_token_validity int(11) ,
  refresh_token_validity int(11) ,
  resource_ids varchar2(1024) ,
  authorized_grant_types varchar2(1024) ,
  authorities varchar2(1024) ,
  additional_information varchar2(4096) ,
  autoapprove varchar2(255) ,
  primary key (client_id)
);

create table permission (
  id int NOT NULL auto_increment,
  name varchar2(512) ,
  primary key (id),
  unique key name (name)
);

create table role (
  id int NOT NULL auto_increment,
  role_name varchar2(255) ,
  primary key (id),
  unique key role_name (role_name)
);

create table user (
  id int(11) not null auto_increment,
  username varchar2(100) not null,
  password varchar2(1024) not null,
  email varchar2(1024) not null,
  enabled BOOLEAN not null,
  account_Non_Expired BOOLEAN not null,
  credentials_Non_Expired BOOLEAN not null,
  account_Non_Locked BOOLEAN not null,
  primary key (id),
  unique key username (username)
);


create table permission_role (
  permission_id int,
  role_id int,
  PRIMARY KEY (permission_id,role_id),
 foreign key (permission_id) references permission (id),
 foreign key (role_id) references role (id)
);



create table role_user (
  role_id int,
  user_id int,
 PRIMARY KEY (role_id,user_id),
  foreign key (role_id) references role (id),
 foreign key (user_id) references user (id)
);

-- token store
create table oauth_client_token (
  token_id varchar2(256),
  token LONGVARBINARY ,
  authentication_id varchar2(256) PRIMARY KEY,
  user_name varchar2(256),
  client_id varchar2(256)
);

create table oauth_access_token (
  token_id varchar2(256),
  token LONGVARBINARY ,
  authentication_id varchar2(256) PRIMARY KEY,
  user_name varchar2(256),
  client_id varchar2(256),
  authentication LONGVARBINARY ,
  refresh_token varchar2(256)
);

create table oauth_refresh_token (
  token_id varchar2(256),
  token LONGVARBINARY ,
  authentication LONGVARBINARY 
);

create table oauth_code (
  code varchar2(256), authentication LONGVARBINARY 
);

create table oauth_approvals (
	userId varchar2(256),
	clientId varchar2(256),
	scope varchar2(256),
	status varchar2(10),
	expiresAt TIMESTAMP,
	lastModifiedAt TIMESTAMP
);