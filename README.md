# Demo-Application-With-Spring-And-H2-Database

## Spring
Spring is a lightweight framework. It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF, etc. The framework, in broader sense, can be defined as a structure where we find solution of the various technical problems.
The Spring framework comprises several modules such as IOC, AOP, DAO, Context, ORM, WEB MVC etc.

## H2 Database 
H2 is an open-source lightweight Java database. It can be embedded in Java applications or run in the client-server mode. H2 database can be configured to run as in-memory database, which means that data will not persist on the disk.

In This Project I Have Used Constructor Based Dependency Injection Which Is One Of The Way To Implement IOC (Inversion Of Control).

## Steps For Execution
1. Clone The Repository 
2. Go To The "H2DemoApplicaion" Class And Run It. It Will Start The Server, Create A Database And A Table With A Default Entry (0, "Default").
3. Open A Web Browser
4. Use The Following URLs To Run The Operations
    1. http://localhost:8080/addData?id=101&name=Test - To Add Data (101,"Test") To The Table.
    2. http://localhost:8080/fetchData - To Fetch All Data From The Table
    3. http://localhost:8080/fetchById/{id} - Pass An ID (In Place OF {id}) To Get Data For The Passed ID)
    4. http://localhost:8080/deleteById/{id} - Pass An ID (In Place OF {id}) To Delete Data For The Passed ID)

*NOTE: Here In The Above URLs 8080 Is The Default Port Number On Which Application Will Run. Check Yours And Change The URLs Accordingly.*
