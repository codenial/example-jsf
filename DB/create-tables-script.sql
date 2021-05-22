CREATE TABLE agency_prospects(
	prospect_id VARCHAR(20)  NOT NULL,
	prospect_name VARCHAR(30)  NOT NULL,
	prospect_lastName VARCHAR(40)  NOT NULL,
	prospect_email VARCHAR(50)  NOT NULL,
	prospect_phone VARCHAR(15)  NOT NULL,
	prospect_address VARCHAR(70),
	prospect_city VARCHAR(35) ,
	prospect_state VARCHAR(30),

	CONSTRAINT Pk_agency_prospect PRIMARY KEY (prospect_id)
);

CREATE TABLE agency_prospect_car(
	prospect_id VARCHAR(20)  NOT NULL,
	car_id VARCHAR(255)  NOT NULL,

	CONSTRAINT Pk_agency_prospect_car PRIMARY KEY (prospect_id,car_id),
	FOREIGN KEY (prospect_id) REFERENCES agency_prospects(prospect_id),
	FOREIGN KEY (car_id) REFERENCES agency_cars(car_id)
);

CREATE TABLE request_follow_up(
	request_id VARCHAR(20)  NOT NULL,
	prospect_id VARCHAR(20)  NOT NULL,
	request_open BIT NOT NULL,
	request_created_at DATETIME NOT NULL,
	request_closed_at DATETIME,

	CONSTRAINT Pk_request_follow_up PRIMARY KEY (request_id),
	FOREIGN KEY (prospect_id) REFERENCES agency_prospects(prospect_id)
);

CREATE TABLE request_comments(
	comment_id INT  NOT NULL,
	request_id VARCHAR(20)  NOT NULL,
	comment_text VARCHAR(300)  NOT NULL,
	published_at DATETIME NOT NULL,
	published_by VARCHAR(100) NOT NULL,

	CONSTRAINT Pk_request_comments PRIMARY KEY (comment_id),
	FOREIGN KEY (request_id) REFERENCES request_follow_up(request_id)
);