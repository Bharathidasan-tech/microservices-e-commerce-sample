CREATE TABLE users
(
   user_id     INT NOT NULL AUTO_INCREMENT,
   username    VARCHAR(255),
   firstName   VARCHAR(255),
   lastName    VARCHAR(255),
   email       VARCHAR(255),
   mobile      BIGINT,   
   PRIMARY KEY (user_id),
   UNIQUE KEY ms_name (username,mobile,email)
);

 CREATE TABLE address
 ( 
 address_id    INT NOT NULL AUTO_INCREMENT,
 fullName      VARCHAR(255),
 mobile    	   BIGINT,
 pincode       INT,
 address1      VARCHAR(255),
 address2      VARCHAR(255),
 email         VARCHAR(255),
 city          VARCHAR(255),
 state         VARCHAR(255),
 country       VARCHAR(255),
 landmark      VARCHAR(255),
 addressType   VARCHAR(255),
 PRIMARY KEY (address_id)
 ); 
 
CREATE TABLE user_x_address
( 
user_id     INT,
address_id  INT,
FOREIGN KEY (user_id) REFERENCES users (user_id),
FOREIGN KEY (address_id) REFERENCES address (address_id)
);