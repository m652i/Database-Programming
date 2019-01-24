CREATE TABLE Suppliers(
     SupplierNo varchar(5),
     Name varchar(20),
     Status Number(10),
     City varchar(20),
     
     primary key(SupplierNo)
);

Create table Parts(
    PartNo varchar(5),
    Name varchar(20),
    Color varchar(10),
    Weight Number(10),
    City varchar(20),
    
    primary key(PartNo)
);

CREATE TABLE Projects(
    ProjectNo varchar(5),
    Name varchar(20),
    City varchar(20),
     
    primary key(ProjectNo)
);

CREATE TABLE Shipments(
    SupplierNo varchar(5),
    PartNo varchar(5),
    ProjectNo varchar(5),
    Quantity Number(20),
    
    primary key(SupplierNo, PartNo, ProjectNo)
);

commit;

insert into Suppliers values ('S2','JONES','10','PARIS');
insert into Suppliers values ('S3','BLAKE','30','PARIS');
insert into Suppliers values ('S4','CLARK','20','LONDON');
insert into Suppliers values ('S5','ADAMS','30','ATHENS');

insert into Parts values ('P1','NUT','RED','12','LONDON');
insert into Parts values ('P2','BOLT','GREEN','17','PARIS');
insert into Parts values ('P3','SCREW','BLUE','17','ROME');
insert into Parts values ('P4','SCREW','RED','14','LONDON');
insert into Parts values ('P5','CAMERA','BLUE','32','PARIS');
insert into Parts values ('P6','WRENCH','RED','19','LONDON');
insert into Parts values ('P7','C-O-G','GREEN','12','ROME');

insert into Projects values ('J1','SORTER','PARIS');
insert into Projects values ('J2','PUNCH','ROME');
insert into Projects values ('J3','READER','ATHENS');
insert into Projects values ('J4','CONSOLE','ATHENS');
insert into Projects values ('J5','COLLATOR','LONDON');
insert into Projects values ('J6','TERMINAL','OSLO');
insert into Projects values ('J7','TAPE','LONDON');
insert into Projects values ('J8','DRUM','LONDON');

insert into Shipments values ('S1','P1','J1','200');
insert into Shipments values ('S1','P1','J4','700');
insert into Shipments values ('S1','P3','J1','450');
insert into Shipments values ('S1','P3','J2','210');
insert into Shipments values ('S1','P3','J3','700');
insert into Shipments values ('S2','P3','J4','509');
insert into Shipments values ('S2','P3','J5','600');
insert into Shipments values ('S2','P3','J6','400');
insert into Shipments values ('S2','P3','J7','812');
insert into Shipments values ('S3','P5','J6','750');
insert into Shipments values ('S3','P3','J2','215');
insert into Shipments values ('S3','P4','J1','512');
insert into Shipments values ('S3','P6','J2','313');
insert into Shipments values ('S4','P6','J3','314');
insert into Shipments values ('S4','P2','J6','250');
insert into Shipments values ('S4','P5','J5','179');
insert into Shipments values ('S4','P5','J2','513');
insert into Shipments values ('S5','P7','J4','145');
insert into Shipments values ('S5','P1','J5','269');
insert into Shipments values ('S5','P3','J7','874');
insert into Shipments values ('S5','P4','J4','476');
insert into Shipments values ('S5','P5','J4','529');
insert into Shipments values ('S5','P6','J4','318');
insert into Shipments values ('S5','P2','J4','619');

commit;







alter table Shipments 
    add ShipDate date;

alter table Shipments 
    add ArriveDate date;
    
    
select * from Shipments;
update Shipments 
SET Shipdate = TO_DATE('2/1/18','MM/DD/YY'),Arrivedate = TO_DATE('2/4/18','MM/DD/YY')
Where SupplierNo = 'S1'AND PartNo = 'P1'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('12/15/17','MM/DD/YY'),Arrivedate = TO_DATE('1/8/18','MM/DD/YY')
Where SupplierNo = 'S1'AND PartNo = 'P3'AND ProjectNo = 'J1';
UPDATE Shipments
SET Shipdate = TO_DATE('11/2/17','MM/DD/YY'),Arrivedate = TO_DATE('11/18/17','MM/DD/YY')
Where SupplierNo = 'S1'AND PartNo = 'P3'AND ProjectNo = 'J2';
UPDATE Shipments
SET Shipdate = TO_DATE('8/5/17','MM/DD/YY'),Arrivedate = TO_DATE('9/1/17','MM/DD/YY')
Where SupplierNo = 'S1'AND PartNo = 'P3'AND ProjectNo = 'J3';
UPDATE Shipments
SET Shipdate = TO_DATE('8/5/17','MM/DD/YY'),Arrivedate = TO_DATE('8/9/17','MM/DD/YY')
Where SupplierNo = 'S2'AND PartNo = 'P3'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('7/3/17','MM/DD/YY'),Arrivedate = TO_DATE('7/29/17','MM/DD/YY')
Where SupplierNo = 'S2'AND PartNo = 'P3'AND ProjectNo = 'J5';
UPDATE Shipments
SET Shipdate = TO_DATE('9/3/17','MM/DD/YY'),Arrivedate = TO_DATE('9/10/17','MM/DD/YY')
Where SupplierNo = 'S2'AND PartNo = 'P3'AND ProjectNo = 'J6';
UPDATE Shipments
SET Shipdate = TO_DATE('2/5/18','MM/DD/YY'),Arrivedate = TO_DATE('2/15/18','MM/DD/YY')
Where SupplierNo = 'S2'AND PartNo = 'P3'AND ProjectNo = 'J7';
UPDATE Shipments
SET Shipdate = TO_DATE('1/6/18','MM/DD/YY'),Arrivedate = TO_DATE('1/14/18','MM/DD/YY')
Where SupplierNo = 'S3'AND PartNo = 'P5'AND ProjectNo = 'J6';
UPDATE Shipments
SET Shipdate = TO_DATE('3/5/18','MM/DD/YY'),Arrivedate = TO_DATE('3/15/18','MM/DD/YY')
Where SupplierNo = 'S3'AND PartNo = 'P3'AND ProjectNo = 'J2';
UPDATE Shipments
SET Shipdate = TO_DATE('2/27/18','MM/DD/YY'),Arrivedate = TO_DATE('3/6/18','MM/DD/YY')
Where SupplierNo = 'S3'AND PartNo = 'P4'AND ProjectNo = 'J1';
UPDATE Shipments
SET Shipdate = TO_DATE('6/15/17','MM/DD/YY'),Arrivedate = TO_DATE('6/27/17','MM/DD/YY')
Where SupplierNo = 'S3'AND PartNo = 'P6'AND ProjectNo = 'J2';
UPDATE Shipments
SET Shipdate = TO_DATE('6/17/17','MM/DD/YY'),Arrivedate = TO_DATE('6/30/17','MM/DD/YY')
Where SupplierNo = 'S4'AND PartNo = 'P6'AND ProjectNo = 'J3';
UPDATE Shipments
SET Shipdate = TO_DATE('5/2/17','MM/DD/YY'),Arrivedate = TO_DATE('6/2/17','MM/DD/YY')
Where SupplierNo = 'S4'AND PartNo = 'P2'AND ProjectNo = 'J6';
UPDATE Shipments
SET Shipdate = TO_DATE('5/5/17','MM/DD/YY'),Arrivedate = TO_DATE('5/10/17','MM/DD/YY')
Where SupplierNo = 'S4'AND PartNo = 'P5'AND ProjectNo = 'J5';
UPDATE Shipments
SET Shipdate = TO_DATE('9/15/17','MM/DD/YY'),Arrivedate = TO_DATE('10/1/17','MM/DD/YY')
Where SupplierNo = 'S4'AND PartNo = 'P5'AND ProjectNo = 'J2';
UPDATE Shipments
SET Shipdate = TO_DATE('10/2/17','MM/DD/YY'),Arrivedate = TO_DATE('10/23/17','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P7'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('11/5/17','MM/DD/YY'),Arrivedate = TO_DATE('11/17/17','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P1'AND ProjectNo = 'J5';
UPDATE Shipments
SET Shipdate = TO_DATE('12/12/17','MM/DD/YY'),Arrivedate = TO_DATE('1/4/18','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P3'AND ProjectNo = 'J7';
UPDATE Shipments
SET Shipdate = TO_DATE('12/22/17','MM/DD/YY'),Arrivedate = TO_DATE('1/16/18','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P4'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('5/7/18','MM/DD/YY'),Arrivedate = TO_DATE('6/1/18','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P5'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('4/23/18','MM/DD/YY'),Arrivedate = TO_DATE('5/2/18','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P6'AND ProjectNo = 'J4';
UPDATE Shipments
SET Shipdate = TO_DATE('4/20/18','MM/DD/YY'),Arrivedate = TO_DATE('5/2/18','MM/DD/YY')
Where SupplierNo = 'S5'AND PartNo = 'P2'AND ProjectNo = 'J4';

/* Average days shipping of every of every single entry */
SELECT COUNT(*) ,CEIL(AVG(ArriveDate - Shipdate))
FROM Shipments

/* Average days shipping of each part, by part number */
SELECT PartNo, COUNT(*) ,CEIL(AVG(ArriveDate - Shipdate))
FROM Shipments
GROUP BY PartNo
ORDER BY PartNo;

/* Number of shipments that arrived in 2017*/
SELECT COUNT(*)
FROM Shipments
WHERE '01-JAN-2018' > ArriveDate AND ArriveDate > '12-DEC-2016';

/* All shipments that arrived in 2017*/
SELECT *
FROM Shipments
WHERE '01-JAN-2018' > ArriveDate AND ArriveDate > '12-DEC-2016';
commit;

