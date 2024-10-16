create table department(
 id           int not null primary key,
 name         varchar(30)
)

create table employee(
 id            int not null primary key,
 name          varchar(30) ,
 salary        int     ,
 departmentId  int foreign key references department(id)     
)

insert into department
values
(1,'IT'),    
(2,'Sales')

insert into employee
values
(1,'Joe',85000,1),            
(2,'Henry',80000,2),            
(3,'Sam',60000,2),            
(4,'Max',90000,1),            
(5,'Janet',69000,1),            
(6,'Randy',85000,1),            
(7,'Will',70000,1)  