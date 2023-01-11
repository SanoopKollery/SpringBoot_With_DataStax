# BetterReads web app
Companion code for the Java Brains code with me series.

Prerequisites:
1. JDK and IDE installed on your machine
2. Register for a free hosted Cassandra instance: https://dtsx.io/2WQoLWk. You get a a DataStax Astra DB account with a generous free tier that you can use to follow along the code.
License: APL 2.0


mutation{
  createEmployee(
    fname: "First Name",
    lname: "Last Name",
    age: 10,
    joindate:"2022-01-01",
    salary:1000) {
    age
    Salary
  } 
 
}


query{
  employee(id:"90fe4a66-886f-4362-8f64-71fa4f8ba615") {
    fname
    lname
    age
    Salary
    
  }
}


mutation{
  deleteEmployee(id: "90fe4a66-886f-4362-8f64-71fa4f8ba615")
}
