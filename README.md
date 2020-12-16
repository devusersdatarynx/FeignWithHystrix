FeignClientHystrixUserDemo
=====================================

create a schema  users_database in mysql database for SpringDataDemoUser 



SpringDataDemoUser  service provider 
======================================

post call 
http://localhost:9191/datademo/user

{
    "id": 101,
    "firstName": "pkjena",
    "lastName": "jena",
    "gender":"male",
    "address":"bbsr"
}

get call
===========
http://localhost:9191/datademo/userList

[
    {
        "id": 12,
        "firstName": "pkjena",
        "lastName": "jena",
        "gender": "male",
        "address": "bbsr"
    },
    {
        "id": 13,
        "firstName": "pkjena",
        "lastName": "jena",
        "gender": "male",
        "address": "bbsr"
    },
    {
        "id": 14,
        "firstName": "pkjena",
        "lastName": "jena",
        "gender": "male",
        "address": "bbsr"
    },
    {
        "id": 15,
        "firstName": "pkjena",
        "lastName": "jena",
        "gender": "male",
        "address": "bbsr"
    },
    {
        "id": 16,
        "firstName": "kishor",
        "lastName": "mohanty",
        "gender": "male",
        "address": "cuttack"
    }
]

get by id 
http://localhost:9191/datademo/user/12

{
    "id": 12,
    "firstName": "pkjena",
    "lastName": "jena",
    "gender": "male",
    "address": "bbsr"
}

delete 
http://localhost:9191/datademo/user/15

User  deleted with userId : 15

update
http://localhost:9191/datademo/updateAddress/16

{ 
    "firstName": "jyotika",
    "lastName": "rout",
    "gender": "female",
    "address": "bbsr"
}


using Feign

GET call 

http://localhost:8085/user/12

{
    "id": 12,
    "firstName": "pkjena",
    "lastName": "jena",
    "gender": "male",
    "address": "bbsr"
}


http://localhost:8085/userList

get  all  users 


post
http://localhost:8085/user

   {
        "id": 8876,
        "firstName": "rayguru",
        "lastName": "das",
        "gender": "male",
        "address": "hyderabad"
   }
	
{"id":17,"firstName":"rayguru","lastName":"das","gender":"male","address":"hyderabad"}	

delete request by Feign
============================
http://localhost:8085/user/16

User  deleted with userId : 16


after Hystrix fallback method
================================
http://localhost:8085/user/13
{
    "id": 13,
    "firstName": "pkjena",
    "lastName": "jena",
    "gender": "male",
    "address": "bbsr"
}

get call 
http://localhost:8085/user/16

Fallback error as the microservice is down.  because id is not exist 

delete 
http://localhost:8085/user/17


User  deleted with userId : 17
