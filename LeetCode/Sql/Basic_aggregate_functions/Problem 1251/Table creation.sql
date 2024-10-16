create table Prices(
 product_id     int,
 start_date     date,
 end_date       date,
 price          int,
 constraint pk_Prices Primary key (product_id,start_date,end_date)
);

create table UnitsSold(
 product_id     int,
 purchase_date  date,
 units          int
);

INSERT INTO Prices
values
(1,'2019-02-17','2019-02-28',5),      
(1,'2019-03-01','2019-03-22',20),     
(2,'2019-02-01','2019-02-20',15),     
(2,'2019-02-21','2019-03-31',30)

---Test case-----
-- (1,'2019-01-03','2019-01-07',14),    
-- (1,'2019-01-08','2019-01-13',10),    
-- (1,'2019-01-14','2019-01-27',8),     
-- (2,'2019-01-24','2019-02-11',16),    
-- (2,'2019-02-12','2019-02-22',19),    
-- (2,'2019-02-23','2019-03-09',14),    
-- (3,'2019-01-02','2019-01-08',9),     
-- (4,'2019-01-06','2019-01-16',13),    
-- (4,'2019-01-17','2019-02-01',16),    
-- (4,'2019-02-02','2019-02-06',10)  

INSERT INTO UnitsSold
values
(1,'2019-02-25',0),   
(1,'2019-03-01',0),    
(2,'2019-02-10',200),   
(2,'2019-03-22',30) 

---Test case-----
-- (1,'2019-01-15',1),     
-- (1,'2019-01-20',3),     
-- (1,'2019-01-19',3),     
-- (2,'2019-02-26',5),     
-- (2,'2019-02-04',4),     
-- (2,'2019-02-09',4),     
-- (3,'2019-01-05',5),     
-- (4,'2019-02-03',4),     
-- (4,'2019-01-10',4),     
-- (4,'2019-01-31',4) 
