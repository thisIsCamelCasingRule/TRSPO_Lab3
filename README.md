# TRSPO_Lab3 

## King Controller
- POST: http://localhost:8080/king/?name=&kingdom=
- GET: http://localhost:8080/king
- GET: http://localhost:8080/king/?name=
- PUT: http://localhost:8080/king/?name=&kingdom=
- DELETE: http://localhost:8080/king
- DELETE: http://localhost:8080/king/?name=

## Kingdom Controller
- POST: http://localhost:8080/kingdom/?name=&sqare=&population=&amountOfBuildings=
- GET: http://localhost:8080/kingdom
- GET: http://localhost:8080/kingdom/?name=
- PUT: http://localhost:8080/king/?name=&sqare=&population=&amountOfBuildings=
- DELETE: http://localhost:8080/kingdom
- DELETE: http://localhost:8080/kingdom/?name=

## Peasant Controller
- POST: http://localhost:8080/peasant/?name=&position=&kingdom=&status=
- GET: http://localhost:8080/peasant
- GET: http://localhost:8080/peasant/?name=
- PUT: http://localhost:8080/peasant/?name=&position=&kingdom=&status=
- DELETE: http://localhost:8080/peasant
- DELETE: http://localhost:8080/peasant/?name=

## Sentence Controller
- GET: http://localhost:8080/sentence/?peasant=&kingdom=
- GET: http://localhost:8080/sentence/?peasant=

## Rebeal Controller
- GET: http://localhost:8080/rebeal/?oldKing=&newKing=

## War Controller
- GET: http://localhost:8080/war/?kingdom1=&kingdom2=
