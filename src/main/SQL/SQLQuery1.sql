CREATE DATABASE ProductManagement
GO

USE ProductManagement
GO

CREATE TABLE MEMBER(
    Id INT PRIMARY KEY IDENTITY(1,1),
    FirstName NVARCHAR(255),
    LastName NVARCHAR(255),
    Address TEXT,
    Phone VARCHAR(11),
    Role BIT,
    Email VARCHAR(100),
    Password VARCHAR(100)
)
GO

CREATE TABLE MANUFACTURER(
    Id INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(255)
)
GO

CREATE TABLE CATEGORY(
    Id INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(255)
)
GO

CREATE TABLE PRODUCT(
    Id INT PRIMARY KEY IDENTITY(1,1),
    ProductName NVARCHAR(255),
    ImagePath TEXT,
    ManuFacturerId INT,
    CategoryId INT,
    CONSTRAINT FK_Product_ManuFacturer FOREIGN KEY (ManuFacturerId) REFERENCES MANUFACTURER(Id) ON DELETE CASCADE,
    CONSTRAINT FK_Product_Category FOREIGN KEY (CategoryId) REFERENCES CATEGORY(Id)
)
GO

CREATE TABLE IMAGEDETAIL(
	Id INT PRIMARY KEY IDENTITY(1,1),
    ImagePath TEXT,
    ProductId INT,
    CONSTRAINT FK_ImageDetail FOREIGN KEY (ProductId) REFERENCES PRODUCT(Id) ON DELETE CASCADE
)
GO

CREATE TABLE ORDER_PRODUCT(
    Id INT PRIMARY KEY IDENTITY(1,1),
    TotalPrice MONEY,
    MemberId INT,
    CreateDate DATE,
    UpdateTime DATE
)
GO

CREATE TABLE LINEITEM(
    OrderID INT,
    ProductID INT,
    NumberProduct INT,
    PRIMARY KEY(OrderID,ProductId),
    CONSTRAINT FK_LineItem_Order FOREIGN KEY (OrderID) REFERENCES ORDER_PRODUCT(Id) ON DELETE CASCADE,
    CONSTRAINT FK_LineItem_Product FOREIGN KEY (ProductID) REFERENCES PRODUCT(Id) ON DELETE CASCADE
)
GO

CREATE TABLE COLOR(
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Color VARCHAR(100)
)

CREATE TABLE PRODUCT_COLOR(
    ProductId INT,
    ColorId INT,
    PRIMARY KEY(ProductID,ColorId),
    CONSTRAINT FK_Product_Color FOREIGN KEY (ProductID) REFERENCES PRODUCT(Id) ON DELETE CASCADE,
    CONSTRAINT FK_Color_Product FOREIGN KEY (ColorId) REFERENCES COLOR(Id) ON DELETE CASCADE,
)



