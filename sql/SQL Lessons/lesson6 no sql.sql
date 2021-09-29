use vk

db.users.insert({"id":20, "firstname": "A", "lastname":"B","email":"AB@mail.uk","phone":8897654567, "company":{"name":"Microsoft","age": 25, languages: ["english", "spanish"]}})


-- output:

-- WriteResult({ "nInserted" : 1 })
---------------------------------------------------------------------

db.users.update({firstname : "A", lastname: "B"}, {$set: {email : BA@mail.uk}})

-- output:

-- WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
---------------------------------------------------------------------

db.users.find ({email: {$regex:".+\\.uk"}})

-- output:

-- { "_id" : ObjectId("5f0580502c7b0d5148d4c05c"), "id" : 5, "firstname" : "Dahlia", "lastname" : "Terry", "email" : "ultrices@egetlaoreet.co.uk", "password_hash" : "92766418", "phone" : 8980219305 }

-- { "_id" : ObjectId("5f0580502c7b0d5148d4c05e"), "id" : 7, "firstname" : "Drew", "lastname" : "Curtis", "email" : "vel.mauris.Integer@ametconsectetuer.co.uk", "password_hash" : "53188007", "phone" : 8998830705 }

-- { "_id" : ObjectId("5f07ff4eb23ab741be6fccf5"), "id" : 20, "firstname" : "A", "lastname" : "B", "email" : "BA@mail.uk", "phone" : 8897654567, "company" : { "name" : "Microsoft", "age" : 25, "languages" : [ "english", "spanish" ] } }
---------------------------------------------------------------------

db.users.find ({company: {$exists:true}})

-- output:

-- { "_id" : ObjectId("5f07ff4eb23ab741be6fccf5"), "id" : 20, "firstname" : "A", "lastname" : "B", "email" : "BA@mail.uk", "phone" : 8897654567, "company" : { "name" : "Microsoft", "age" : 25, "languages" : [ "english", "spanish" ] } }
---------------------------------------------------------------------

db.users.find ({id: {$eq:20}})

-- output:

-- { "_id" : ObjectId("5f07ff4eb23ab741be6fccf5"), "id" : 20, "firstname" : "A", "lastname" : "B", "email" : "BA@mail.uk", "phone" : 8897654567, "company" : { "name" : "Microsoft", "age" : 25, "languages" : [ "english", "spanish" ] } }
---------------------------------------------------------------------

db.users.update({lastname : "B"}, {$unset: {company: 1}})

-- output:

-- WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 }) 
---------------------------------------------------------------------
