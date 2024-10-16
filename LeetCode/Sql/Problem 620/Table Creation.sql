create table cinema(
 id              int,      
 movie           varchar(30),  
 description     varchar(30), 
 rating          float, 
 constraint df_rating check (rating between 0 and 10)
)

INSERT INTO cinema
values
(1,'War','great 3D',8.9),
(2,'Science','fiction',8.5),
(3,'irish','boring',6.2),
(4,'Ice song','Fantacy',8.6),
(5,'House card','Interesting',9.1)
