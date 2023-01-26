# graphql
Sample Request:

//To add new recored

mutation {
  addUser(userInput: {
      name: "name"
      address: "Bangalore"
      phone: 1234567890
      age:34
      gender:"M"
	  dateOfBirth: "1996-11-10"
      cityId:1
      
  })
}

//To update existing recored.

mutation {
  updateUser(id: "35ab495c-e498-415c-9e11-a8d7905b88c4", userInput: {
    userId:"35ab495c-e498-415c-9e11-a8d7905b88c4"
      name: "name"
      address: "Bangalore"
      phone: 1234567890
      age:34
      gender:"M"
	    dateOfBirth: "1996-11-10"
      cityId:1
  })
}

//To Delete existing record

mutation {
  deleteUser(id: "35ab495c-e498-415c-9e11-a8d7905b88c4")
}

//To query by Id

query {
  userById(id: "35ab495c-e498-415c-9e11-a8d7905b88c4") {
    userId
    name
    address
    phone
    age
    gender
	dateOfBirth
        city {
      cityId
      cityName
    }
  }
}

//To get all records

 query {
  getAllUsers {
    userId
    name
    address
    phone
    age
    gender
	dateOfBirth
        city {
      cityId
      cityName
    }
  }
}
