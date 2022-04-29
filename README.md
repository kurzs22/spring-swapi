# Spring : Consommer une API avec WebClient

## Challenge
## Star Wars API
Fork the following repository: https://github.com/WildCodeSchool/spring-swapi.

You are taking over the development of a Star Wars fan site in order to add features to it. Currently, it is possible to search for a character by its identifier.

The API used is accessible at this address: https://swapi.dev/.

You can already test the site and see how it all works.

Your mission is to add the search for planets by identifier. For example, the API url for planet 1 will be: https://swapi.dev/api/planets/1/.

The "/" at the end of the url is important!

## Validation criteria
- When calling the planet search form, the name and number of inhabitants of the planet appear correctly.
- The data is well fetched from the API.
- A conversion from JSON to Planet type has been performed.