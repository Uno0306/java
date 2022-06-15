-- DB scott
USE scott;

-- Table
DROP TABLE donor CASCADE;
DROP TABLE recipient CASCADE;
DROP TABLE bt_project CASCADE;

CREATE TABLE donor (
       donor_id          	VARCHAR(20) PRIMARY KEY,
       name               	VARCHAR(20) NOT NULL,
       age         			INT(3) 	 NOT NULL,
       sex                	VARCHAR(20) NOT NULL,
       blood_type          	VARCHAR(20) NOT NULL,
       purpose_donation		VARCHAR(50) NOT NULL
);

CREATE TABLE recipient (
       recipient_id         VARCHAR(20) PRIMARY KEY,
       name               	VARCHAR(20) NOT NULL,
       age         			INT(3)    NOT NULL,
       sex                	VARCHAR(20) NOT NULL,
       blood_type          	VARCHAR(20) NOT NULL,
       purpose_transfusion	VARCHAR(50) NOT NULL
);


CREATE TABLE bt_project (
	   bt_project_name 		VARCHAR(50)  NOT NULL,
	   bt_project_id    	VARCHAR(50)  PRIMARY KEY,
       donor_id          	VARCHAR(20)  NOT NULL,
       recipient_id         VARCHAR(20)  NOT NULL, 
       bt_content    		VARCHAR(100) NOT NULL
);


ALTER TABLE bt_project ADD FOREIGN KEY (recipient_id) REFERENCES recipient (recipient_id) ON DELETE CASCADE ON UPDATE NO ACTION;
ALTER TABLE bt_project ADD FOREIGN KEY (donor_id)  REFERENCES donor (donor_id) ON DELETE CASCADE ON UPDATE NO ACTION;