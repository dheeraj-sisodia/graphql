# graphql
Sample Request:

//To add new recored

mutation {
  addUser(userInput: {
      name: "name"
      address: "Bangalore"
      phone: "1234567890"
      age:34
      gender:"M"
	    dateOfBirth: "1996-11-10"
      cityId:1
      
  })
}

//To update existing recored.

mutation {
  updateUser(id: "1b1d7000-3bd9-4e1d-b6ff-a0799643acb9", userInput: {
    userId:"1b1d7000-3bd9-4e1d-b6ff-a0799643acb9"
      name: "name"
      address: "Bangalore"
      phone: "1234567890"
      age:34
      gender:"M"
	    dateOfBirth: "1996-11-10"
      cityId:1
  })
}

//To Delete existing record

mutation {
  deleteUser(id: "1b1d7000-3bd9-4e1d-b6ff-a0799643acb9")
}

//To query by Id

query {
  userById(id: "1b1d7000-3bd9-4e1d-b6ff-a0799643acb9") {
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
