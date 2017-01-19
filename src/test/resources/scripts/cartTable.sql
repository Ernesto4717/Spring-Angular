CREATE TABLE SHIP_TO (
  SHIP_TO_ID int(11) NOT NULL,
  NAME varchar(100) ,
  ADDRESS varchar(250) 
  );

  CREATE TABLE status (
  status_id int(11) NOT NULL,
  description varchar(100) ,
  status_type varchar(20) ,
);

CREATE TABLE cart (
  cart_id int(11) NOT NULL ,
  lines_amount decimal(10,2) ,
  shipping_amount decimal(10,2) ,
  cart_amount decimal(10,2) ,
  ship_to_id int(11),
  status_id int(11) ,
  create_user varchar(20) ,
  create_date varchar(30) ,
  update_user varchar(20) ,
  update_date varchar(30) 
);
