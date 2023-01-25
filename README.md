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
      cityId:1
      
  })
}

//To update existing recored.

mutation {
  updateUser(id: "813fe2d3-1c28-4dc9-b835-3db50df72486", userInput: {
    userId:"6add3421-0179-4b5e-87fb-ec4c3f25b481"
      name: "name"
      address: "Bangalore"
      phone: "1234567890"
      age:34
      gender:"M"
      cityId:1
  })
}

//To Delete existing record

mutation {
  deleteUser(id: "813fe2d3-1c28-4dc9-b835-3db50df72486")
}

//To query by Id

 query {
  userById(id: "813fe2d3-1c28-4dc9-b835-3db50df72486") {
    userId
    name
    address
    phone
    age
    gender
        city {
      cityId
      cityName
    }
  }
}
