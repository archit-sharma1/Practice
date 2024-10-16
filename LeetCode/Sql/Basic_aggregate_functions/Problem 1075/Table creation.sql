
create table employee(
 employee_id       int not null primary key,
 name              varchar(30),
 experience_years  int
)

create table Project (
 project_id   int not null,
 employee_id  int not null   
constraint fk_project foreign key (employee_id) references employee(employee_id),
 constraint pk_project primary key (project_id,employee_id)

)

insert into employee
values
(1,'Khaled',3),                
(2,'Ali',2),                
(3,'John',1),                
(4,'Doe',2)    


insert into Project
values
(1,1),           
(1,2),           
(1,3),           
(2,1),           
(2,4)   