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

insert into Suppliers values ('S1','Smith',20,'London');

